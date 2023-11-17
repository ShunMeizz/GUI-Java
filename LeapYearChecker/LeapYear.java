package LeapYearChecker;

import FoodOrderingSystem.FoodOrder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame{
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel panel;

    LeapYear(){
           btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
