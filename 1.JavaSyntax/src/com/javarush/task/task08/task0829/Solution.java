package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        String city, family;
        while (true) {
            city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            family = reader.readLine();

            map.put(city, family);
        }

        family = reader.readLine();
        reader.close();

        System.out.println(map.get(family));
    }
}
