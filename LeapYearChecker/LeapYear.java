package LeapYearChecker;

import FoodOrderingSystem.FoodOrder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LeapYear extends JFrame{
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel panel;
    void Check(){
        try {
            int year = Integer.parseInt(tfYear.getText());
            if(year==0 || year<0){
                throw new NumberFormatException();
            }
            if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
                JOptionPane.showMessageDialog(null, "Leap Year");
            } else {
                JOptionPane.showMessageDialog(null, "Not a leap year");
            }
        }catch(NumberFormatException f){
            JOptionPane.showMessageDialog(null, "Invalid year. Try again");
            tfYear.setText("");
        }
    }
    LeapYear(){

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Check();
            }
        });

        tfYear.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()== KeyEvent.VK_ENTER){
                    Check();
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYear year = new LeapYear();
        year.setContentPane(year.panel);
        year.setSize(480, 280);
        year.setDefaultCloseOperation(EXIT_ON_CLOSE);
        year.setVisible(true);
        year.setTitle("Leap Year Checker");
    }
}
