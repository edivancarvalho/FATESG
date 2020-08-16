package br.com.jose.atividades02;

import java.util.Scanner;

/**
 * * @author edivan
 */
public class Exer01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] notasArray = new int[20];
        int soma = 0;
        // para cada elemento de array, gerada uma barra do grafico;
        for (int i = 0; i < notasArray.length; i++) {
            System.out.println("Digite a nota: " + (i + 1));
            notasArray[i] = scan.nextInt();
            soma = soma + notasArray[i];

            // imprime a barra de asteriscos
//            for (int stars = 0; stars < notasArray[i]; stars++) {
//                System.out.print("*");
//            }
        }
        System.out.println("soma de Notas: " + soma);
        System.out.println("Media da nota: " + (soma / notasArray.length));

    }
}
