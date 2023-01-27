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

    private JButton buttonRechnen;

    private String operator;

    public Gui(String titel, String operator) {

        this.operator = operator;

        setTitle(titel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        setSize(250, 125);
        setResizable(false);

        initComponents();

        add(labelOperand1);
        add(labelOperand2);
        add(fieldOperand1);
        add(labelOperator);
        add(fieldOperand2);
        add(buttonRechnen);

        setLocationRelativeTo(null); // in the middle of screen
        setVisible(true);


    }

    private void initComponents(){
        labelOperand1 = new JLabel("1. Operand");
        labelOperand2 = new JLabel("2. Operand");
        labelOperator = new JLabel(operator);

        fieldOperand1 = new JTextField(8);
        fieldOperand2 = new JTextField(8);

        buttonRechnen = new JButton("Rechnen!");

        buttonRechnen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int operand1 = Integer.parseInt(fieldOperand1.getText());
                int operand2 = Integer.parseInt(fieldOperand2.getText());
                int ergebnis;
                if (operator.equals("+")) {
                    ergebnis = operand1 + operand2;
                } else if (operator.equals("-")) {
                    ergebnis = operand1 - operand2;
                } else if(operator.equals("*")) {
                    ergebnis = operand1 * operand2;
                } else if (operator.equals("/")) {
                    ergebnis = operand1 / operand2;
                } else {
                    ergebnis = Integer.MAX_VALUE;
                }
                JOptionPane.showMessageDialog(Gui.this, "Ergebnis : " + ergebnis, "Berechnet", JOptionPane.INFORMATION_MESSAGE);

                fieldOperand1.setText("");
                fieldOperand2.setText("");
            }
        });
    }

}
