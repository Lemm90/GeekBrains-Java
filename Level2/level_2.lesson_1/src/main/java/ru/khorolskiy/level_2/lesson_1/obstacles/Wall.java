package ru.khorolskiy.level_2.lesson_1.obstacles;

import ru.khorolskiy.level_2.lesson_1.person.Activity;

public class Wall implements Obstacles{

    private int height;
    boolean busy;
    public int getHeight(){
        return height;
    }

    public Wall(int height){

        this.height = height;
        this.busy = false;
    }


    @Override
    public void takeHero(Activity activity) {
        activity.jump(height);

    }
}
