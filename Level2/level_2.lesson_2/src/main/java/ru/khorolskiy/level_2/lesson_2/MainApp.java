package ru.khorolskiy.level_2.lesson_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MainApp {


    public static void main(String[] args) {
        String[][] str = new String[][]{
                {"10", "20", "20", "10"},
                {"30", "100", "50", "5"},
                {"15", "101", "4", "-8"},
                {"17", "117", "9", "-10"}

        };
        try {
            try {
                stringToNumber(str);
            } catch (MyArraySizeException e) {
                System.out.println("Ошибочка вышла. Массив должен быть размером 4х4");
            }
        }
        catch (MyArrayDataException e){
            System.out.println("Не корретно заполнен массив в ячейке: " + e.getIndex() + " - " + e.getVelue());
        }
        System.out.println(stringToNumber(str));
    }



    public static int stringToNumber (String[][] str) throws MyArrayDataException, MyArraySizeException {
        int number = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str.length != 4 || str[j].length != 4) {
                    throw new  MyArraySizeException("Ошибочка вышла. Массив должен быть размером 4х4") {
                    };
                }
                try {
                    number = number + Integer.parseInt(str[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return number;
    }
}








