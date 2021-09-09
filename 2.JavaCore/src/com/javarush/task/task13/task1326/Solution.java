package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())))) {
            ArrayList<Integer> list = new ArrayList<>();
            String num;
            while ((num = bf.readLine()) != null && !(num.isEmpty())) {
                list.add(Integer.parseInt(num));
            }

            Collections.sort(list);
            for (Integer n: list) {
                if (n % 2 == 0) System.out.println(n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
