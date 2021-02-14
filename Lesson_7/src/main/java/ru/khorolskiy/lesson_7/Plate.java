package ru.khorolskiy.lesson_7;

public class Plate {
   private int capacity;
   private float food;
   private float coefFilling;

    public float getFood() {
        return food;
    }

    public int getCapacity(){
        return capacity;
    }

    public Plate(int capacity) {
        this.capacity = capacity;

    }

    public void coef (Human human){

        if(human.getRandomMood() < 25 ){
            coefFilling = 0.25f;
        } else if (human.getRandomMood() > 25 && human.getRandomMood() <=50) {
            coefFilling = 0.50f;
        } else if (human.getRandomMood() > 50 && human.getRandomMood() <=100) {
            coefFilling = 1.0f;
        }
    }

    public void fullPlate (){
        food = capacity * coefFilling ;
    }

    public void decreaseFood(int amaunt){
        food -=amaunt;
    }

    public void info(){
        if(food == 0){
            System.out.println("Миска пуста");
        } else {
            System.out.println("Еды в тарелке: " + food + " / " + capacity);
        }
    }

}