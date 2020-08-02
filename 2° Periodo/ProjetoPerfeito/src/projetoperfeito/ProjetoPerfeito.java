/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoperfeito;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class ProjetoPerfeito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int x = input.nextInt();
        
        int metade = x, y=1, soma = 0;
        
        while (y <= metade){
            if (x % y == 0){
                soma = soma + y;
            }
            y++;
        }
        if (soma == x) System.out.println("O numero: " +x+ " é perfeito");
        else System.out.println("o numero " +x+ " noa pe perfeito");
    }

}
