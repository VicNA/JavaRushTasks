package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {

            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                for (String s : reader.readLine().split("\\s")) {
                    if (s.length() > 6) sb.append(s).append(",");
                }
            }

            if (sb.length() > 0 ) writer.write(sb.deleteCharAt(sb.length() - 1).toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
