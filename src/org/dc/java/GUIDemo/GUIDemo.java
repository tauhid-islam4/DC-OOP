package org.dc.java.GUIDemo;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;


public class GUIDemo implements ActionListener {


    private static JTextField firstNumText;
    private static JTextField secondNumText;

    private static JButton submitButton;
    private static JButton exitButton;


    public static void main (String[] args) {
        //Set up JFrame and JPanel
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBackground(new Color(240, 240, 240
        ));
        frame.setBounds(400, 250, 500, 300);

        panel.setBackground(new Color(175, 238, 238, 238));
        panel.setBounds(70, 125, 180, 75);
        frame.add(panel);
        panel.setLayout(null);


        // add in form elements here
        // TITLE LABEL
        JLabel titleLabel = new JLabel("My First Form!");
        // set position and size
        titleLabel.setBounds(80, 20, 200, 50);
        // set font and size
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        // add to the panel
        panel.add(titleLabel);
        JLabel firstLabel = new JLabel();

        firstLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        firstLabel.setVisible(true);
        firstLabel.setText("First Label");
        firstLabel.setBounds(30, 70, 100, 50);
        panel.add(firstLabel);

        firstNumText = new JTextField(20);
        // set position
        firstNumText.setBounds(140, 70,100,40);
        // add to the panel
        panel.add(firstNumText);


        JLabel secondLabel = new JLabel();
        secondLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        secondLabel.setVisible(true);
        secondLabel.setText("Second Label");
        secondLabel.setBounds(30, 120, 100, 50);
        panel.add(secondLabel);

        secondNumText = new JTextField(20);
        secondNumText.setBounds(140, 120, 100, 40);
        panel.add(secondNumText);


        submitButton = new JButton("Submit");
        submitButton.setToolTipText("Click to submit");
        submitButton.setBounds(90,200, 80, 40);
        submitButton.setBackground(new Color(150, 150, 150));
        submitButton.addActionListener(new GUIDemo());
        panel.add(submitButton);

        exitButton = new JButton("Exit");
        exitButton.setToolTipText("Click to exit");
        exitButton.setBounds(210,200, 80, 40);
        exitButton.setBackground(new Color(150, 150, 150));
        exitButton.addActionListener(new GUIDemo());
        panel.add(exitButton);

        frame.setVisible(true);

    }

    private boolean isNumeric(String string) {

        try {
            double number = Double.parseDouble(string);
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double firstNum = 0.0d;
        double secondNum = 0.0d;
        double sum = 0.0d;
        boolean isError = false;

        if (e.getSource()==submitButton) {
            if(firstNumText.getText()==null || firstNumText.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "First number cannot be empty", "Error",JOptionPane.WARNING_MESSAGE );
                isError = true;
            } else if (!isNumeric(firstNumText.getText())) {
                JOptionPane.showMessageDialog(null, "First number has to be numeric", "Error",JOptionPane.WARNING_MESSAGE );
                isError = true;
            } else {
                firstNum = Double.parseDouble(firstNumText.getText());
            }

            if(secondNumText.getText()==null || secondNumText.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Second number cannot be empty", "Error",JOptionPane.WARNING_MESSAGE );
                isError = true;
            } else if (!isNumeric(secondNumText.getText())) {
                JOptionPane.showMessageDialog(null, "Second number has to be numeric", "Error",JOptionPane.WARNING_MESSAGE );
                isError = true;
            } else {
                secondNum = Double.parseDouble(secondNumText.getText());
            }


            if (!isError) {
                sum = firstNum+secondNum;
                JOptionPane.showMessageDialog(null, "The sum of the 2 numbers is "+ sum, "Result",JOptionPane.INFORMATION_MESSAGE);
            }

        } else if (e.getSource()==exitButton) {
            System.exit(0);
        }

    }
}
