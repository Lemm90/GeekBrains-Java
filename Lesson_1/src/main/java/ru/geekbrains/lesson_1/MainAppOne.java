package ru.geekbrains.lesson_1;

public class MainAppOne {

    // п.1 Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {
        System.out.println(result(45, 2, 16, 47));
        System.out.println(from10to20(4, 27));
        negativeOrPositive(10);
        System.out.println(trueOrFalse(15));
        System.out.println(hello("Петя"));
        intercalaryYear(440);

        // п.2 Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte a = 100;
        short b = 3000;
        int c = 10000;
        long d = 324566987;
        float e = 12.57f;
        double f = 37.256479;
        char g = '\u0040';
        boolean h = true;
    }

    // п.3 Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
      public static float result(float a, float b, float c, float d) {
        return a * (b + (c / d));
      }

    // п.4 Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    public static boolean from10to20(int a, int b) {
        int c = a + b;
        boolean sum = c >= 20 && c <= 30;
        return sum;
    }
    // п.5 Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void negativeOrPositive (int a){
        if (a >= 0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    // П.6 Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean trueOrFalse (int a){
      if (a >= 0){
           return true;
       } else {
           return false;
       }

        }

    // П.7 Написать метод, которому в качестве параметра передается строка,
    // обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        public static String hello (String name) {
            return ("Привет, " + name);
        }
    // п.8 *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void intercalaryYear (int year){
        int divideByFour = year % 4;
        int divideByHundred = year % 100;
        int divideByFourHundred = year % 400;
        String thrueYear = "Високосный год!";
        String falseYear = "Не високосный год!";
        String error = "Упс! Введите корректное число.";
        if (year > 0 && year < 100 && divideByFour == 0) {
            System.out.println(thrueYear);
        } else if (year >= 100 && divideByFour == 0 && divideByHundred != 0){
            System.out.println(thrueYear);
        } else if (year >= 400 && divideByFourHundred == 0){
            System.out.println(thrueYear);
        } else if (year <= 0){
            System.out.println(error);
        } else {
            System.out.println(falseYear);
        }

    }
}


