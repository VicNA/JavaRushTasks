package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        int[] arr = {5, 2, 4, 7, 0};
        for (int i = 0; i < 5; i++) {
            int[] numbers = new int[arr[i]];
            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = (int) (Math.random() * 20) + 1;
            }
            list.add(numbers);
        }
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
