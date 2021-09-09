package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private char sex;
        private boolean hasChildren;
        private int weight;
        private int height;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, char sex) {
            this(name);
            this.sex = sex == 'M' || sex == 'W' ? sex : 'N';
        }

        public Human(String name, char sex, int age) {
            this(name, sex);
            this.age = age;
        }

        public Human(String name, char sex, int age, boolean hasChildren) {
            this(name, sex, age);
            this.hasChildren = hasChildren;
        }

        public Human(String name, char sex, int age, boolean hasChildren, int weight) {
            this(name, sex, age, hasChildren);
            this.weight = weight;
        }

        public Human(String name, char sex, int age, boolean hasChildren, int weight, int height) {
            this(name, sex, age, hasChildren, weight);
            this.height = height;
        }

        public Human(String name, char sex, int age, int weight, int height) {
            this(name, sex, age);
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, char sex, int weight, int height) {
            this(name, sex);
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, char sex, boolean hasChildren) {
            this(name, sex);
            this.hasChildren = hasChildren;
        }

        public Human(String name, char sex, int age, int height, boolean hasChildren) {
            this(name, sex, age, hasChildren);
            this.height = height;
        }
    }
}
