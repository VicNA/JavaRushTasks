package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();

            try (BufferedReader br = new BufferedReader(new FileReader(fileName1));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2))) {
                String line;
                String str = "";
                boolean isDigit;
                while ((line = br.readLine()) != null) {
                    for (String s : line.split("\\s+")) {
                        isDigit = true;
                        for (int i = 0; i < s.length(); i++) {
                            if (!Character.isDigit(s.charAt(i))) {
                                isDigit = false;
                                break;
                            }
                        }

                        if (isDigit) str += s + " ";
                    }
                }

                if (str.length() > 0) bw.write(str.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
