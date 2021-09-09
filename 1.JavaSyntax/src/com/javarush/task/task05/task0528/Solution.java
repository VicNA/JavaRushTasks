package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Calendar date = new GregorianCalendar(2019, Calendar.DECEMBER, 31);
        DateFormat df = new SimpleDateFormat("dd MM yyyy");
        System.out.println(df.format(date.getTime()));
    }
}
