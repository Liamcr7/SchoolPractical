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
public class LargerOfTwo
{

    public static void main(String[] args) 
    {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
        if (num1 > num2) 
        {
            System.out.println("num1 is bigger");
        } //(*)
        else if (num1 < num2) 
        {
            System.out.println("num2 is bigger");
        } 
        else if (num1 == num2)
            System.out.println("num1 = num2");
    }   
    
            
            
 }       
            
        


