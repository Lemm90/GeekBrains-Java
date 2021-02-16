package ru.khorolskiy.level_2.lesson_1.person;


public class Human implements Activity {
    private int distanceRun;
    private int heightJump;
    private String name;
    private boolean moral;


    public Human (String name,  int distanceRun, int heightJump) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.heightJump = heightJump;
        this.moral = true;
    }

    @Override
    public void run(int distance) {
        if(moral != false) {
            if (distanceRun >= distance) {
                System.out.printf("%s пробежал %d метров\n", name, distance);
            } else {
                System.out.printf("%s не смог столько пробежать и сидит отдыхает\n", name);
                moral = false;
            }
        } else {
            System.out.printf("%s слишком расстроен прошлым проигрышем, что бы бегать\n", name);

        }
    }

    @Override
    public void jump(int height) {
        if(moral != false) {
            if (heightJump >= height) {
                System.out.printf("%s прыгнул %d метров\n", name, height);
            } else {
                System.out.printf("%s не смог перепрыгнуть и сидит отдыхает\n", name);
                moral = false;
            }
        }
    }

    @Override
    public boolean fortitude() {
        return moral;
    }


}
