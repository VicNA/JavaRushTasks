package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(args[0])) {
            byte[] chars = null;

            if (fis.available() > 0) {
                chars = new byte[fis.available()];
                fis.read(chars);
            }

            int count = 0;
            if (chars != null) {
                for (byte num : chars) {
                    if ((num >= 'A' && num <= 'Z') || (num >= 'a' && num <= 'z')) count++;
                }
            }

            System.out.println(count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
