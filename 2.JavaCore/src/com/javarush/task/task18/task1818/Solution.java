package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.lang.reflect.Field;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream fos = new FileOutputStream(reader.readLine());
             FileInputStream fis1 = new FileInputStream(reader.readLine());
             FileInputStream fis2 = new FileInputStream(reader.readLine()))
        {
            int count;
            byte[] buffer = null;
            if ((count = fis1.available()) > 0) {
                buffer = new byte[count];
                fis1.read(buffer);
            }

            if (buffer != null) fos.write(buffer);

            if ((count = fis2.available()) > 0) {
                buffer = new byte[count];
                fis2.read(buffer);
            }

            if (buffer != null) fos.write(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
