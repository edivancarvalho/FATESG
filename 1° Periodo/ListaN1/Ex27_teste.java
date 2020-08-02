/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex27_teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b,c;
        int menor, inter, maior;
        
        System.out.println("Digite o número de A:");
        a = input.nextInt();
        
        System.out.println("Digite o número de B:");
        b = input.nextInt();
        
        System.out.println("Digite o número de c:");
        c = input.nextInt();
                
        //==============================================================
        if (a < b && a < c) 
            // sim, A é menor
            menor = a;
            // NAO, descer..
        else if (b < c)
            //sim, B é menor
            menor = b;
            //Nao, entao C é menor
        else 
            menor = c;
        System.out.printf("\nMenor: %d\n", menor);
        //==============================================================
         //==============================================================
        //if (a > b && a < c )
        if (a > b && a < c || a<b && a>c )
            //sim, entao A e inter
            inter = a;
            //Nao, descer...
        else if (b > a && b < c || b < a && b > c) // erro esta aqui ou
            //sim, 
            inter = b;
        else 
            inter = c; // aqui
        System.out.printf("\nInter: %d\n", inter);
        //==============================================================
        if (a > b && a > c)
            // sim, entao A é maior
            maior = a;
            // Nao, descer...
        else if (b > c)
            //sim; entao B é maior
            maior = b;
            // nao, entao C é maior
        else
            maior = c;
        System.out.printf("\nMaior: %d\n", maior);
       
    } 
    
}
