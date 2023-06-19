/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author liamvr
 */
public class MethodIntro {

    public static void main(String[] args) {
        int c = sum(5, 8);
        System.out.println(c);

        sayHi();
        sayHi();
        sayHi();
        sayHi();
        
      
        int k = sum(58588,900);
        System.out.println(k);
        
        
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int sum(int a, int b) {
        int total = a + b;
        return total;
    }

    public static void sayHi() {
        System.out.println("hi");

    }
    
    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int total(int a, int b) {
        int total = a + b;
        return total;
    }
    

    
    
}
