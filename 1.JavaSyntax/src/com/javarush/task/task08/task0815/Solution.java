package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Familia" + i, "Name" + (i % 3));
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int counter = 0;
        for (String value : map.values()) {
            if (value.equals(name)) counter++;
        }
        return counter;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int counter = 0;
        for (String key : map.keySet()) {
            if (key.equals(lastName)) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
    }
}
