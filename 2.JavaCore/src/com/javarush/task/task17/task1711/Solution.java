package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    create(args);
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    update(args);
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    delete(args);
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    show(args);
                    break;
                }
        }
    }

    private static void create(String...args) {
        for (int i = 1; i < args.length; i += 3) {
            try {
                if (args[i + 1].equals("м")) {
                    allPeople.add(Person.createMale(args[i], new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2])));
                } else {
                    allPeople.add(Person.createFemale(args[i], new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2])));
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(allPeople.size() - 1);
        }
    }

    private static void update(String...args) {
        for (int i = 1; i < args.length; i += 4) {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            person.setName(args[i + 1]);
            person.setSex(args[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
            try {
                person.setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 3]));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            allPeople.set(Integer.parseInt(args[i]), person);
        }
    }

    private static void delete(String...args) {
        for (int i = 1; i < args.length; i++) {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
            allPeople.set(Integer.parseInt(args[i]), person);
        }
    }

    private static synchronized void show(String...args) {
        for (int i = 1; i < args.length; i++) {
            System.out.println(allPeople.get(Integer.parseInt(args[i])));
        }
    }
}
