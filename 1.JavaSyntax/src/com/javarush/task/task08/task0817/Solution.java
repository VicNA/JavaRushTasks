package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Familya" + (i + 1), (i % 4 == 0) ? "NameDuplicate" : "Name" + (i + 1));
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Set<String> set = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < map.values().toArray().length; i++) {
            for (int j = map.values().toArray().length - 1; j > i; j--) {
                if (map.values().toArray()[i].equals(map.values().toArray()[j])) {
                    counter++;
                    if (counter > 1) set.add(String.valueOf(map.values().toArray()[i]));
                }
            }
            counter = 0;
        }
        for (String name : set) {
            removeItemFromMapByValue(map, name);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
