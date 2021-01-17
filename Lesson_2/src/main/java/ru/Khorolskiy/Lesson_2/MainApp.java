package ru.Khorolskiy.Lesson_2;

import java.util.Arrays;
public class MainApp {

    public static void main(String[] args) {
    changingAnArray();
    fillingArrey();
    increaseInTheNumbers();
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
       // System.out.println(Arrays.toString(arr));



        }



        //System.out.println(Arrays.toString(arr));



