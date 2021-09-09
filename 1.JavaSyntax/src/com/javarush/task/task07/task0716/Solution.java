package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> tmpList = new ArrayList<>();
        for (String s: strings) {
            tmpList.add(s);
            if (s.indexOf('л') > -1 && s.indexOf('р') == -1)
                tmpList.add(s);
            else if (s.indexOf('р') > -1 && s.indexOf('л') ==-1)
                tmpList.remove(s);
        }
        return tmpList;
    }
}