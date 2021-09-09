package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        int data, mostFreq = 1;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine())) {
            while (fis.available() > 0) {
                if (map.containsKey(data = fis.read())) {
                    map.put(data, map.get(data) + 1);
                    if (map.get(data) > mostFreq) mostFreq = map.get(data);
                } else {
                    map.put(data, 1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == mostFreq) System.out.print(entry.getKey() + " ");
        }
    }
}
