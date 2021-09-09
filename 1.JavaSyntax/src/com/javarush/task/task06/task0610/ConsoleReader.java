package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        return s;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        return Integer.parseInt(ConsoleReader.readString());
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        return Double.parseDouble(ConsoleReader.readString());
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        return Boolean.parseBoolean(ConsoleReader.readString());
    }

    public static void main(String[] args) throws Exception {

    }
}
