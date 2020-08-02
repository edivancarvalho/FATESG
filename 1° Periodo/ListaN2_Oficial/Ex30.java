/*
Número Perfeito
 Faça um programa que calcule se um número lido pelo usuário é perfeito. Um número 
 X é perfeito se a soma dos seus divisores, exceto ele mesmo, é igual a X. Por exemplo, 
 6 é perfeito visto que 1+2+3 = 6.
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 * 
 * @author https://www.youtube.com/watch?v=fEsKRvULfxY
 * @author edivan
 */
public class Ex30 {

    public static void main(String[] args) {

        int nuumero;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número");
        nuumero = input.nextInt();
        int metade = nuumero/2, y = 1, soma = 0;
        
        while (y <= metade) {
            if (nuumero % y == 0){
                soma = soma + y;
            }
            y++;
        }
        if (soma == nuumero) System.out.println("O numero " +nuumero+" é perfeito");
        else System.out.println("O Número "+nuumero+ " não é perfeito");
    }
}
