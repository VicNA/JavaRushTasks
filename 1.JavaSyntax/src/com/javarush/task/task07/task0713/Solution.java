package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> listMain = new ArrayList<>();
        ArrayList<Integer> listThee = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num;
        for (int i = 0; i < 20; i++) {
            num = Integer.parseInt(reader.readLine());
            listMain.add(num);
            if ((num % 3 == 0) || (num % 2 == 0)) {
                if (num % 3 == 0) listThee.add(num);
                if (num % 2 == 0) listTwo.add(num);
            } else listOther.add(num);
        }
        reader.close();

        printList(listThee);
        System.out.println();
        printList(listTwo);
        System.out.println();
        printList(listOther);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer num: list) System.out.println(num);
    }
}
