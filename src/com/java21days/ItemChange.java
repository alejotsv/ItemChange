package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemChange extends JFrame implements ItemListener {
    Dimension dim = new Dimension(300, 300);
    JLabel label;

    ItemChange(String title){
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        setVisible(true);
    }



    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        System.out.println("Item changed");
    }
}
