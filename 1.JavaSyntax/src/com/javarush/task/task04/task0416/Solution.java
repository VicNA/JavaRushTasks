package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());

        if (t % 5 < 5 && t % 5 >= 4)
            System.out.println("красный");
        else if (t % 5 >= 3 && t % 5 < 4)
            System.out.println("жёлтый");
        else System.out.println("зелёный");
    }
}