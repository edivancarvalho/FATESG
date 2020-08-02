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
public class Ex27_testeClone {
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
        int local;
        
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
        //==============================================================
        if (a > b && a < c)
            //sim, entao A e inter
            inter = a;
            //Nao, descer...
        else if (b < c)
            //sim, 
            inter = b;
        else
            inter = c;
        System.out.printf("\nInter: %d\n", inter);
        
        
        
        /*

        if (a != b && b != c && a != c){
            System.out.printf("sao diferentes");
            
            if (a > b && a> c){
                
            }
        } else{
            System.out.printf("sao iguais, digite numeros que nao sao iguais\n");
        }
        
        /*
        if ( a != b) {
            if (a < b){
                System.out.printf("\nA é Menor\n B é Maior", a, b);
            }
            else {
                System.out.printf("\nB é Menor\n A é Maior", b, a);
            }
        } 
        else {
            System.out.printf("\nOS NUMEROS NAO PODEM SER IGUAIS");
            
        }
        */
      
    } 
    
}
