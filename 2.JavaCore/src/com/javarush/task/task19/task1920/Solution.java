package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            TreeMap<String, Double> map = new TreeMap<>();
            String[] str;
            String s = null;
            double d;
            while (reader.ready()) {
                str = reader.readLine().split("\\s");
                s = str[0];
                d = Double.parseDouble(str[1]);
                map.merge(s, d, Double::sum);
            }

            double max = Double.MIN_VALUE;
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                if (entry.getValue() > max) max = entry.getValue();
            }

            for (Map.Entry<String, Double> entry : map.entrySet()) {
                if (entry.getValue().equals(max)) System.out.println(entry.getKey());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
