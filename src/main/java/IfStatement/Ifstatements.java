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
public class Ifstatements {

    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        int price;
        if (age < 12) {
            price = 100;
        } else {
            price = 150;
        }
        JOptionPane.showConfirmDialog(null, "Your ticket costs R" + price);

    }

}
