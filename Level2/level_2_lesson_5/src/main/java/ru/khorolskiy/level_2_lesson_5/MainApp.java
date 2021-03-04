package ru.khorolskiy.level_2_lesson_5;

public class MainApp {

    public static int SIZE = 10000000;

    public static void main(String[] args) {
        oneThread();
        twoThread();
    }

    public static void oneThread() {
        float[] arr = new float[SIZE];
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            System.currentTimeMillis();
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void twoThread() {
        float[] arr = new float[SIZE];
        float[] arr2 = new float[SIZE / 2];
        float[] arr3 = new float[SIZE / 2];

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr2, 0, SIZE / 2);
        System.arraycopy(arr, SIZE / 2, arr3, 0, SIZE / 2);

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 1;
            arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arr3.length; i++) {
                    arr3[i] = 1;
                    arr3[i] = (float) (arr3[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        t.start();

        System.arraycopy(arr2, 0, arr, 0, SIZE / 2);
        System.arraycopy(arr3, 0, arr, SIZE / 2, SIZE / 2);

        System.currentTimeMillis();

        System.out.println(System.currentTimeMillis() - a);
    }
}








