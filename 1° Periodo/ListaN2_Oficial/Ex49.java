package ListaN2_Oficial;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ajuda Rogerio;
 * @author edivan
 */
public class Ex49 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] vetor = new double[10];
        int codigo;
        int i;

        System.out.println("\nNúmeros do vetor[i] na ordem natural:");
        for (i = 0; i < vetor.length; i++) {

            vetor[i] = sorteia(1, 50);
        }
        for (i = 0; i < vetor.length; i++) {
            System.out.printf("%.1f  ", vetor[i]);
        }
        System.out.printf(
                "\n\nDigite um código: \n\n[0] Termina o programa.\n[1] Imprime Vetor.\n[2] Imprime Vetor Inverso.\n\n:: ");
        codigo = input.nextInt();
        do {
            if (codigo != 0 && codigo != 1 && codigo != 2) {
                System.out.println("Código inválido: digite novamente:");
                codigo = input.nextInt();
            }

        } while (codigo != 0 && codigo != 1 && codigo != 2);

        if (codigo == 1) {
            System.out.println("\nNúmeros do vetor[i]:");
            for (i = 0; i < vetor.length; i++) {

                System.out.printf("%.1f  ", vetor[i]);
            }
        } else if (codigo == 2) {
            System.out.println("\nNúmeros do vetor[i] invertido:");
            for (i = 9; i >= 0; i--) {
                System.out.printf("%.1f  ", vetor[i]);
            }
        } else {
            System.out.println("\n------------Fim do Programa------------");
        }
        input.close();
    }

    public static int sorteia(int limiteInferior, int limiteSuperior) {
        Random rd = new Random();
        return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
    }

}
