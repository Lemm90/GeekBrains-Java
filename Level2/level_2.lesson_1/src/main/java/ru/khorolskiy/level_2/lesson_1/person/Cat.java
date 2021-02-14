package ru.khorolskiy.level_2.lesson_1.person;

public class Cat implements Activity {

    private int distanceRun;
    private float heightJump;
    private String name;

    public Cat(String name, int distanceRun, float heightJump){
        this.distanceRun = distanceRun;
        this.heightJump = heightJump;
    }


    @Override
    public void run() {

    }

    @Override
    public void jump() {

    }
}
