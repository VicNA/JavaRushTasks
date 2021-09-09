package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int strMin = Integer.MAX_VALUE, strMax = 0; String str = null;
        for (int i = 0; i < 10; i++) {
            str = reader.readLine();
            list.add(str);
            if (strMax < str.length()) strMax = str.length();
            if (strMin > str.length()) strMin = str.length();
        }
        reader.close();

        for (String s : list) {
            if (s.length() == strMax || s.length() == strMin) {
                System.out.println(s);
                break;
            }
        }
    }
}
