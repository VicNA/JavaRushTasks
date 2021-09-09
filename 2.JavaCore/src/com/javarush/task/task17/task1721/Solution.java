package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader readerAll = new BufferedReader(new FileReader(reader.readLine()));
             BufferedReader readerRemove = new BufferedReader(new FileReader(reader.readLine()))) {
            while (readerAll.ready()) {
                allLines.add(readerAll.readLine());
            }

            while (readerRemove.ready()) {
                forRemoveLines.add(readerRemove.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Solution().joinData();
    }
    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            for (String str : forRemoveLines) {
                allLines.remove(str);
            }
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
