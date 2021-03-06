package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine())) {
            while (fis.available() > 0) {
                if (((char) fis.read()) == ',') count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(count);
    }
}
