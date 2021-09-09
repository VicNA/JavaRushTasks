package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        if (maximum > 0) {
            int tmp = Integer.MIN_VALUE;
            for (int i = 0; i < maximum; i++) {
                tmp = Integer.max(tmp, Integer.parseInt(reader.readLine()));
            }
            System.out.println(tmp);
        }
        reader.close();

    }
}
