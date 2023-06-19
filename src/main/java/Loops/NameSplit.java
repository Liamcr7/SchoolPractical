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
public class NameSplit {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("enter your name");
        for(int i = 0; i < a.length(); i++){
            System.out.println(a.charAt(i));
        }
        
        
        
    }
    
}
