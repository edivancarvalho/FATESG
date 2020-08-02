/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex37 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, soma = 0;
        int i = 0, opcao;

        do {
            System.out.print("::-->:: Digite um numero: ");
            numero = input.nextInt();
            soma = soma + numero;
            i++;

            System.out.println("Deseja continuar? (1) Sim | (0) Não ::");
            opcao = input.nextInt();

            while (opcao != 0 && opcao != 1) {
                System.out.println("Entrada Invalida, digite apenas 0 ou 1: ");
                opcao = input.nextInt();
            }
            input.nextLine();

        } while (opcao != 0);
        System.out.println("A soma é " + soma);
        System.out.println("A quantidade é " + i);
        System.out.printf("A Media é %d%n", soma / i);
        //System.out.println("A media é "+i);
    }

}
