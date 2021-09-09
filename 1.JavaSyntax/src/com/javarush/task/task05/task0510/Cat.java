package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age = 2;
    private int weight = 2;
    private String address;
    private String color = "gray";

    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name, int weight, int age)
    {
        initialize(name);
        this.weight = weight;
        this.age = age;
    }

    public void initialize(String name, int age)
    {
        initialize(name);
        this.age = age;
    }

    public void initialize(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address)
    {
        initialize(weight, color);
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
