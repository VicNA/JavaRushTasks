package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(args[0])) {
            byte[] list = null;
            if (fis.available() > 0) {
                list = new byte[fis.available()];
                fis.read(list);
            }

            int count = 0;
            if (list != null) {
                for (byte b : list) {
                    if (b == ' ') count++;
                }
            }

            if (count > 0) {
                System.out.println(new BigDecimal((double) count / list.length * 100).setScale(2, RoundingMode.HALF_EVEN));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
