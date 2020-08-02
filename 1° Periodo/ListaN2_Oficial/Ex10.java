// 10. Escreva um programa que receba vários números inteiros informados pelo usuário
//enquanto os mesmos forem positivos. Imprimir quantos números foram digitados.
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 1,n;
        int soma = 0;
        
        do{
            System.out.println("Digite un numero:: ");
            n = input.nextInt();
            soma = soma + 1;
            i++;
            
            
        } while (n > -1); // ou -1 < n;
        System.out.println("\nVocê digitou a quantidade de " + soma + " numeros.");
    }
    
}
