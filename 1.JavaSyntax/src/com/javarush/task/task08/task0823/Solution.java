package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        String result = "";
        for (String s : string.split(" ")) {
            if (!(s == null || s.isEmpty())) {
                s = (s.substring(0, 1).toUpperCase() + s.substring(1));
                result += " " + s;
            }
        }
        System.out.println(result.trim());
    }
}
