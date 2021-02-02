package ru.Khorolskiy.Lesson_5;

public class Worker {
    private String name;
    private String position;
    private String email;
    private String telefon;
    private int salary;
    private int age;

    public int getAge(){
        return age;
    }


    public Worker(String name, String position, String email, String telefon, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telefon = telefon;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
        System.out.printf("Имя: %s, Должность: %s, Электронная почта: %s, Телефон: %s, Зарплата: %d руб., Возраст: %d лет\n ", name, position, email, telefon, salary, age);
    }



}

