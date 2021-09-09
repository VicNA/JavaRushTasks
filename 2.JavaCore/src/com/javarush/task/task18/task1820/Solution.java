package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedInputStream bis = new BufferedInputStream(new FileInputStream(reader.readLine()));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(reader.readLine())))
        {
            int count;
            byte[] buffer = null;
            if ((count = bis.available()) > 0) {
                buffer = new byte[count];
                bis.read(buffer);
            }

            String line = "";
            if (buffer != null) {
                for (String str : new String(buffer).split(" ")) {
                    line += Math.round(Double.parseDouble(str)) + " ";
                }
                bos.write(line.trim().getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
