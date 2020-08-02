/*
 VETORES
 43. Faça um programa que preencha um vetor com 10 números inteiros. 
 Calcule e mostre os números superiores a 50 e suas respectivas posições. 
 O programa deverá mostrar uma mensagem se não existir nenhum número nessa condição.

 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex43 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Declaração de variáveis
        int numeros[], cont_maiores;
        String maiores;

        // Inicialização de variáveis
        numeros = new int[10];
        cont_maiores = 0;
        maiores = "";

        // Entrada
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite um número para a posição [%d]: ", i);
            numeros[i] = input.nextInt();
        }

        // Processamento
        // Busca por superiores a 50 e adiciona ao texto de saída
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 50) {
                cont_maiores++;
                maiores += String.format("Posição [%d] = %d\n", i, numeros[i]);
            }
        }

        // Saída
        System.out.println();
        if (cont_maiores == 0) {
            System.out.println("Não nenhum número superior a 50 no vetor:");
        } else {
            System.out.printf("Números superiores a 50:\n%s", maiores);
        }
    }

}
