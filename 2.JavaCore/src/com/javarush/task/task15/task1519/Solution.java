package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        int num;
        while ((string = reader.readLine()) != null && !(string.isEmpty()) && !(string.equals("exit"))) {
            try {
                if (string.indexOf(".") > -1) {
                    print(Double.valueOf(string));
                } else if ((num = Integer.parseInt(string)) > 0 && num < 128) {
                    print((short) num);
                } else if (num <= 0 || num >= 128) {
                    print(num);
                }
            } catch (NumberFormatException e) {
                print(string);
            }
        }

        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
