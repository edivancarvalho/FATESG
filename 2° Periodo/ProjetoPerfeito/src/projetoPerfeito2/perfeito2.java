/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPerfeito2;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class perfeito2 {

    public static void main(String[] args) {

    }

    public String nPerfeito(long numeroPerf) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int x = input.nextInt();
        int metade = x / 2, y = 1, soma = 0;

        while (y <= metade) {
            if (x % y == 0) {
                soma = soma + y;
            }
            y++;
        }
        if (soma == x) {
            return "é perfeito";
        } else {
            return "não é perfeito";
        }
    }

}
