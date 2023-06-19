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
public class TestAnotherNumber 
{

    public static void main(String[] args) 
    {

        int num = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
        if (num > 0) 
        
        {
             System.out.println("your number is postive");
           
        } 
        else if (num < 0) 
        System.out.println("your number is negative");
        {
            
        }

    }
}
