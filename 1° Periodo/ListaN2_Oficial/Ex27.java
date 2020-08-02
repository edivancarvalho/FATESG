/*
 * 27 - Escreva um programa que receba dois números x e y e calcule xy
 . Obs. Não utilize nenhuma biblioteca matemática, apenas a estrutura de repetição.

 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //DECLARAÇÃO DA VARIAVEL
        int x, y, potenciacao;
        // INICIALIZAÇÃO DA VARIAVEL

        //Entrada
        System.out.println("Digite o valor de X::");
        x = input.nextInt();
        System.out.println("Digite o valor de Y::");
        y = input.nextInt();

        // PROCESSAMENTO
        potenciacao = x;
        for (int i = 1; i < y; i++) {
            //System.out.printf("%d\n",potenciacao);
            potenciacao *= x;
        }
        //SAIDA;
       System.out.printf("%d\n",potenciacao);
    }

}
