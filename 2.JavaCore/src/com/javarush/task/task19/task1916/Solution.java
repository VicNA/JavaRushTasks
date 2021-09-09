package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fr1 = new BufferedReader(new FileReader(reader.readLine()));
             BufferedReader fr2 = new BufferedReader(new FileReader(reader.readLine()))) {

            ArrayList<String> list1 = new ArrayList<>();
            ArrayList<String> list2 = new ArrayList<>();

            String line;
            while ((line = fr1.readLine()) != null) list1.add(line);
            while ((line = fr2.readLine()) != null) list2.add(line);

            int i, j;
            for (i = 0, j = 0; i < list1.size() && j < list2.size(); ) {
                if (list1.get(i).equals(list2.get(j))) {
                    lines.add(new LineItem(Type.SAME, list1.get(i)));
                    i++;
                    j++;
                } else if (list1.get(i + 1).equals(list2.get(j))) {
                    lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                    i++;
                } else if (list1.get(i).equals(list2.get(j + 1))) {
                    lines.add(new LineItem(Type.ADDED, list2.get(j)));
                    j++;
                }
            }
            if (i == list1.size()) {
                lines.add(new LineItem(Type.ADDED, list2.get(j)));
            } else if (j == list2.size()) {
                lines.add(new LineItem(Type.REMOVED, list1.get(i)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
