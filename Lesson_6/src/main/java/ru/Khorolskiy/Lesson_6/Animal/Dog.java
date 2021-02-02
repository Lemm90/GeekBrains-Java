package ru.Khorolskiy.Lesson_6.Animal;

public class Dog extends Animal {
    public Dog (String name, int distanceRun, int distanceSwim) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        maxDistanceRun = 500;
        maxDistanceSwim = 10;
    }

   public void voice(){
       System.out.println(name+": gav-gav");
    }
}





