package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            TreeMap<String, Double> map = new TreeMap<>();
            String[] str;
            String s;
            double d;
            while (reader.ready()) {
                str = reader.readLine().split("\\s");
                s = str[0];
                d = Double.parseDouble(str[1]);
                map.merge(s, d, Double::sum);
            }

            map.forEach((k, v) -> System.out.println(k + " " + v));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
