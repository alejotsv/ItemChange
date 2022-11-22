package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemChange extends JFrame implements ItemListener {
    Dimension dim = new Dimension(400, 100);
    JPanel panel;
    ButtonGroup group = new ButtonGroup();
    JLabel label;

    ItemChange(String title, String[] buttons){
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new JPanel();
        addButtons(panel, buttons);
        label = new JLabel("You think Argentina will win the World Cup");
        panel.add(label);
        FlowLayout flow = new FlowLayout();
        panel.setLayout(flow);
        add(panel);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if(itemEvent.getStateChange() == 1){
            String text = ((JRadioButton)itemEvent.getItem()).getText();
            label.setText("You think " + text + " will win the World Cup");
        }
    }

    void addButtons(JPanel panel, String[] buttons){
        int i = 0;
        for( String btn : buttons ){
            JRadioButton radioBtn;
            if (i==0){
                radioBtn = new JRadioButton(btn, true);
            } else {
                radioBtn = new JRadioButton(btn);
            }
            radioBtn.addItemListener(this);
            this.group.add(radioBtn);
            panel.add(radioBtn);
        }
    }


}
