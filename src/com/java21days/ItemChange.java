package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemChange extends JFrame implements ItemListener {
    Dimension dim = new Dimension(400, 100);
    JPanel panel;

    ItemChange(String title, String[] buttons){
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        addButtons(panel, buttons);
        FlowLayout flow = new FlowLayout();
        panel.setLayout(flow);
        add(panel);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        System.out.println("Item changed");
    }

    void addButtons(JPanel panel, String[] buttons){
        ButtonGroup group = new ButtonGroup();
        for( String btn : buttons ){
            System.out.println(btn);
            JRadioButton radioBtn = new JRadioButton(btn);
            group.add(radioBtn);
            panel.add(radioBtn);
        }
    }


}
