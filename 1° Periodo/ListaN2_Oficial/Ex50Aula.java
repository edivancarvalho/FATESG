
package ListaN2_Oficial;

import java.util.Random;

/**
 * @author Sala de Aula;
 * @author edivan
 */
public class Ex50Aula {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] vetor = new int[10];
        int[] vetor2 = new int[5];

        int[] result1 = new int[10];
        int[] result2 = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sorteia(1, 50);
        }

        int soma = 0;
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = sorteia(1, 50);
            soma = soma + vetor2[i];
        }

        int j = 0, k = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                result1[j] = vetor[i] + soma;
                j++;
            } else {
                result2[k] = vetor[i] + soma;
                k++;
            }
        }

        System.out.println("Vetor 1: ");
        imprimeVetor(vetor);

        System.out.println("\nVetor 2: ");
        imprimeVetor(vetor2);

        System.out.println("\nVetor Resultante 1: ");
        for (int i = 0; i < j; i++) {
            System.out.print(result1[i] + "   ");
        }

        System.out.println("\nVetor Resultante 2: ");
        for (int i = 0; i < k; i++) {
            System.out.print(result2[i] + "   ");
        }
    }

    public static void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
    }

    public static int sorteia(int limiteInferior, int limiteSuperior) {
        Random rd = new Random();
        return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
    }

}
