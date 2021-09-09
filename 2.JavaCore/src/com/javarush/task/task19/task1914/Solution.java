package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(console);

        String result = outputStream.toString().replaceAll("\r\n", "");
        String[] arr = result.split("\\s+");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        if (arr[1].equals("+")) {
            result += a + b;
        } else if (arr[1].equals("-")) {
            result += a - b;
        } else if (arr[1].equals("*")) {
            result += a * b;
        }

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

