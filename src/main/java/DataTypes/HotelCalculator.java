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
public class HotelCalculator {
         public static void main (String [] args){
             //rate - how much per night
             double rate = 400;
             
             //number of nights
             String inputl = JOptionPane.showInputDialog("how many nights");
             int numNights = Integer.parseInt(inputl);
             
             //number of people
             String input2 = JOptionPane.showInputDialog("how many people");
             int people = Integer.parseInt(inputl);
             
             //total cost
             double TotalCost = rate*people*numNights;
             System.out.println("Total" + TotalCost);
         }

    
    
    
    
    }
  
