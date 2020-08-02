/*
 15. Leia um número indeterminado de números e conte a quantidade 
 de números pares e números ímpares. 
 Caso o usuário digite um número inválido (negativo) deve-se exibir 
 uma mensagem e repetir a leitura. O sistema deverá ser encerrado quando
 for digitado o número 0 (zero).
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex15 {
    public static void main(String[] args) {
        
        //-------> DECLARAÇÃO DA VARIAVEIS
        Scanner input = new Scanner(System.in);
        int numeros, par, impar;

        //inicialização da Variaveis;
        par = 0;
        impar = 0;

        //-------> ENTRADA
        //Entrada; // do = Faça enquanto...
        do {
            System.out.println("Digite um número inteiro Positivo ou  [0 - Sair]");
            numeros = input.nextInt();

        //-------> Processamento
            // Se o numero for menor que zero --> Faça sout;
            if (numeros < 0) {
                System.out.println("Números Negativos não são validos. \n");
            } // Se o numero for maior que 0; --> faça 
            else if (numeros > 0) {
                // se o resto da divisao for igual a zero; --> faça.
                if (numeros % 2 == 0) {
                    par++;
                } // se nao impar cout ++;
                else {
                    impar++;
                }
            }
        //while - faça enquanto numero for diferente de  Zero --> faça;
        } while (numeros != 0);

        //-------> SAIDA       
        System.out.println();
        System.out.printf("Quantidade de Números pares : %d%n", par);
        System.out.printf("Quantidade de Números Ímpar : %d%n", impar);
    }
}
