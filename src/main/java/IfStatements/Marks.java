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
public class Marks {

    public static void main(String[] args) {
        int mark = Integer.parseInt(JOptionPane.showInputDialog("enter your mark"));
        if (mark >= 80) {
            System.out.println("A");
        } //(*)
        else if (mark >= 70 & mark < 80) {
            System.out.println("B");
        } //(*)
        else if (mark >= 60 & mark < 70) {
            System.out.println("c");
        } //(*)
        else if (mark >= 50 & mark < 60) {
            System.out.println("d");
        } //(*)
        else if (mark < 50) {
            System.out.println("e");
        }
        
        
    }

}
