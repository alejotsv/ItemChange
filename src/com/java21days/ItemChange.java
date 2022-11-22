package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemChange extends JFrame implements ItemListener {
    Dimension dim = new Dimension(400, 100);
    JPanel panel;
    ButtonGroup group = new ButtonGroup();

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
//        String text = getButtonText(itemEvent.getSource().toString());
        String text = ((JRadioButton)itemEvent.getItem()).getText();
        System.out.println(text);
        System.out.println(itemEvent.getStateChange());
    }

    void addButtons(JPanel panel, String[] buttons){
        for( String btn : buttons ){
            JRadioButton radioBtn = new JRadioButton(btn);
            radioBtn.addItemListener(this);
            this.group.add(radioBtn);
            panel.add(radioBtn);
        }
    }


}
