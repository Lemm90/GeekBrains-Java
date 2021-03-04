package ru.khorolskiy.level_2.lesson_3;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {
        fruit();
    }

    public static void fruit() {

        String[] fruit = {"orange", "apple", "mango", "peach", "banana", "banana", "coconut", "apricot", "Avocado", "papaya", "pineapple", "grape", "mango", "apricot", "apple", "apple"};

        List allFruit = new ArrayList(Arrays.asList(fruit));
        System.out.println(allFruit);
        System.out.println("_______");

        Set sortFruit = new LinkedHashSet(Arrays.asList(fruit));
        System.out.println(sortFruit);
        System.out.println("_______");

        for(String o : fruit) {
            String sort = o + " : " + Collections.frequency(allFruit, o) + "; ";
            System.out.print(sort);
        }
    }
}
