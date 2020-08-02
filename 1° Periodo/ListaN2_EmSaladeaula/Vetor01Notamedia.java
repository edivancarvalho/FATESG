package ListaN2_EmSaladeaula;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Vetor01Notamedia {

    public static void main(String[] args) {

        double[] notas = new double[10];
        double soma = 0.0, mediaTurma;
        int i, cont = 0;
        Scanner input = new Scanner(System.in);

        // Entrada
        for (i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do Aluno " + (i + 1) + " : ");
            notas[i] = input.nextDouble();

            soma = soma + notas[i];
        }
        mediaTurma = soma / notas.length;

        for (i = 0; i < notas.length; i++) {
            if (notas[i] > mediaTurma) {
                cont++;
            }
        }
        System.out.println("Media da Turma: " + mediaTurma);
        System.out.println("Existem " + cont + " alunos com acima da media da turma.");
    }

}
