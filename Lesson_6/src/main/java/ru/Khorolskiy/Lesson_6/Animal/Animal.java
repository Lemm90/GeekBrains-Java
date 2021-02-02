package ru.Khorolskiy.Lesson_6.Animal;

public abstract class Animal {
    String name;
    int distanceRun;
    int distanceSwim;
    int maxDistanceRun;
    int maxDistanceSwim;


    public void Run() {
        if (distanceRun > 0 && distanceRun <= maxDistanceRun) {
            System.out.printf("%s пробежал %d метров\n", name, distanceRun);
        } else {
            System.out.printf("%s не может столько пройти =(\n", name);
        }
    }

    public void Swim() {
        if (distanceSwim > 0 && distanceSwim <= maxDistanceSwim) {
            System.out.printf("%s проплыл %d метров\n", name, distanceSwim);
        } else {
            System.out.printf("%s не может столько проплыть =(\n", name);
        }

    }
        public abstract void voice();

}


