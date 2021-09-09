package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader file = new BufferedReader(new FileReader(reader.readLine()))) {

            String s;
            while ((s = file.readLine()) != null && !s.isEmpty()) {
                if (s.split(" ")[0].equals(args[0])) System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
