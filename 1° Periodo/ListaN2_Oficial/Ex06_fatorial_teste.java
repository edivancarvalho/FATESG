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
public class Ex06_fatorial_teste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i = 0;

        do {
            System.out.println("Digite N:: ");
            n = input.nextInt();

            if (n == 0 || n == 1) {
                System.out.println("1");
            } else if (n < 0) {
                System.out.printf("Invalido........   ");
            }

        } while (n > 1);
        i = i * n;
        n = n - 1;
        System.out.printf("%d",i);

    }
}
