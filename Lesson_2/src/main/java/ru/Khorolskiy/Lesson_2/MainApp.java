package ru.Khorolskiy.Lesson_2;

import java.util.Arrays;
public class MainApp {

    public static void main(String[] args) {
    changingAnArray();
        System.out.println();
    fillingArrey();
        System.out.println();
    increaseInTheNumbers();
        System.out.println();
    square();
        System.out.println();
    minMax();
    }

//адать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void changingAnArray () {
        int [] initialArray = {1, 1, 0, 0, 1, 0};
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] == 1) {
                initialArray [i] = 0;
            } else {
                initialArray [i] = 1;
            }
        }
        System.out.println(Arrays.toString(initialArray));

    }

    public static void fillingArrey() {
    // п.2 Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
            int[] emptyArray = new int[8];
        for (int i = 0; i < 8; i ++) {
            emptyArray [i] = i*3;
            }
            System.out.println(Arrays.toString(emptyArray));
    }


// п.3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
// пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void increaseInTheNumbers (){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
        }

// п.4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами
// (можно только одну из диагоналей, если обе сложно).
    public static void  square () {
        int [] [] arr2d = new int [5] [5];
        arr2d [0] [0] = 1;
        arr2d [1] [1] = 1;
        arr2d [2] [2] = 1;
        arr2d [3] [3] = 1;
        arr2d [4] [4] = 1;
        arr2d [0] [4] = 1;
        arr2d [1] [3] = 1;
        arr2d [3] [1] = 1;
        arr2d [4] [0] = 1;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d.length; j++) {
                System.out.print(arr2d [i] [j] + " ");
            }
                        System.out.println();
        }

        }
// ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void minMax (){
        int [] arr = {8,7,15,3,65,23,7,2,67,34};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i] ) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println( "Max: " + max);
        System.out.println("Min: " + min);

    }
//** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    public static boolean sum (){
        int [] myArr = new int[];

    }
    }








