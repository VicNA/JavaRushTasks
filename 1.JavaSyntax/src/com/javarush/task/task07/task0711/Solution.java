package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) list.add(reader.readLine());
        reader.close();

        for (int i = 0; i < 13; i++) {
            list.add(0, list.remove(list.size() - 1));
            /*String tmp = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, tmp);*/
        }

        for (String str: list) {
            System.out.println(str);
        }
    }
}
