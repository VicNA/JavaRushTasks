package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a >= 1 && a <= 999) {
            if ((a % 2) == 0)
                System.out.print("четное ");
            else
                System.out.print("нечетное ");

            if (String.valueOf(a).length() == 1) System.out.println("однозначное число");
            if (String.valueOf(a).length() == 2) System.out.println("двузначное число");
            if (String.valueOf(a).length() == 3) System.out.println("трехзначное число");
        }
    }
}
