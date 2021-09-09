package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName;
            while ((fileName = reader.readLine()) != null && !fileName.isEmpty() && !fileName.equals("exit")) {
                new ReadThread(fileName).run();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) throws FileNotFoundException {
            //implement constructor body
            this.fileName = fileName;
        }

// implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            try (FileInputStream fis = new FileInputStream(fileName)) {
                byte[] arr = new byte[255];
                int count, index, mostIndex = 0, mostFreq = 1;
                while (fis.available() > 0) {
                    if ((count = ++arr[(index = fis.read())]) > mostFreq) {
                        mostFreq = count;
                        mostIndex = index;
                    };
                }

                resultMap.put(fileName, mostIndex);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
