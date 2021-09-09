package com.javarush.task.task03.task0322;

/* 
Большая и чистая
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String vasya = reader.readLine();
        String eva = reader.readLine();
        String angelica = reader.readLine();

        System.out.println(vasya + " + " + eva + " + " + angelica + " = Чистая любовь, да-да!" );
    }
}