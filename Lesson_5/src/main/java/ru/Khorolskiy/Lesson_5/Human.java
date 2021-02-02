package ru.Khorolskiy.Lesson_5;

public class Human {
   String humanName;
   private int age;
   private int growth;
   private int weight;


    public String getHumanName() {
        return humanName;
    }

    public int getAge() {
        return age;
    }

    public int getGrowth() {
        return growth;
    }

    public int getWeight() {
        return weight;
    }

    public Human(String name, int age, int growth, int weight){
        this.humanName = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
    }

    public void pickUpFireExtinguisher(FireExtinguisher fireExtinguisher){
        System.out.printf("%s , берет в руки огнетушитель марки %s \n", humanName, fireExtinguisher.getName());
    }

    public void putOut (FireExtinguisher fireExtinguisher) {
        fireExtinguisher.push();
        System.out.printf("Чека выдернута, крючок нажат! Пожар потушен, %s мастер своего дела\n", humanName);
    }


    }
