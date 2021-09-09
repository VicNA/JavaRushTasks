package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int len = 0; String str = "";
        for (int i = 0; i < 5; i++) {
            str = reader.readLine();
            strings.add(str);
            if (str.length() >= len) len = str.length();
        }
        reader.close();

        for (String s: strings) {
            if (len == s.length()) System.out.println(s);
        }
    }
}
