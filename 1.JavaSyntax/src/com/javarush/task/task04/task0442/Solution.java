package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true)
        {
            int number = Integer.parseInt(reader.readLine());
            sum += number;
            if (number == -1) break;
        }
        System.out.println(sum);
        reader.close();
    }
}
