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
public class IfStatement4 {

    public static void main(String[] args) {
        int num, posn;
        String wrd = JOptionPane.showInputDialog("type any word <enter>.");
        num = wrd.length();

        if (num % 2 != 0) {
            System.out.println(wrd + "has an odd number of letters.");
            posn = num / 2 + 1;
            System.out.println("the middle letter is" + wrd.charAt(posn - 1));
        } else {
            System.out.println(wrd + " has an even number of letters.");
        }

        {

        }
    }
}
