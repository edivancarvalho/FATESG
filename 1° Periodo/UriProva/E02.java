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
public class E02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, i, maior;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        i = (a + b + Math.abs(a - b)) / 2;
        
        maior = (i + c + Math.abs(i - c)) / 2;
        
        System.out.printf("%d eh o maior%n", maior);

    }

}
