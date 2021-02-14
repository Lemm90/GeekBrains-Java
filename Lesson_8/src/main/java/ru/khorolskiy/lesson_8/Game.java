package ru.khorolskiy.lesson_8;

import javax.swing.*;
import java.util.Random;



public class Game extends JPanel {

        private int randomNumber;
        private int index = 0;
        private String output;
        final int  MAX_NUMBER = 100;
        private int inputNumber;

        public String getOutput(){
            return output;
        }
        public int getIndex(){ return index;}


        public void createNumber(){
           Random random = new Random();
           randomNumber  = random.nextInt(MAX_NUMBER + 1);

           repaint();
        }

        public void checkNumber() {

            inputNumber = Window.velue;
            if (inputNumber == randomNumber) {
                index = 1;
            } else if (inputNumber > randomNumber) {
                index = 2;
            } else if(inputNumber < randomNumber) {
                index = 3;
            }
            switch (index) {
                case 0 -> output = "Новая игра";
                case 1 -> output = "Вы угадали";
                case 2 -> output = "Загаданное чило меньше";
                case 3 -> output = "Загаданное чило больше";
            }
        }

}


