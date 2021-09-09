package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        int[] num1 = new int[10];
        int[] num2 = new int[10];
        num1 = Arrays.copyOf(numbers, 10);
        num2 = Arrays.copyOfRange(numbers, 10, 20);
        for (int i = 0; i < 10; i++) {
            System.out.println(num2[i]);
        }
    }
}
