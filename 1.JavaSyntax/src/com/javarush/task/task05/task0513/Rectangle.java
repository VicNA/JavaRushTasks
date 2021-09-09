package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int top, int left)
    {
        this.top = top;
        this.left = left;
    }

    public void initialize(int top, int left, int width)
    {
        initialize(top, left);
        this.width = width;
        this.height = width;
    }

    public void initialize(int top, int left, int width, int height)
    {
        initialize(top, left, width);
        this.height = height;
    }

    public void initialize(Rectangle rect)
    {
        initialize(rect.top, rect.left, rect.width, rect.height);
    }

    public static void main(String[] args) {

    }
}
