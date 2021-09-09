package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int counter = 1, maxCounter = 1, number;
        for (int i = 0; i < 10; i++) {
            number = Integer.parseInt(reader.readLine());
            list.add(number);
            if (list.size() > 1) {
                if (number == list.get(i - 1)) {
                    counter++;
                    if (counter > maxCounter) maxCounter = counter;
                } else counter = 1;
            }
        }
        reader.close();
        System.out.println(maxCounter);
    }
}