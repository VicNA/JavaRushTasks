package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader br = new BufferedReader(new FileReader(reader.readLine()))) {

            StringBuilder sb = new StringBuilder();
            while (br.ready()) sb.append(br.readLine());

            if (sb.toString().length() > 0) {
                String openTag = "<" + args[0];
                String closeTag = "</" + args[0] + ">";
                Queue<Integer> queue = new LinkedList<>();
                Stack<Integer> stack = new Stack<>();
                ArrayList<String> list = new ArrayList<>();

                for (int i = 0; i < sb.toString().length(); i++) {
                    if (sb.toString().substring(i).startsWith(openTag + " ")
                            || sb.toString().substring(i).startsWith(openTag + ">")) queue.add(i);
                    if (sb.toString().substring(i).startsWith(closeTag)) stack.push(i + closeTag.length());

                    if (queue.size() == stack.size()) {
                        while (!queue.isEmpty() && !stack.isEmpty()) {
                            list.add(sb.toString().substring(queue.poll(), stack.pop()));
                        }
                    }
                }

                list.forEach(System.out::println);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
