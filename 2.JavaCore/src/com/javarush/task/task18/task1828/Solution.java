package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.Arrays;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();

            StringBuffer sb = new StringBuffer();
            if (args.length > 0) {
                if (args[0].equals("-u")) {
                    try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                        String line;
                        while ((line = fileReader.readLine()) != null) {
                            line = line.startsWith(args[1]) ? String.format(
                                    Locale.ENGLISH,"%1$-8d%2$-30s%3$-8.2f%4$-4d",
                                    Integer.parseInt(args[1]), args[2], Double.parseDouble(args[3]), Integer.parseInt(args[4]))
                                    : line;
                            sb.append(line).append("\n");
                        }
                    }

                    try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {
                        fileWriter.write(sb.toString());
                    }
                } else if (args[0].equals("-d")) {
                    try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                        String line;
                        while ((line = fileReader.readLine()) != null) {
                            if (!line.startsWith(args[1])) sb.append(line).append("\n");
                        }
                    }

                    try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {
                        fileWriter.write(sb.toString());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
