
/*
 Preenchimento de Vetor II
 QUESTÃO
 Faça um programa que leia um valor T e preencha um vetor N[1000] com a 
 sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. 
 Imprima o vetor N.
 
 ENTRADA
 A entrada contém um valor inteiro T (2 <= T <= 50).
 
 SAÍDA
 Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor 
 e x é o valor armazenado naquela posição.
 
*/
package Uri05;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1177 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int T = input.nextInt();
        int[] N = new int[1000];
        int posicao = 0;
        while (posicao < 999) {
        	for (int j = 0; j < T; j++) {
        		if (posicao > 999) break;
        		N[posicao] = j;
        		posicao++;
        	}
        }
        
        for (int i = 0; i < N.length; i++) {
        	System.out.println("N[" + i + "] = " + N[i]);
        }
    }
    
}
