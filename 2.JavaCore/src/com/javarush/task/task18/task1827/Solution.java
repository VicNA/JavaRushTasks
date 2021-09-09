package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int maxId = 0;
            String fileName;
            try (BufferedReader reader1 = new BufferedReader(new FileReader(fileName = reader.readLine()))) {
                String id;
                int tempId;
                while ((id = reader1.readLine()) != null && !id.isEmpty()) {
                    if ((tempId = Integer.parseInt(id.substring(0, 8).trim())) > maxId) maxId = tempId;
                }
            }

            if (args.length > 0 && args[0].equals("-c")) {
                String productName = args[1].length() > 30 ? args[1].substring(0, 30) : args[1];
                double price = args[2].length() > 8 ? Double.parseDouble(args[2].substring(0, 8)) : Double.parseDouble(args[2]);
                int quantity = args[3].length() > 4 ? Integer.parseInt(args[3].substring(0, 4)) : Integer.parseInt(args[3]);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                    if (maxId > 0) writer.newLine();
                    writer.write(String.format(Locale.ENGLISH, "%1$-8d%2$-30s%3$-8.2f%4$-4d", ++maxId, productName, price, quantity));
                }
            }
        }
    }
}
