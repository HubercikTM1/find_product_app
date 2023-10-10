package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JLabel productLabel;
    private static JTextField productText;
    private static JButton findProductBtn;
    private static JLabel success;

    public void showGUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(250, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        productLabel = new JLabel("What product do you want to buy?");
        productLabel.setBounds(10,20, 250, 25);
        panel.add(productLabel);

        productText = new JTextField(30);
        productText.setBounds(20,50,165,25);
        panel.add(productText);

        findProductBtn = new JButton("Find product");
        findProductBtn.setBounds(30, 90, 110, 30);
        findProductBtn.addActionListener(new GUI());
        panel.add(findProductBtn);

        success = new JLabel("");
        success.setBounds(20, 120, 100, 30);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String product = productText.getText();

        if(product.isEmpty()){
            success.setText("Fill the gap!");
        } else {
            success.setText(product);
        }
    }
}
