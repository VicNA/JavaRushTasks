package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {

            int num, symb;
            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                for (String s : reader.readLine().split("\\s")) {
                    num = 0;
                    symb = 0;
                    for (char c : s.toCharArray()) {
                        if (Character.isDigit(c)) {
                            num++;
                            if (symb > 0) break;
                        } else {
                            symb++;
                            if (num > 0) break;
                        }
                    }

                    if (num > 0 && symb > 0) sb.append(s + " ");
                }
            }

            if (sb.length() > 0) writer.write(sb.toString().trim());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
