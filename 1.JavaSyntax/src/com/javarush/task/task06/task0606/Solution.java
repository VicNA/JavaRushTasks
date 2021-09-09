package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Math.abs(Integer.parseInt(reader.readLine()));
        reader.close();
        for (int i = 0; i < number.toString().length(); i++) {
            if (number.toString().charAt(i) % 2 == 0)
                Solution.even++;
            else
                Solution.odd++;
        }
        System.out.println("Even: " + Solution.even + " Odd: " + Solution.odd);
    }
}
