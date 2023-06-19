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
public class exercise3 {
    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        if ( age >= 6 & age <= 19)
            System.out.println("what school do you go to");
    }
    
}
