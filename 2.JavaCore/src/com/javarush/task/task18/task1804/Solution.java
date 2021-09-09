package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
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
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine())) {
            while (fis.available() > 0) {
                map.merge(fis.read(), 1, (a, b) -> a + b);
            }
        }

        int mostFreq = Collections.min(map.values());
        map.forEach((k, v) -> {if (v == mostFreq) System.out.print(k + " ");});
    }
}
