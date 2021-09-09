package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, i = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1) break;
            sum += number;
            i++;
        }
        reader.close();
        System.out.println((double) sum / i);
    }
}

