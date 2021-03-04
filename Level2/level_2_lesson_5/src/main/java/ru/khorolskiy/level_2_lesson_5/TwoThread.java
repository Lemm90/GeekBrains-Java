package ru.khorolskiy.level_2_lesson_5;

public class TwoThread implements Runnable{
    @Override
    public void run() {
        float[] arr = new float[MainApp.SIZE];
        float[] arr2 = new float[MainApp.SIZE / 2];
        float[] arr3 = new float[MainApp.SIZE / 2];
        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr2, 0, MainApp.SIZE / 2);
        System.arraycopy(arr, MainApp.SIZE / 2, arr3, 0, MainApp.SIZE / 2);

    }
}
