package ru.Khorolskiy.Lesson_6.Animal;

public class Cat extends Animal {


    public Cat (String name, int distanceRun) {
        this.name = name;
        this.distanceRun = distanceRun;
        maxDistanceRun = 200;

    }

    @Override
    public void voice(){
        System.out.println(name + ": meow");
    }

    @Override
    public void Swim(){
        System.out.printf ("%s кот, он не умеет плавать =(\n", name);
    }

}







