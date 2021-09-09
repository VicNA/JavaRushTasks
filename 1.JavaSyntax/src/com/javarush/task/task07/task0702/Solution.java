package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];
        for (int i = 0; i < strings.length - 2; i++) {
            strings[i] = reader.readLine();
        }
        reader.close();

        for (int i = strings.length - 1; i > -1; i--) {
            System.out.println(strings[i]);
        }
    }
}