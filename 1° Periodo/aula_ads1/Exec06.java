package aula_ads1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Exec06 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String nome;
        int idade, dias, anos = 365;

        System.out.printf("Digite seu nome: ");
        nome = input.nextLine();

        System.out.printf("Escreva sua idade: ");
        idade = input.nextInt();
        dias = (idade * anos);

        System.out.printf("Você possui %d dias de vida.", dias);

    }

}
