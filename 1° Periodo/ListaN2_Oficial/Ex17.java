/*
 *17. Faça um programa que Leia o Nome e duas notas de uma pessoa e ao final, o programa 
 deve calcular a média aritmética entre as duas notas. 
 O programa deve ser capaz de validar se a nota informada é válida (0.0 ≤ nota ≥ 10), 
 caso contrário o sistema deve 
 informar ao usuário o erro e pedir para ler novamente. Usar um laço Do-While na 
 leitura das notas, e gerar uma saída conforme o exemplo de tela de saída abaixo:

 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração da Variaveis.
        String nome, continuar;

//       boolean resposta = true;
        double nota1, nota2, media;

        //Incialização das Variaveis
        continuar = "sim";

        // Entrada.
        do {
//            input.nextLine();
            System.out.println("Entre com o nome do aluno::");
            String nome1 = input.nextLine();
//            nome1 = nome;
            do {

                System.out.println("Entre com o grau A ::");
                nota1 = input.nextDouble();
                // se nota for menor que Zero --> faça
                if (nota1 >= 0.0 && nota1 <= 10) {

                } else {
                    System.out.println("\nERRO: Nota invalida! Digite novamente o grau A.");
                }
            } while (nota1 < 0.0 || nota1 > 10);

            do {
                // Entrada.

                System.out.println("Entre com o grau B ::");
                nota2 = input.nextDouble();
                // se nota for menor que Zero --> faça
                if (nota2 >= 0.0 && nota2 <= 10) {

                } else {
                    System.out.println("ERRO:----  Nota invalida! Digite novamente o grau B.");
                }
                System.out.println();
                media = (nota1 + nota2) / 2;
                System.out.printf("O aluno %s tem uma média %.2f%n", nome1, media);

//            ----- PARTE FINAL -----
                // deseja continuar sim.
                System.out.println("Continuar (sim/não) ");
                continuar = input.next();

            } while (nota2 < 0.0 || nota2 > 10);

            input.nextLine();
        } while (continuar.equalsIgnoreCase("sim"));
        System.out.println("--- FIM ---");

    }


}
