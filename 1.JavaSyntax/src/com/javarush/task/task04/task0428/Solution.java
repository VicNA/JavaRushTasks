package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int cnt = counter(a);
        cnt = cnt + counter(b);
        cnt = cnt + counter(c);

        System.out.println(cnt);

        reader.close();
    }

    public static int counter(int chislo) {
        if (chislo > 0)
            return 1;
        else
            return 0;
    }
}
