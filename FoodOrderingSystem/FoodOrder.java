package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder extends JFrame{
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JCheckBox cSoftDrinks;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JPanel panel;
    private JButton btnOrder;

    FoodOrder(){

        btnOrder.addActionListener(new ActionListener() {
            JCheckBox[] cb = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
            JRadioButton[] rb = {rbNone, rb5, rb10, rb15};
            @Override
            public void actionPerformed(ActionEvent e) {
                double sum = 0;
                double discount = 0;
                if(cPizza.isSelected()){
                    sum+=100;
                }
                if(cBurger.isSelected()){
                    sum+=80;
                }
                if(cFries.isSelected()){
                    sum+=65;
                }
                if(cSoftDrinks.isSelected()){
                    sum+=55;
                }
                if(cTea.isSelected()){
                    sum+=50;
                }
                if(cSundae.isSelected()){
                    sum+=40;
                }
                if(rbNone.isSelected()){
                    discount = 0;
                    sum-=discount;
                }
                if(rb5.isSelected()){
                    discount = sum*0.05;
                    sum-=discount;
                }
                if(rb10.isSelected()){
                    discount = sum*0.10;
                    sum-=discount;
                }
                if(rb15.isSelected()){
                    discount = sum*0.15;
                    sum-=discount;
                }
                JOptionPane.showMessageDialog(null, "The total price is Php "+String.format("%.2f", sum));
                for(JCheckBox c: cb){
                    c.setSelected(false);
                }
                for(JRadioButton r: rb){
                    r.setSelected(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        order.setContentPane(order.panel);
        order.setSize(480, 580);
        order.setDefaultCloseOperation(EXIT_ON_CLOSE);
        order.setVisible(true);
        order.setTitle("Food Ordering System");
    }

}
