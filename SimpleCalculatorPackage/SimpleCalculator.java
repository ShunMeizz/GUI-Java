package SimpleCalculatorPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JButton btnCompute;

    private JPanel panel;
    private JTextField lblResult;

    SimpleCalculator(){

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(tfNumber1.getText());
                int num2 = Integer.parseInt(tfNumber2.getText());
                if(cbOperations.getSelectedIndex()==0){
                    lblResult.setText(String.valueOf(num1+num2));
                }
                if(cbOperations.getSelectedIndex()==1){
                    lblResult.setText(String.valueOf(num1-num2));
                }
                if(cbOperations.getSelectedIndex()==2){
                    lblResult.setText(String.valueOf(num1*num2));
                }
                if(cbOperations.getSelectedIndex()==3){
                    lblResult.setText(String.valueOf(num1/num2));
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        calc.setContentPane(calc.panel);
        calc.setSize(700, 280);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setVisible(true);
        calc.setTitle("Simple Calculator");
    }

}
