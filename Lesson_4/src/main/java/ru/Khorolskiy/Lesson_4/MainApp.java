package ru.Khorolskiy.Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    static char[][] map;

    static int[] line;
    static int[] column;

    static final int SIZE = 3;

    static final char DOT_PLAYER = 'X';
    static final char DOT_BOT = 'O';
    static final char FREE_PLACE = '_';

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        prepaerMap();
        printMap();

        while (true) {
            playerTurn();
            printMap();
            if (checkWin(DOT_PLAYER)) {
                System.out.println("Поздравляю! Вы победили!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            botTurn();
            printMap();
            if (checkWin(DOT_BOT)) {
                System.out.println("Победил Бот");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }

        System.out.println("Игра заверешена");

    }
//     0  1  2
// 0   x  x  x
// 1   x  x  x
// 2   x  x  x

    public static boolean checkWin(char dot) {
        for (int i = 0; i < SIZE; i++) {
            if (map[i][0] == dot && map[i][1] == dot && map[i][2] == dot) {
                return true;
            }
            for (int j = 0; j < SIZE; j++) {
                if (map[0][j] == dot && map[1][j] == dot && map[2][j] == dot) {
                    return true;
                }
                if (map[i][0] == dot && map[1][1] == dot && map[SIZE - 1 - i][2] == dot) {
                    return true;
                }
            }
        }
        return false;
//        if (map[0][0] == dot && map[0][1] == dot && map[0][2] == dot) {
//                return true;
//            }
//            if (map[1][0] == dot && map[1][1] == dot && map[1][2] == dot) {
//                return true;
//            }
//            if (map[2][0] == dot && map[2][1] == dot && map[2][2] == dot) {
//                return true;
//            }
//            if (map[0][0] == dot && map[1][0] == dot && map[2][0] == dot) {
//                return true;
//            }
//            if (map[0][1] == dot && map[1][1] == dot && map[2][1] == dot) {
//                return true;
//            }
//            if (map[0][2] == dot && map[1][2] == dot && map[2][2] == dot) {
//                return true;
//            }
//            if (map[0][0] == dot && map[1][1] == dot && map[2][2] == dot) {
//                return true;
//            }
//            if (map[0][2] == dot && map[1][1] == dot && map[2][0] == dot) {
//                return true;
//            }
//            return false;
    }

    public static boolean isMapFull(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == FREE_PLACE){
                    return false;
                };
            }
        }
        return true;
    }



    public static void prepaerMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = FREE_PLACE;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Ваш ход! Введите координаты в формате X 'пробел' Y ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        map[x][y] = DOT_PLAYER;
    }
    public static void botTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        map[x][y] = DOT_BOT;
        System.out.printf("Ход ИИ: [%d, %d]\n", x+1, y+1);
    }

        public static boolean isCellEmpty(int x, int y) {
            if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
                return false;
            }
            if (map[x][y] == FREE_PLACE) {
                return true;
            }
            return false;
        }

    }




