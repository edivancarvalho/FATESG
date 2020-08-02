/**
 * Crie um programa que leia um valor inteiro e diga se ele é positivo, negativo ou nulo.
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite o número:");
        numero = input.nextInt();
        
        if ( numero != 0){
            if(numero > 0){
            System.out.printf("O número %d é POSITIVO%n", numero);
            }
            else{
                System.out.printf("O número %d é NEGATIVO%n", numero);
            }
        }   
        else{
            System.out.printf("O número %d é NULO%n", numero);                    
        }
        
        
    }
    
}
