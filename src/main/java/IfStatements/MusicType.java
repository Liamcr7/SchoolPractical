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
public class MusicType {
    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        if (! (age >= 13 & age <=19) )
            System.out.println("you wont like this music");
    }
    
}
