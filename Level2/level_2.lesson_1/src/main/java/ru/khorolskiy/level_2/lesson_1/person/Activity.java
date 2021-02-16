package ru.khorolskiy.level_2.lesson_1.person;

import ru.khorolskiy.level_2.lesson_1.obstacles.Treadmill;
import ru.khorolskiy.level_2.lesson_1.obstacles.Wall;

public interface Activity {
    void run(int distance);
    void jump(int height);
    boolean fortitude();

}
