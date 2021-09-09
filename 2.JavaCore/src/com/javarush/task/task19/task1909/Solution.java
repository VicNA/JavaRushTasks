package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();

            try (BufferedReader br = new BufferedReader(new FileReader(fileName1));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2))) {
                StringBuffer sb = new StringBuffer();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line.replaceAll("\\.", "!")).append("\n");
                }

                if (sb.length() > 0) bw.write(sb.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
