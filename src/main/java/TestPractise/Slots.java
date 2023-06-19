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
public class Slots {

    public static double totalMoneyWon = 0;

    public static void main(String[] args) {

    }

    public static int onePlay() {
        int onePlayScore = 0;
        for (int i = 0; i < 3; i++) {
            int singleScore = (int) (Math.random() * 26 + 65);
            char letter = (char) singleScore;
            onePlayScore += singleScore;
        }
        System.out.println("");

        int moneyWon = 0;
    
