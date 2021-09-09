package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int top;
    private int left;
    private int width = 0;
    private int height = 0;

    public Rectangle(int top, int left)
    {
        this.top = top;
        this.left = left;
    }

    public Rectangle(int top, int left, int width)
    {
        this(top, left);
        this.width = width;
    }

    public Rectangle(int left, int top, int width, int height)
    {
        this(top, left, width);
        this.height = height;
    }

    public Rectangle(Rectangle rectangle)
    {
        this(rectangle.top, rectangle.left, rectangle.width, rectangle.height);
    }

    public static void main(String[] args) {

    }
}
