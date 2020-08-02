/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri04;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1071Teste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //DELCARAÇÃO DA VARIAVEIS
        int i, X, Y, soma = 0;
        //ENTRADA
        X = input.nextInt();
        Y = input.nextInt();
        // PROCESAMENTO
        // NUMERO FOR PAR
        if (X < Y) {
            for (i = X + 1; i < Y; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        }
        //NUMERO FOR IMPAR
        else {
            for (i = Y + 1; i < X; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        }

        System.out.println(soma);
    }

}
