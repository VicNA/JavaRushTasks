package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        String num;
        int id;
        String name;
        do {
            num = reader.readLine();
            if (num.isEmpty()) break;
            id = Integer.parseInt(num);
            name = reader.readLine();
            map.put(name, id);
        } while (!name.isEmpty());

        for (Map.Entry<String, Integer> pair: map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
