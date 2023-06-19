/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypes;

import javax.swing.JOptionPane;

/**
 *
 * @author liamvr
 */
public class CircleArea {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(" what is your raduis ");
        double r = Double.parseDouble(input);
           
        double area = Math.PI * Math.pow(r, 2);
               
        System.out.println(area);
    }
}
