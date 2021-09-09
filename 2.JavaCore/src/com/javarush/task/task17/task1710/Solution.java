package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

        switch (args[0]) {
            case "-c":
                create(args);
                break;
            case "-u":
                update(args);
                break;
            case "-d":
                delete(args);
                break;
            case "-i":
                show(args);
                break;
        }
    }

    private static void create(String...args) {
        try {
            if (args[2].equals("м")) {
                allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3])));
            } else {
                allPeople.add(Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3])));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(allPeople.size() - 1);
    }

    private static void update(String...args) {
        Person person = allPeople.get(Integer.parseInt(args[1]));
        person.setName(args[2]);
        person.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
        try {
            person.setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(args[4]));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        allPeople.set(Integer.parseInt(args[1]), person);
    }

    private static void delete(String...args) {
        Person person = allPeople.get(Integer.parseInt(args[1]));
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);
        allPeople.set(Integer.parseInt(args[1]), person);
    }

    private static void show(String...args) {
        System.out.println(allPeople.get(Integer.parseInt(args[1])));
    }
}
