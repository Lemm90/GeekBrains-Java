package ru.khorolskiy.lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Window extends JFrame {
      public static int velue;
      private Game game;

    public Window() {
        this.setTitle("Угадай число");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 400, 400);
        this.game = new Game();
        this.add(game);
        game.createNumber();


        //начало верхней панели
        JPanel topPanel = new JPanel(new GridLayout(4, 1, 5,5));
        this.add(topPanel, BorderLayout.NORTH);
        JLabel text = new JLabel("        Ваша задача угадать загаданное число от 0 до "+ game.MAX_NUMBER);
        JTextField enterNumber = new JTextField();
        JTextArea history = new JTextArea();

        topPanel.add(text);//
        topPanel.add(enterNumber);
        topPanel.add(history);

        history.setText("История ввода чисел: ");
        history.setForeground(Color.lightGray);

        //конец верхней панели

        //начало средней панели
        JPanel midPanel = new JPanel(new GridLayout(1, 2, 5,50));
        this.add(midPanel, BorderLayout.CENTER);
        JLabel textResult = new JLabel("                 Результат:");
        midPanel.add(textResult);
        JTextField result = new JTextField();
        midPanel.add(result);
        //конец средней панели

        //начало нижней панели
        JPanel bottomPanel = new JPanel();
        this.add(bottomPanel, BorderLayout.SOUTH);
        JButton check = new JButton("Проверка");
        check.setForeground(Color.BLUE);
        JButton newGame = new JButton("Новая игра");
        newGame.setForeground(Color.GREEN);
        JButton exit = new JButton("Выход");
        exit.setForeground(Color.RED);
        bottomPanel.add(check);
        bottomPanel.add(newGame);
        bottomPanel.add(exit);
        //конец нижней панели

        //начало слушателей
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                velue = Integer.parseInt(enterNumber.getText());
                game.checkNumber();
                result.setText(game.getOutput());
                history.append(enterNumber.getText() + "; ");
                enterNumber.setText("");
                if (game.getIndex() == 1) {
                    history.setText("Верно! Загаданное число: " + velue);
                    history.setForeground(Color.MAGENTA);
                }
            }
        });

        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.createNumber();
                result.setText("Новая игра");
                enterNumber.setText("");
                history.setText("История ввода чисел: ");
                history.setForeground(Color.LIGHT_GRAY);
            }
        });

        //конец слушателей
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Window();
    }
}
