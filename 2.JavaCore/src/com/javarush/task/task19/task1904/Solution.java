package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] data = fileScanner.nextLine().split(" ");
            String strDate = String.format("%s %s %s", data[3], data[4], data[5]);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            Date date = null;
            try {
                date = dateFormat.parse(strDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            return new Person(data[1], data[2], data[0], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
