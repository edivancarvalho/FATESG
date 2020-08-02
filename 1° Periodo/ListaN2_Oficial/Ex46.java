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
public class Ex46 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limitePar = 10, limiteImpar = 20;
        int i, par = 0, impar = 0;
        int[] vetorPar = new int[limitePar];
        int[] vetorImpar = new int[limiteImpar];

        for (i = 0; par < limitePar; i++) {

            if (i % 2 == 0) {
                vetorPar[par] = i;
                par++;

            }

        }

        for (i = 0; impar < limiteImpar; i++) {

            if (i % 2 != 0) {
                vetorImpar[impar] = i;
                impar++;
            }

        }
        System.out.println();
        System.out.println("---Vetor par---");
        System.out.println();
        for (i = 0; i < par; i++) {
            System.out.printf(" Posição [%d] > %d\n", i, vetorPar[i]);
        }
        System.out.println();
        System.out.println("---Vetor impar---");
        System.out.println();
        for (i = 0; i < impar; i++) {
            System.out.printf(" Posição [%d] > %d\n", i, vetorImpar[i]);
        }
        input.close();
    }

}
