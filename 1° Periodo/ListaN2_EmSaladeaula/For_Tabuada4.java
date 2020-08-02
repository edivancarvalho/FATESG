/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaN2_EmSaladeaula;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class For_Tabuada4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio, c, fim, par = 0, impar = 0;

        System.out.println("Digite o valor inicial: ");
        inicio = input.nextInt();

        System.out.println("Digite o valor final: ");
        fim = input.nextInt();

        System.out.println("Valores entre " + inicio + " e " + fim + ":");
        if (inicio < fim) {
            for (c = inicio; c <= fim; c++) {
                System.out.print(c + " ");
                if (c % 2 == 0) par++;
                else impar++;
            }
        }
        else {
            for (c = inicio; c >= fim; c--){
                System.out.println(c + " ");
                if (c % 2 == 0) par++;
                else impar++;
            }
        }
        System.out.println("\n\npar : " + par);
        System.out.println("Impar : " + impar);
    }
    
}
