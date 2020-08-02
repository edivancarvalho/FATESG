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
public class teste {

    public static void main(String[] args) {

        int numero, expondecial, total = 0;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite numero");
        numero = s.nextInt();
        
        System.out.println("Digite o Expondecial");
        expondecial = s.nextInt();
        
        int numeroDoLaço = numero;
        for (int i = 1; i != expondecial; i++) {

            total = numeroDoLaço * expondecial;
            numeroDoLaço = total;

        }
        System.out.println("Para o numero " + numero + ",com expondecial " + expondecial
                + ",o  total e :" + total);
    }

}
