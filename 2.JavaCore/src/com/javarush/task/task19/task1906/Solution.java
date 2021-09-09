package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();

            try (FileReader fileReader = new FileReader(fileName1);
                 FileWriter fileWriter = new FileWriter(fileName2)) {
                int data, i = 1;
                while (fileReader.ready()) {
                    data = fileReader.read();
                    if (i++ % 2 == 0) fileWriter.write(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
