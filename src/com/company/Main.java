package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Menu menu = new Menu();
            }
        });
    }
}
