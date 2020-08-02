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
public class Ex38 {
    public static void main(String[] args) {

        int nuumero;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número::");
        nuumero = input.nextInt();
        int metade = nuumero/2, y = 1, soma = 0;
        
        while (y <= metade) {
            if (nuumero % y == 0){
                soma = soma + y;
            }
            y++;
        }
        if (soma == nuumero) System.out.println("O numero " +nuumero+" é perfeito " );
        else System.out.println("O Número "+nuumero+ " não é perfeito");
    }
    
}
