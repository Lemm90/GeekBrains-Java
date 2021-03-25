package ru.khorolskiy.level3.lesson_1.part_2;

import java.util.ArrayList;

public class Box {
   private ArrayList<String> listOfFruits = new ArrayList<>();
   private String filling;
   private float itemWeight;

    public Box() {
        filling = null;
    }

    public void add(Fruit fruit) {
        if (filling == null || filling.equals(fruit.name)) {
            filling = fruit.name;
            itemWeight = fruit.weight;
            listOfFruits.add(fruit.name);
        }
    }

    public float getWeight() {
        float sum = listOfFruits.size() * itemWeight;
        return sum;
    }

    private boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void whatIsInside() {
        if (filling != null) {
            System.out.printf("Внутри коробки: %s (%d шт)\n", filling, listOfFruits.size());
            return;
        }
        System.out.println("Коробка пуста");
    }

    public void changeBox(Box box) {
        if (box.filling == null || box.filling.equals(this.filling)) {
            box.listOfFruits.addAll(listOfFruits);
            box.filling = box.listOfFruits.get(0);
            this.filling = null;
            this.listOfFruits.clear();
        } else System.out.println("Нарушение товарного соседства. Разные фрукты в разные ящики.");
    }
}



