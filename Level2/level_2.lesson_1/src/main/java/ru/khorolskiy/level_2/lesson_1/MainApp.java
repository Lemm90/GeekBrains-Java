package ru.khorolskiy.level_2.lesson_1;

import ru.khorolskiy.level_2.lesson_1.obstacles.*;
import ru.khorolskiy.level_2.lesson_1.person.*;

public class MainApp {
    public static void main(String[] args) {

        Activity[] act = new Activity[5];
        act[0] = new Cat("Пират", 500, 100);
        act[1] = new Human("Вася", 1000, 500);
        act[2] = new Robot("Цып", 4500, 900);
        act[3] = new Cat("Симба", 450, 250);
        act[4] = new Robot("Железяка", 2500, 1500);

        Obstacles[] obs = new Obstacles[6];
        obs[0] = new Treadmill(100);
        obs[1] = new Treadmill(1000);
        obs[2] = new Treadmill(2000);
        obs[3] = new Wall(50);
        obs[4] = new Wall(75);
        obs[5] = new Wall(125);


        for (Activity a : act) {
            for (Obstacles o : obs){
                o.takeHero(a);
                if(a.fortitude() == false) {
                    break;
                }
            }
        }
            
    }
}



