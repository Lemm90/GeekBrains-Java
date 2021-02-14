package ru.khorolskiy.lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hangry;

    public int getAppetite(){
         return appetite;
    }

    public Cat (String name, int appetite){
    this.name = name;
    this.appetite = appetite;
    hangry = false;
    }

    public void eat (Plate p) {
        if(p.getFood() > getAppetite()) {
            p.decreaseFood(appetite);
            hangry = true;
        }
    }

    public void info(){
        System.out.println(hangry);
    }
}




