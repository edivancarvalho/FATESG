/**
 * 
 * Crie um programa para determinar se um número inteiro A é divisível por outro número 
B. Os valores devem ser fornecidos pelo usuário.
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numeroA, numeroB, aux;
        
        System.out.println("Digite o número de A:");
        numeroA = input.nextInt();
        
        System.out.println("Digite o número de B:");
        numeroB = input.nextInt();
        
        aux = numeroA%numeroB;
        
        if ( aux == 0){
            System.out.printf("%n%d / %d = é DIVISIVÉL%n", numeroA, numeroB);
        }   
        else{
            System.out.printf("%n%d / %d = NAO É DIVISIVÉL%n", numeroA, numeroB);
        }
        
        
    }
    
}
