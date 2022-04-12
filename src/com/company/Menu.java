package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu  {
    public Menu() {
        JFrame menu = new JFrame("Система тестирования ");
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setSize(1400, 800);
        menu.getContentPane();
        menu.setLayout(null);
        menu.setResizable(false);

        JLabel label = new JLabel("Тестовый контроль знаний");
        JButton startButton = new JButton("Начать тестирование");
        JButton infoButton = new JButton("Ознакомиться с материалом");

        label.setBounds(0, 200, 1400, 50);
        label.setFont(new Font("Monserat", Font.BOLD, 30));
        label.setHorizontalAlignment(JLabel.CENTER);
        startButton.setBounds(550, 350, 300, 50);
        infoButton.setBounds(550, 450, 300, 50);

        menu.add(label);
        menu.add(startButton);
        menu.add(infoButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quiz quiz = new Quiz();
                menu.hide();
            }
        });

        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Information info = new Information();
                menu.hide();
            }
        });

        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }
}
