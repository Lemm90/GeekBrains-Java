package ru.Khorolskiy.Lesson_5;

public class MainApp {
    public static void main(String[] args) {
        FireExtinguisher fireExtinguisher = new FireExtinguisher("ОП-2", "Порошок", 3.800f);
        Human human1 = new Human("Вася", 23,180, 70);
        fireExtinguisher.info();
        human1.pickUpFireExtinguisher(fireExtinguisher);
        human1.putOut(fireExtinguisher);
        fireExtinguisher.state();





    }
}
