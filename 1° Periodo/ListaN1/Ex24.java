/**
 * 
 * 
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite o número:");
        numero = input.nextInt();
        
        if ( numero %2 == 0 ){
            System.out.printf("O número %d é par%n", numero);
        }
        else{
            System.out.printf("O número %d é Impar%n", numero);
        }
        
    }
    
}
