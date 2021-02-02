package ru.Khorolskiy.Lesson_5;

import java.lang.reflect.Array;

public class MainApp2 {

    public static void main(String[] args) {
        Worker[] workerArray = new Worker[5];
        workerArray[0] = new Worker("Gogi", "Boss", "bossRulit@mail.world", "81980010011", 5000000, 30);
        workerArray[1] = new Worker("Jon", "engineer", "JonJon@mail.kndr", "81984571233", 150000, 47);
        workerArray[2] = new Worker("Paul", "assistant", "PapaPaul@mail.gr", "8612741010", 30000, 18);
        workerArray[3] = new Worker("Piter", "Security guard", "champion@mail.com", "-", 850000, 55);
        workerArray[4] = new Worker("Rubi", "driver", "vrum-vrum@mail.ua", "89991547892", 60000, 39);


        for (int i = 0; i < workerArray.length; i++) {
            if (workerArray[i].getAge() > 40) {
                workerArray[i].info();
                System.out.println();
            }

        }

    }
}



