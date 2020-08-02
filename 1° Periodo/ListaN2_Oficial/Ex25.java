/*
 25 - Faça um programa que leia um número entre 1 e 10 (deve ser validado) e exiba a 
 tabuada deste número.
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //DECLARAÇÃO DA VARIAVEIS
        int numero;
        //ENTRADA
        System.out.println("Digite um número para tabuada de 1 a 10 ::");
        numero = input.nextInt();

        if (numero > 0 && numero <= 100) {
            // PROCESSAMENTO
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", numero, i, numero * i);
            }
        }else{
            System.out.printf("o Número %d não esta entre 1 e 10.\n",numero);
        }

    }

}
