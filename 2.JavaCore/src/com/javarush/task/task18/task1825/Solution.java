package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName;
            ArrayList<String> list = new ArrayList<>();
            while ((fileName = reader.readLine()) != null && !fileName.isEmpty() && !fileName.endsWith("end")) {
                list.add(fileName);
            }

            Collections.sort(list);

            fileName = list.get(0).replaceAll(".part[0-9]+", "");
            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName))) {
                for (String s : list) {
                    try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(s))) {
                        if (bis.available() > 0) {
                            byte[] buffer = new byte[bis.available()];
                            bis.read(buffer);
                            bos.write(buffer);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
