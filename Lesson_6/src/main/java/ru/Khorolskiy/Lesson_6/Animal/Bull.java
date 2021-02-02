package ru.Khorolskiy.Lesson_6.Animal;

public class Bull extends Animal {

    public Bull(String name, int distanceRun, int distanceSwim) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        maxDistanceSwim = 7;
        maxDistanceRun = 30;

    }
    @Override
    public void voice(){
        System.out.println(name + ": moo-moo-moo");
    }
}
