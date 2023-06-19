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
public class Bmi {
    public static void main(String[] args) {
        String heightinput = JOptionPane.showInputDialog("height in m");
        String weightinput = JOptionPane.showInputDialog("weight in kg");
        
        double height = Double.parseDouble(heightinput);
        double weight = Double.parseDouble(weightinput);
        
        double bmi = weight / Math.pow(height, 2);
        
        System.out.println(bmi);
    }
}
