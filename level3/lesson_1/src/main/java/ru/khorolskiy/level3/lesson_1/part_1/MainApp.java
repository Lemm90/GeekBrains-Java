package ru.khorolskiy.level3.lesson_1.part_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static String[] arr = {"h", "o", "l", "l", "e", " ", "j", "a", "v", "a" };
    public static Integer[] arr2 = {1,24,33,4,58,66,70};
    public static void main(String[] args) {
        relocationOfElements(arr, 1, 4);
        relocationOfElements(arr2, 2, 6);
        arrayInList(arr);
        arrayInList(arr2);
    }

    public static <T> void relocationOfElements(T[] array, int oneElement, int twoElement) {
            try {
            T variable = array[twoElement];
            array[twoElement] = array[oneElement];
            array[oneElement] = variable;
            System.out.println(Arrays.toString(array));
        } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Будте по внимательней в выборе индекса");
            }
    }

    public static <T> void arrayInList (T[] array){
        List<T> transformedArray = new ArrayList<T>(Arrays.asList(array));
    }

}








