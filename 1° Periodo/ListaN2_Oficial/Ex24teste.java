/*
 * 24 - Faça um programa que leia um intervalo (num_inicial e num_final) e calcule o 
 somatório de todos os números entre o num_inicial e num_final.
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex24teste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //DECLARAÇÃO DA VARIAVEL
        int num_inicial, num_final, soma = 0;

        //ENTRADA
        System.out.println("Digite o número Inicial::");
        num_inicial = input.nextInt();

        System.out.println("Digite o número Final::");
        num_final = input.nextInt();
        //PROCESSAMENTO.
        for (int i = num_inicial; i <= num_final; i++) {
            System.out.printf("resultado %d\n", i);
            soma += i;
        //SAIDA
        }
        System.out.println();
        System.out.printf("%d\n",soma);
    }

}
