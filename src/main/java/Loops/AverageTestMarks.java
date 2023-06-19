/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author liamvr
 */
public class AverageTestMarks {

    public static void main(String[] args) {
        double mark = 0;
        for (int i = 1; i <= 5; i = i + 1) {
            String in = JOptionPane.showInputDialog("enter your mark as a precentage");
            double in2 = Double.parseDouble(in);
            mark += in2;

        }
        double avg = mark / 5;
        System.out.println(avg + "");
    }

}
