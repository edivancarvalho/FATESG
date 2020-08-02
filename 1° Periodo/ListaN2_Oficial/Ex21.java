/*
 * 21 - Faça um programa que leia o seu nome e o imprima 100 vezes.
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // DECLARAÇÃO DA VARIAVEL
        String nome;
        int cout;

        // INICIALIZAÇÃO DA VARIAVEL;
        cout = 0;

        // ENTRADA;
        System.out.println("Digite seu nome:: ");
        nome = input.nextLine();

        // PROCESSAMENTO;
        for (int i = 0; i < 100; i++) {
            System.out.printf("Seu nome é %S N° %d \n", nome, i);

        }
    }

}
