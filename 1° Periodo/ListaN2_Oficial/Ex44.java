package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex44 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaração de variáveis
        int vetor[];
        int x, y, px, py;

        // Inicialização de variáveis
        vetor = new int[10];
        x = y = px = py = 0;

        // Entrada
        for (int i = 0; i < 10; i++) {
            System.out.printf("Valor na posição [%d]: ", i);
            vetor[i] = input.nextInt();

            // Processamento
            if (i == 0) {
                x = y = vetor[i];
                px = py = i;
            } else {
                // menor
                if (vetor[i] < x) {
                    x = vetor[i];
                    px = i;
                }
                // Maior
                if (vetor[i] > y) {
                    y = vetor[i];
                    py = i;
                }
            }
        }

        // Saída
        System.out.printf("\nO menor vetor é [%d]\ne sua posição "
                + "dentro do vetor é: V[%d].\n"
                + "O maior elemento é [%d]\ne está na posição V[%d].\n", x, px, y, py);
    }

}
