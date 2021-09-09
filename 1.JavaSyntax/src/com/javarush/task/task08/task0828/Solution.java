package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Calendar calendar = new GregorianCalendar();
        Map<String, Integer> map = calendar.getDisplayNames(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mounth = reader.readLine();

        System.out.println(mounth + " is the " + (map.get(mounth) + 1) + " month");
    }
}
