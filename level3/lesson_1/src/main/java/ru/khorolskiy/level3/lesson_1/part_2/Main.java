package ru.khorolskiy.level3.lesson_1.part_2;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        Box box4 = new Box();

        for (int i = 0; i < 10; i++) {
            box1.add(apple);
        }
        box1.whatIsInside();

        for (int i = 0; i < 14; i++) {
            box2.add(orange);
        }
        box2.whatIsInside();
        for (int i = 0; i < 7; i++) {
            box3.add(orange);
        }
        box3.changeBox(box4);
        box3.whatIsInside();
        box4.whatIsInside();
        box4.changeBox(box1);
    }
}
