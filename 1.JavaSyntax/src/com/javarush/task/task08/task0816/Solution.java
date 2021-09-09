package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Сталлоне2", dateFormat.parse("MAY 2 2012"));
        map.put("Сталлоне3", dateFormat.parse("AUGUST 3 2012"));
        map.put("Сталлоне4", dateFormat.parse("MAY 4 2012"));
        map.put("Сталлоне5", dateFormat.parse("MAY 5 2012"));
        map.put("Сталлоне6", dateFormat.parse("JULY 1 2012"));
        map.put("Сталлоне7", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("MAY 8 2012"));
        map.put("Сталлоне9", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталлоне10", dateFormat.parse("MAY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        int mounth;
        while (iterator.hasNext()) {
            mounth = iterator.next().getValue().getMonth();
            if (mounth == 5 || mounth == 6 || mounth == 7 ) iterator.remove();
        }
    }

    public static void main(String[] args) throws ParseException {
    }
}
