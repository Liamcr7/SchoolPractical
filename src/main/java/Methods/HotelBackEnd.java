


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author liamvr
 */
public class HotelBackEnd {
    
    public static double calculatetotal (double nights, double adults, double children){
        double adultRate = 200;
        double childrenRate = 300; 
        double total= (nights*childrenRate)*(nights*adultRate);
       return total;
    }
    
}
