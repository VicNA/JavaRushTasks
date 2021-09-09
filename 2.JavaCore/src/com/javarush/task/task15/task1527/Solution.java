package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            URL url = new URL(reader.readLine());
            String[] strings = url.getQuery().split("&");
            String nameParam = "";
            List<String> list = new ArrayList<>();
            for (String s: strings) {
                if (s.contains("=")) {
                    nameParam += " " + s.substring(0, s.indexOf('='));
                    if (s.contains("obj")) {
                        list.add(s.substring(s.indexOf('=') + 1));
                    }
                } else {
                    nameParam += " " + s;
                }
            }

            System.out.printf(nameParam.trim() + "\n");
            for (String s : list) {
                try {
                    alert(Double.valueOf(s));
                } catch (NumberFormatException e) {
                    alert(s);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
