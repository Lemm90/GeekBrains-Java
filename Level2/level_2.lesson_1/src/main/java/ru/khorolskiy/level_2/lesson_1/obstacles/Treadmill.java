package ru.khorolskiy.level_2.lesson_1.obstacles;

import ru.khorolskiy.level_2.lesson_1.person.Activity;

public class Treadmill implements Obstacles {
    private int length;
    boolean busy;

    public int getLength(){
        return length;
    }

    public Treadmill(int length){
        this.length = length;
        this.busy = false;
    }


    @Override
    public void takeHero(Activity activity) {
        activity.run(length);

    }
}
