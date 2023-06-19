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
public class Spherevolume {
    public static void main(String[]args){
          String input = JOptionPane.showInputDialog(" what is your volume ");
          double v = Double.parseDouble(input);
          
          double volume = (4.0/3)*Math.PI * Math.pow(v, 3);         `
          
          System.out.println(volume);
    }
    
}
