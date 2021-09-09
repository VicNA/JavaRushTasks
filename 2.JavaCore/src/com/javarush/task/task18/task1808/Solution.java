package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine());
             FileOutputStream fos1 = new FileOutputStream(reader.readLine());
             FileOutputStream fos2 = new FileOutputStream(reader.readLine()))
        {
            byte[] buffer = new byte[0];
            int count = 0;
            if (fis.available() > 0) {
                buffer = new byte[fis.available()];
                count = fis.read(buffer);
            }

            int part = count / 2 + count % 2 ;

            fos1.write(buffer, 0, part);
            fos2.write(buffer, part, count - part);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
