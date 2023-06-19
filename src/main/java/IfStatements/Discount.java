/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IfStatements;

import javax.swing.JOptionPane;

/**
 *
 * @author liamvr
 */
public class Discount {
    public static void main(String[] args) {
        int price = Integer.parseInt(JOptionPane.showInputDialog("enter your total cost"));
        int item = Integer.parseInt(JOptionPane.showInputDialog("how many items do you have?"));
        if ( price >= 50 & item >= 10)
        price -= (price*12/100);
            System.out.println(price);
            
    }
    
}
