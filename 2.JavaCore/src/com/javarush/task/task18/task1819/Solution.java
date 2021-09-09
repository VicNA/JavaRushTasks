package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();

            try (FileInputStream fis1 = new FileInputStream(fileName1);
                 FileInputStream fis2 = new FileInputStream(fileName2)) {

                int count;
                byte[] buf1 = null;
                if ((count = fis1.available()) > 0) {
                    buf1 = new byte[count];
                    fis1.read(buf1);
                }

                byte[] buf2 = null;
                if ((count = fis2.available()) > 0) {
                    buf2 = new byte[count];
                    fis2.read(buf2);
                }

                try (FileOutputStream fos = new FileOutputStream(fileName1)) {
                    byte[] buf3 = null;
                    if (buf2 != null && buf1 != null) {
                        buf3 = new byte[buf2.length + buf1.length];
                        System.arraycopy(buf2, 0, buf3, 0, buf2.length);
                        System.arraycopy(buf1, 0, buf3, buf2.length, buf1.length);
                        fos.write(buf3);
                    } else if (buf2 != null) {
                        fos.write(buf2);
                    } else {
                        fos.write(buf1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
