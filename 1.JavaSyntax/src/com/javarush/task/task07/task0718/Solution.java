package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String s; int len = 0, ind = -1;
        for (int i = 0; i < 10; i++) {
            s = reader.readLine();
            list.add(s);
            if (s.length() > len)
                len = s.length();
            else if (ind == -1)
                ind = i;
        }
        reader.close();

        if (ind > -1) System.out.println(ind);
    }
}

