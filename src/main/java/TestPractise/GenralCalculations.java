/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPractise;

import javax.swing.JOptionPane;

/**
 *
 * @author liamvr
 */
public class GenralCalculations {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("enter any integer"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("enter any integer"));
        if (num1 > num2) {
            System.out.println(num1 + " is bigger");
        } else if (num1 < num2) {
            System.out.println("num2 is bigger");
        }
        {
            if (num1 % 2 == 0) {
                System.out.println("num1 is even");
            } else {
                System.out.println("num1 is odd");
            }
        }
        {
            if (num2 % 2 == 0) {
                System.out.println("num2 is even");
            } else {
                System.out.println("num2 is odd");
            }
        }
        {
            System.out.println("the product of the 2 numbers is " + (num1 * num2));

        }

    }

}
