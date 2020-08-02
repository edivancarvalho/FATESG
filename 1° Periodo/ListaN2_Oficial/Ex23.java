/*
 * 23 - Faça um programa que imprima os números pares e ímpares de 1 até N, 
 onde N deverá ser informado pelo usuário.
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex23 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // DECLARAÇÃO DE VARIAVEIS
        int NumeroAte;

        // 
        // ENTRADA
        System.out.println("Deseja imprimir o número de 0 ate ..: ");
        NumeroAte = input.nextInt();

        //PROCESSAMENTO
        for (int i = 0; i <= NumeroAte; i++) {
            //SAIDA
//            System.out.printf("0 - %d \n", i);
            
            if (i %2 == 0){
                System.out.printf("%d é Par%n", i);
//                System.out.printf("O número %d | %d é par%n ", NumeroAte, i);
            }
            else {
                System.out.printf("%d é Impar%n", i);
            }
        }
    }

}
