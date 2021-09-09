package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(args[0]))) {
            Map<Character, Integer> map = new TreeMap<>();
            while (bis.available() > 0) {
                map.merge((char) bis.read(), 1, (a, b) -> a + b);
            }

            map.forEach((k, v) -> System.out.println(k + " " + v));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
