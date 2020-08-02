/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaExtras;

/**
 *
 * @author edivan
 */
public class DoWhile {
    public static void main(String[] args) {
        
        int i = 1; //Count ou cont
        int max = 10;
        
        System.out.println("Contando ate  " + max);
        
        while (i <= max) {
            System.out.println("Valor de i: " + i);
            i++; // i = i + 1; ou i += 1;
            
        }
        System.out.println(i); // Valor de 11
        
        do {
            i++;
            System.out.println("Valor de i: " + i);
        }while (i < 13);
        
        System.out.println(i);
    }
    
}
