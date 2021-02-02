package ru.Khorolskiy.Lesson_5;

public class FireExtinguisher {              // огнетушитель
    private String name;                     // наименование огнетушителя
    private String extinguishingAgent;       // вид огнетушащего вещества
    private float weightExtinguishingAgent;  // вес огнетушащего вещества
    private float weight;                    // вес огнетушителя
    private int daysBeforeRecharge;          // осталось дней до перезарядки
    private boolean efficiency;              // работоспособность
    private float cefWeight;                 // кэф


    public String getName() {
        return name;
    }

    public String getExtinguishingAgent() {
        return extinguishingAgent;
    }

    public float getWeightExtinguishingAgent() {
        return weightExtinguishingAgent;
    }

    public float getWeight() {
        return weight;
    }

    public FireExtinguisher(String name, String extinguishingAgent, float weight) {
        this.name = name;
        this.extinguishingAgent = extinguishingAgent;
        this.weight = weight; // вес огнетушителя
        this.cefWeight = 0.85f; // кэф
        this.weightExtinguishingAgent = weight * cefWeight;
        this.daysBeforeRecharge = 1826;
        this.efficiency = true;

    }


    public void push() {
         weight -= weightExtinguishingAgent ;
        efficiency = false;
        daysBeforeRecharge = 0;
        }

    public void state() {
        if (efficiency) {
            System.out.println("Огнетушитель заряжен, вес:" + weight + "кг");
        } else {
            System.out.println("Огнетушитель разряжен, вес:" + weight + "кг");
        }
    }


public void info(){

        System.out.printf("Имя: %s Тушащее вещество: %s, Вес: %sкг, Осталось до презарядки: %s дней\n", name, extinguishingAgent, weight, daysBeforeRecharge);
    }


    public static void main(String[] args) {

    }
}
