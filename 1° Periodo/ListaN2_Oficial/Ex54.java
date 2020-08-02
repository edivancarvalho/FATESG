/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaN2_Oficial;

import java.util.Random;

/**
 *
 * @author edivan
 */
public class Ex54 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] A = new int[3][5];
        int[] SL = new int[3];

        for (int i = 0; i < 3; i++) {
            SL[i] = 0;
            for (int j = 0; j < 5; j++) {
                A[i][j] = sorteia(1, 50);

                SL[i] = SL[i] + A[i][j];
            }
        }

        System.out.println("Matriz A:");
        imprimeMatriz(A);

        System.out.println("\n\nVetor SL: ");
        imprimeVetor(SL);
    }

    public static void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
    }

    public static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static int sorteia(int limiteInferior, int limiteSuperior) {
        Random rd = new Random();
        return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
    }

}
