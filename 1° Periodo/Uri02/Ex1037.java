/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri02;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1037 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numero;

        numero = input.nextDouble();
        // 0 a 25
        if (numero >= 0 && numero <= 25) {
            System.out.println("Intervalo [0,25]");
        } // 25 a 50
        else if (numero > 25 && numero <= 50) {
            System.out.println("Intervalo (25,50]");
        } //75 a 100
        else if (numero > 75 && numero <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
