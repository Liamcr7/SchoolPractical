/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author liamvr
 */
public class Practise {
    public static void main(String[] args) {
         double total = 0;
        
        for(int i = 1; i<=5; i++){
            
            String input = JOptionPane.showInputDialog("show your mark");
            double mark = Double.parseDouble(input);
            
            total= total + mark;
            
            
        }
        double avg= total /5;
        System.out.println(avg +"");
            
    }
    
    
}
