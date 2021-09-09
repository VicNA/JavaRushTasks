package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine());
             FileOutputStream fos = new FileOutputStream(reader.readLine())) {

            byte[] buffer = new byte[0];
            if (fis.available() > 0) {
                buffer = new byte[fis.available()];
                fis.read(buffer);
            }

            if (buffer != null) {
                for (int i = buffer.length - 1; i > -1; i--) fos.write(buffer[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
