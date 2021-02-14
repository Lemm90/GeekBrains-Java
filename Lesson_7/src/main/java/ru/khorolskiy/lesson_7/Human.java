package ru.khorolskiy.lesson_7;

import java.util.Random;

public class Human {
    private String name;
    private int randomMood;

    public int getRandomMood(){
        return randomMood;
    }

    private Random rand = new Random(101);


    public Human(String name) {
        this.name = name;
        this.randomMood = rand.nextInt();
    }

        public void fillingPlate(Plate o) {
            o.fullPlate();
        }

}

