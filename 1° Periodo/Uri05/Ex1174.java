/*
 
 QUESTÃO
 Faça um programa que leia um vetor A[100]. No final, mostre todas as 
 posições do vetor que armazenam um valor menor ou igual a 10 e o valor 
 armazenado em cada uma das posições.
 
 ENTRADA
 A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.

 SAÍDA
 Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a 
 posição do vetor e x é o valor armazenado na posição, com uma casa após o ponto decimal.
 
*/
package Uri05;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1174 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] A = new double[100];
        //Teste de messa
        //double[] A = new double[5];
        for (int i=0; i < A.length; i++) {
            A[i] = input.nextDouble();
        }
        for (int i=0; i < A.length; i++) {
            if (A[i] <= 10) System.out.printf("A["+ i +"] = %.1f\n" , A[i]);
        }
    }
    
}
