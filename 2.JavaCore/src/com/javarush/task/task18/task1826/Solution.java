package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(args[1]);
             FileOutputStream fos = new FileOutputStream(args[2])) {
            byte[] buffer = null;
            int count;

            if ((count = fis.available()) > 0) {
                buffer = new byte[count];
                fis.read(buffer);
            }

            if (args[0].equals("-e") && buffer != null) {
                for (byte b : buffer) {
                    fos.write(b + 1);
                }
            } else if (args[0].equals("-d") && buffer != null) {
                for (byte b : buffer) {
                    fos.write(b - 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
