package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String[] s;
            while (reader.ready()){
                s = reader.readLine().split("\\s");
                if (s.length == 4) PEOPLE.add(new Person(s[0],
                        new SimpleDateFormat("dd MM yyyy").parse(String.format("%s %s %s", s[1], s[2], s[3]))));
                if (s.length == 5) PEOPLE.add(new Person(s[0] + " " + s[1],
                        new SimpleDateFormat("dd MM yyyy").parse(String.format("%s %s %s", s[2], s[3], s[4]))));
                if (s.length == 6) PEOPLE.add(new Person(s[0] + " " + s[1] + " " + s[2],
                        new SimpleDateFormat("dd MM yyyy").parse(String.format("%s %s %s", s[3], s[4], s[5]))));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
