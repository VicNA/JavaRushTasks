package com.javarush.task.task07.task0707;

import java.util.ArrayList;
import java.util.Random;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) list.add(generateString());

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static String generateString() {
        int left = 97, right = 122, stringLength = 10;
        Random random = new Random();

        String string = random.ints(left, right + 1)
                .limit(stringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return string;
    }
}
