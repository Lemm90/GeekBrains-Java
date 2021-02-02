package ru.Khorolskiy.Lesson_6;

import ru.Khorolskiy.Lesson_6.Animal.Animal;
import ru.Khorolskiy.Lesson_6.Animal.Bull;
import ru.Khorolskiy.Lesson_6.Animal.Cat;
import ru.Khorolskiy.Lesson_6.Animal.Dog;

public class MainApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Вася", 150);
        cat.Swim();
        cat.Run();
        cat.voice();
        Dog dog = new Dog("Полкан", 499, 505);
        dog.Swim();
        dog.Run();
        Bull bull = new Bull("Сема", 7, 4);
        bull.Run();
        bull.Swim();
        bull.voice();

        }

    }
