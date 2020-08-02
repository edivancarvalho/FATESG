/*
 * Faça um programa que receba duas notas de cada um dos 5 alunos de uma turma, 
 calcule e imprima a média aritmética de cada aluno e imprima uma mensagem
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //DECLARAÇÃO DA VARIAVEL
        double nota1, nota2, media;

        //ENTRADA
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a N1::");
            nota1 = input.nextDouble();
            System.out.println("Digite a N2::");
            nota2 = input.nextDouble();

            media = (nota1 + nota2) / 2;
            System.out.printf("%.1f::\n", media);
            media += i;
        }
    }

}
