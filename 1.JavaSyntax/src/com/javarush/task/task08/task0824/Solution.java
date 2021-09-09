package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("child1", true, 18);
        Human child2 = new Human("child2", false, 14);
        Human child3 = new Human("child3", false, 10);
        ArrayList<Human> children = new ArrayList<>(Arrays.asList(child1, child2, child3));

        Human papa = new Human("papa", true, 40, children);
        Human mama = new Human("mama", false, 38, children);

        Human grandpa1 = new Human("grandpa1", true, 65, papa);
        Human grandpa2 = new Human("grandpa2", true, 60, mama);
        Human grandma1 = new Human("grandma1", true, 62, papa);
        Human grandma2 = new Human("grandma2", true, 58, mama);

        System.out.println(grandpa1.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandpa2.toString());
        System.out.println(grandma2.toString());
        System.out.println(papa.toString());
        System.out.println(mama.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this(name, sex, age);
            this.children.addAll(children);
        }

        public Human(String name, boolean sex, int age, Human child) {
            this(name, sex, age);
            this.children.add(child);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
