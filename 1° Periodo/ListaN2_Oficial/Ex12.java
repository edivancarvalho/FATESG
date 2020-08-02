//12. Faça um programa que leia dois números inteiros positivos (n1 e n2).
//Repita a leitura até que n1 seja menor que n2, quando n2 for maior que n1, 
//imprima os números entre n1 e n2.
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1, numero2;
        
        // Faça enquanto ....
        do {
            System.out.println("Digite primeiro numero:: ");
        numero1 = input.nextInt();

        System.out.println("Digite Segundo numero:: ");
        numero2 = input.nextInt();
        
        // Enquanto A (menor) que B
        } while (numero1 < numero2 );
        System.out.printf("Numero1 é [%d] e Numero2 é [%d]%n", numero1, numero2);

    }
}
