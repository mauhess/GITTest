package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame{

    private JLabel labelOperand1;
    private JLabel labelOperand2;
    private JLabel labelOperator;
    private JTextField fieldOperand1;
    private JTextField fieldOperand2;

    private JButton buttonAdd;
    private JButton buttonSub;
    private JButton buttonMul;
    private JButton buttonDiv;


    public Gui(String titel) {


        setTitle(titel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        setSize(250, 125);
        setResizable(false);

        initComponents();

        add(labelOperand1);
        add(labelOperand2);
        add(fieldOperand1);
        //add(labelOperator);
        add(fieldOperand2);
        add(buttonAdd);
        add(buttonSub);
        add(buttonMul);
        add(buttonDiv);

        setLocationRelativeTo(null); // in the middle of screen
        setVisible(true);


    }

    private void initComponents(){
        labelOperand1 = new JLabel("1. Operand");
        labelOperand2 = new JLabel("2. Operand");

        fieldOperand1 = new JTextField(8);
        fieldOperand2 = new JTextField(8);

        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonMul = new JButton("*");
        buttonDiv = new JButton("/");
        buttonAdd.setPreferredSize(new Dimension(50,20));
        buttonSub.setPreferredSize(new Dimension(50,20));
        buttonMul.setPreferredSize(new Dimension(50,20));
        buttonDiv.setPreferredSize(new Dimension(50,20));


        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int operand1 = Integer.parseInt(fieldOperand1.getText());
                int operand2 = Integer.parseInt(fieldOperand2.getText());
                int ergebnis = operand1 + operand2;
                JOptionPane.showMessageDialog(Gui.this, "Ergebnis : " + ergebnis, "Berechnet", JOptionPane.INFORMATION_MESSAGE);

                fieldOperand1.setText("");
                fieldOperand2.setText("");
            }
        });

        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int operand1 = Integer.parseInt(fieldOperand1.getText());
                int operand2 = Integer.parseInt(fieldOperand2.getText());
                int ergebnis = operand1 - operand2;
                JOptionPane.showMessageDialog(Gui.this, "Ergebnis : " + ergebnis, "Berechnet", JOptionPane.INFORMATION_MESSAGE);

                fieldOperand1.setText("");
                fieldOperand2.setText("");

            }
        });

        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int operand1 = Integer.parseInt(fieldOperand1.getText());
                int operand2 = Integer.parseInt(fieldOperand2.getText());
                int ergebnis = operand1 * operand2;
                JOptionPane.showMessageDialog(Gui.this, "Ergebnis : " + ergebnis, "Berechnet", JOptionPane.INFORMATION_MESSAGE);

                fieldOperand1.setText("");
                fieldOperand2.setText("");
            }
        });

        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float operand1 = Integer.parseInt(fieldOperand1.getText());
                float operand2 = Integer.parseInt(fieldOperand2.getText());
                float ergebnis = operand1 / operand2;
                JOptionPane.showMessageDialog(Gui.this, "Ergebnis : " + ergebnis, "Berechnet", JOptionPane.INFORMATION_MESSAGE);

                fieldOperand1.setText("");
                fieldOperand2.setText("");
            }
        });
    }

}
