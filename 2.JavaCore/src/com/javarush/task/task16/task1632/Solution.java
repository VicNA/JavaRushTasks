package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new CutomThread1());
        threads.add(new CutomThread2());
        threads.add(new CutomThread3());
        threads.add(new CutomThread4());
        threads.add(new CutomThread5());
    }

    public static void main(String[] args) {
    }

    public static class CutomThread1 extends Thread {
        @Override
        public void run() {
            while (true) {}
        }
    }

    public static class CutomThread2 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(1);
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class CutomThread3 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class CutomThread4 extends Thread implements Message {
        private boolean isStopped;
        @Override
        public void run() {
            while (!isStopped) {}
        }

        @Override
        public void showWarning() {
            isStopped = true;
        }
    }

    public static class CutomThread5 extends Thread {
        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String s;
                int n = 0;
                while (!(s = reader.readLine()).equals("N")) {
                    n += Integer.parseInt(s);
                }
                System.out.println(n);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}