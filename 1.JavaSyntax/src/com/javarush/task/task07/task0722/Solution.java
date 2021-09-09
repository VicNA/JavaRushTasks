package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        String s = "";
        for (; true;)
        {
            s = reader.readLine();
            if (s.equals("end"))
                break;
            else
                list.add(s);
        }
        reader.close();

        for (String str: list) System.out.println(str);
    }
}