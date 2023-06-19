/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IfStatement2;

import javax.swing.JOptionPane;

/**
 *
 * @author liamvr
 */
public class IfStatement2b {
    public static void main(String[] args) {
        int age = Integer.parseInt (JOptionPane.showInputDialog("enter your age"));
        if (age > 16)
        {
            System.out.println("you are "+ age+" which is over the age limit of 16");
            System.out.println("you may see the movie");
            //(*)
        }
        else{
            System.out.println("you are 16 or unnder.");
            System.out.println("you may not see the movie.");
        }
        
        }
    }

    
    

