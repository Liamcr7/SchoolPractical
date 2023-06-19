
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author liamvr
 */
public class FindProducts {

    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("how many numbers"));
        int total = 1;
        for (int i = 0; i < num; i++) {
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("enter a number "));
            total = total * num2;
        }
        System.out.println(total);

    }

}
