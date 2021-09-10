package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setBirthDate(new SimpleDateFormat("dd.MM.yyyy").parse("14.09.1995"));
            System.out.println(new SimpleDateFormat("ddMMyyyyHmsS").format(user.getBirthDate()));
            user.setCountry(User.Country.RUSSIA);
            user.setFirstName("Дмитрий");
            user.setLastName("Николаев");
            user.setMale(true);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(loadedObject.users.get(0).getBirthDate().getTime());
            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            if (users.size() > 0) {
                PrintWriter pw = new PrintWriter(outputStream);
                StringBuilder sb = new StringBuilder();
                for (User user : users) {
                    sb.append(user.getFirstName()).append("/");
                    sb.append(user.getLastName()).append("/");
                    sb.append(user.getBirthDate().getTime()).append("/");
                    sb.append(user.getCountry().getDisplayName()).append("/");
                    sb.append(user.isMale());
                    pw.println(sb);
                }
                pw.flush();
                pw.close();
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String str;
            while ((str = br.readLine()) != null) {
                String[] arr = str.split("/");
                User user = new User();
                user.setFirstName(arr[0]);
                user.setLastName(arr[1]);
                user.setBirthDate(new Date(Long.parseLong(arr[2])));
                user.setCountry(User.Country.valueOf(arr[3].toUpperCase()));
                user.setMale(Boolean.parseBoolean(arr[4]));
                users.add(user);
            }
            br.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
