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
public class For_Tabuada2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int inicio,c,fim;
        
        System.out.println("Digite o valor inicial: ");
        inicio = input.nextInt();
        
        System.out.println("Digite o valor final: ");
        fim = input.nextInt();
        
        for (c = inicio; c <= fim; c++){
            System.out.println(inicio + " X " + c + " = " + inicio*c);
        }
    }
    
}
