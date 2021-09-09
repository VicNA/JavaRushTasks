package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader br = new BufferedReader(new FileReader(reader.readLine()))) {

            Integer num;
            while (br.ready()) {
                StringBuilder sb = new StringBuilder();
                for (String s : br.readLine().split("\\s")) {
                    try {
                        num = Integer.parseInt(s);
                        sb.append(map.getOrDefault(num, s)).append(" ");
                    } catch (NumberFormatException e) {
                        sb.append(s).append(" ");
                    }
                }

                System.out.println(sb.toString().trim());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
