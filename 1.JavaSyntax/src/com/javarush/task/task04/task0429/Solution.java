package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int pos = positiveNumber(a);
        pos = pos + positiveNumber(b);
        pos = pos + positiveNumber(c);

        int neg = negativeNumber(a);
        neg = neg + negativeNumber(c);
        neg = neg + negativeNumber(b);

        System.out.println("количество отрицательных чисел: " + neg);
        System.out.println("количество положительных чисел: " + pos);

        reader.close();
    }

    public static int positiveNumber(int number) {
        if (number > 0)
            return 1;
        else
            return 0;
    }

    public static int negativeNumber(int number) {
        if (number < 0)
            return 1;
        else
            return 0;
    }
}
