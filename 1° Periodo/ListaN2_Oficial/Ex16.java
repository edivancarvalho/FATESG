/*
 * 16. Escreva um programa que receba vários números inteiros, calcule e mostre: 
 a) a soma dos números digitados;
 b) a quantidade de números digitados; 
 c) a média dos números digitados; 
 d) o maior número digitado; 
 e) o menor número digitado; 
 f) a média dos números pares; 
 g) a percentagem dos números ímpares entre todos os números digitados.

 Finalize a entrada de dados com a digitação do número 0.

 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex16 {

    public static void main(String[] args) {
        // Declaração da Variaveis
        Scanner input;
        int numero, soma, quantidade, maior, menor, count, par, somaPar, impar;
        double media, mediaPar, pImpares;

        //Incialização das Variaveis
        input = new Scanner(System.in);
        // Denidos todos para receber o valor Zero; minimizar trabalho;
        maior = menor = soma = count = par = somaPar = impar = 0;
        media = mediaPar = pImpares = 0;

        // Entrada
        System.out.println();
        do {
            System.out.println("Digite um número inteiro Positivo ou  [0 - Sair]:");
            numero = input.nextInt();

            // Processamento
            // 1° Etapa
            if (numero < 0) {
                System.out.println("Números Negativos não são validos. \n");
            } else if (numero > 0) {
                // a) soma dos números digitados;
                soma += numero; // ou usar [soma += numero]

                // b) A Quantidade de números digitados;
                count++;
                // d) O maior número digitados;
                if (count == 1) {
                    maior = menor = numero;
                } else {
                    if (numero > maior) {
                        maior = numero;
                    }

                    // e) O menor número Digitado;
                    if (numero < menor) {
                        menor = numero;
                    }
                }
                if (numero % 2 == 0) {
                    par++;
                    // ou usar [somaPar = somaPar + numero];
                    somaPar += numero;
                } else {
                    impar++;
                }
            }

        } while (numero != 0);

        // c) A media dos numeros Digitados;
        if (count > 0) {
            //converte para doubles ou por eles como double.
            media = (double)soma / (double)count;

            // f) A média dos numeros pares;
            if (par > 0) {
                mediaPar = (somaPar / par);
            }

            // g) A percetagem dos numeros entre todos os numeros digitados.
            // converte para Double.
            pImpares = ((double) impar / ((double)par + (double)impar)) * 100;
        }

        // Saida
        System.out.println();
        System.out.printf("Soma dos Números Digitados       ---> [ %d ]%n", soma);
        System.out.printf("Quantidade de números digitados  ---> [ %d ]%n", count);
        System.out.printf("Média dos números digitados      ---> [ %.2f ]%n", media);
        System.out.printf("Maior Número digitado            ---> [ %d ]%n", maior);
        System.out.printf("Menor Número digitado            ---> [ %d ]%n", menor);
        System.out.printf("Média dos números Pares          ---> [ %.2f ]%n", mediaPar);
        System.out.printf("Percentagem dos números Impares  ---> [ %.2f ]%n", pImpares);

    }

}
