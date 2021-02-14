package ru.khorolskiy.lesson_7;


public class MainApp {
    public static void main(String[] args) {
    Plate plate = new Plate(100);
    plate.info();
    Human human = new Human("Vasia");
    human.fillingPlate(plate);
    plate.info();
    plate.fullPlate();
    plate.info();
        //Сделал задание. Решил добавить человека, при создании которого будет определяться рандомное настроение
        //в зависимости от которого он будет насыпать еду в миску (мало, средне или мало).
        // в методе fullPlate класса Plate не переумножается максимальный объем миски на коэффициент зависимости от настроения человека.
        // Почему?
    Cat[] cat = new Cat[5];
        cat[0] = new Cat("Pirat", 10);
        cat[1] = new Cat("Vasia", 7);
        cat[2] = new Cat("Murzik", 15);
        cat[3] = new Cat("Leopold", 3);
        cat[4] = new Cat("Gav", 9);

        for (int i = 0; i < cat.length; i++) {

            cat[i].eat(plate);
            cat[i].info();
        }
    }


}










