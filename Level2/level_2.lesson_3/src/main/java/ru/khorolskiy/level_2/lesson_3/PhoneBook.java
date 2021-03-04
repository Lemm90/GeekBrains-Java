package ru.khorolskiy.level_2.lesson_3;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> directory;

    public PhoneBook() {

        this.directory = new HashMap<>();
    }

    private void add(String name, String number) {
        if (!directory.containsKey(name)) {
            directory.put(name, new HashSet<>());
        }
        directory.get(name).add(number);
    }

    private String get(String name) {
        if (!directory.containsKey(name)) {
            System.out.printf("%s не найден\n", name);
        }
        return String.valueOf(directory.get(name));
    }
}

