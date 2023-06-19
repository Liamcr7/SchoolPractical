/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IfStatement;

import javax.swing.JOptionPane;

/**
 *
 * @author liamvr
 */
public class exercise2 {
    
    public static void main(String[] args) {
        double price = Double.parseDouble(JOptionPane.showInputDialog("enter your price"));
        double discount = 0;
        if (price > 100){
            
            price -=price*0.1;
            
            
        }
        
        double finalPrice = price - discount;
        System.out.println(finalPrice);
       
        
    }
    
    
    
}
