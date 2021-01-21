package ru.Khorolkiy.Lesson_3;


import java.util.Random;
import java.util.Scanner;

public class MainApp {
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    static int[] numbersInLevels = {0, 11, 26, 51};
    static int level;

    static String[] words = {"apple", "orange", "lemon", "banana", "apricot",
            "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
            "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
            "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        guessTheNumber();
        guessTheNumberVersion2();
        guessTheWord();
    }

    public static void guessTheNumber() {
        int randomNumber = rand.nextInt(10);
        System.out.println("Здравствуйте! Попробуйте отгадать загаданное число! Загаданное число будет от 1 до 9");
        System.out.println("У вас есть 3 попытки");
        for (int i = 0; i < 3; i++) {
            int inputNumber = scanner.nextInt();
            if (inputNumber == randomNumber) {
                i += 3;
                System.out.println("Поздраляю! Ты крассавчик");

            } else if (inputNumber > randomNumber) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное больше");
            }
        }
        System.out.println("Повторить игру?");
        System.out.println("1. Да");
        System.out.println("2. Нет");
        int solutionInput = scanner.nextInt();
        while (solutionInput == 1) {
            guessTheNumber();
            break;
        }
    }

    public static void guessTheNumberVersion2() {
        System.out.println("Здравствуйте! Попробуйте отгадать число!");
        System.out.println("Но сначала выберете уровень:");
        System.out.println("1. Easy ");
        System.out.println("2. Normal ");
        System.out.println("3. Hard ");
        int levelSelection = scanner.nextInt();
        switch (levelSelection) {
            case 1:
                level = numbersInLevels[1];
                System.out.println("Вы выбрали уровень Easy! Вы в игре!");
                break;
            case 2:
                level = numbersInLevels[2];
                System.out.println("Вы выбрали уровень normal! Вы в игре!");
                break;
            case 3:
                level = numbersInLevels[3];
                System.out.println("Вы выбрали уровень Hard! Вы в игре!");
                break;
        }
        int randomNumber = rand.nextInt(level);
        System.out.println("Загаданное число будет от 1 до " + (level - 1));
        System.out.println("У вас есть 3 попытки");
        for (int i = 0; i < 3; i++) {
            int inputNumber = scanner.nextInt();
            if (inputNumber == randomNumber) {
                System.out.println("Поздраляю! Ты крассавчик");
                i += 3;
            } else if (inputNumber > randomNumber) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное больше");
            }
        }
        System.out.println("Повторить игру?");
        System.out.println("1. Да");
        System.out.println("2. Нет");
        int solutionInput = scanner.nextInt();
        while (solutionInput == 1) {
            guessTheNumberVersion2();
            break;
        }
    }
    /// Не смог до конца сделать задачу.
    public static void guessTheWord() {

        System.out.println("Здравствуйте! Это игра 'Угадай слово'. Ваша задача угадать фрукт который я загадал:");
        int randomWord = rand.nextInt(words.length);
        int randomChar = rand.nextInt(words[randomWord].length());
        for (int i = 0; i < words[randomWord].length(); i++) {
            /// Замена букв на "Х"
                    }
        System.out.println("Введите слово:");
        String inputWord = scanner.next();
        }
}



















