package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine())) {
            if (fileReader.ready()) {
                char[] cbuf = new char[Character.MAX_VALUE];
                fileReader.read(cbuf);
                String str = new String(cbuf);

                int count = 0;
                for (String s : str.split("\\W+")) {
                    if (s.equals("world")) count++;
                }

                System.out.println(count);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
