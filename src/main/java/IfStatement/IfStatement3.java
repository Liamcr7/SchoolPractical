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
public class IfStatement3 {

    public static void main(String[] args) {

        double result;

        double a = Double.parseDouble(JOptionPane.showInputDialog("enter a value for a"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("enter a value for b"));
        if (b != 0) {
            result = a / b;
            JOptionPane.showConfirmDialog(null, "the result is" + result);
        }

    }

}
