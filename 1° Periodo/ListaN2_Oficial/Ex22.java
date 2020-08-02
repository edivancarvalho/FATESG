/*
 * 22 - Faça um programa que leia um número e imprima todos os números de 0 até o número 
 digitado.
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex22 {

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
            System.out.printf("0 - %d \n", i);

        }
    }

}
