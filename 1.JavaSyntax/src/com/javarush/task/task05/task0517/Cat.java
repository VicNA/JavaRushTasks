package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age = 2;
    private int weight = 2;
    private String address;
    private String color = "gray";

    public Cat(String name)
    {
        this.name = name;
    }

    public Cat(String name, int weight, int age)
    {
        this(name);
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age)
    {
        this(name);
        this.age = age;
    }

    public Cat(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address)
    {
        this(weight, color);
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
