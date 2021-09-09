package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());

        if (age % 400 == 0 || (age % 100 > 0 && age % 4 == 0))
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");
    }
}