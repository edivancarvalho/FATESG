/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UriProva;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio, fim, duracao = 0;

        inicio = input.nextInt();
        fim = input.nextInt();

        if (inicio <= 24) {
            duracao = 24 - inicio + fim;
            System.out.printf("%d",duracao);
        } else  {
            duracao = fim - inicio;
            System.out.printf("%d",duracao);
        }
//        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
