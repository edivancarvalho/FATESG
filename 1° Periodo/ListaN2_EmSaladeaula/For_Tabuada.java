/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaN2_EmSaladeaula;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class For_Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n,c;
        
        System.out.println("Digite um numero para a Tabuada: ");
        n = input.nextInt();
        
        for (c = 0; c <= 10; c++){
            System.out.println(n + " X " + c + " = " + n*c);
        }
    }
    
}
