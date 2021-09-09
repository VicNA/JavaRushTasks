package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        ArrayList<Human> familly = new ArrayList<>();
        familly.add(new Human("dedushka1", true, 60));
        familly.add(new Human("dedushka2", true, 62));
        familly.add(new Human("babushka1", false, 55));
        familly.add(new Human("babushka2", false, 57));
        familly.add(new Human("father", true, 35, familly.get(0), familly.get(2)));
        familly.add(new Human("mother", false, 32, familly.get(1), familly.get(3)));
        familly.add(new Human("child1", true, 15, familly.get(4), familly.get(5)));
        familly.add(new Human("child2", true, 12, familly.get(4), familly.get(5)));
        familly.add(new Human("child3", false, 7, familly.get(4), familly.get(5)));

        for (Human famillyMember : familly) System.out.println(famillyMember.toString());
    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;
        
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}