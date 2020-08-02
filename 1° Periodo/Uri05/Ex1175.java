
/*
 Troca em Vetor I
 QUESTÃO
 Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro 
 elemento com o último, o segundo elemento com o penúltimo, etc., até 
 trocar o 10º com o 11º. Mostre o vetor modificado.
 
 ENTRADA
 A entrada contém 20 valores inteiros, positivos ou negativos.
 
 SAÍDA
 Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do 
 vetor e Y é o valor armazenado naquela posição.
 
*/
package Uri05;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1175 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int aux;
        
        int[] N = new int[20];
        for (int i=0; i < N.length; i++) {
            N[i] = input.nextInt();
        }
        for (int i=0; i < (N.length / 2); i++) {
        	aux = N[i];
        	N[i] = N[N.length - 1- i];
        	N[N.length - 1 -i] = aux;
        }
        for (int i=0; i < N.length; i++) {
            System.out.println("N["+ i +"] = " + N[i]);
        }
    }
    
}
