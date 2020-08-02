/**
 * Faça um programa que leia uma letra e mostre se ela é uma vogal ou consoante. 
Considere que poderão ser digitadas letras maiúsculas ou minúsculas.

 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char letra;
        
        System.out.println("Digite apenas uma letra: ");
        letra = input.next().charAt(0);
        
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra =='u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra =='U'){
            System.out.printf("\nA Letra: %S é VOGAL\n", letra);
        }
        else {
            System.out.printf("\nA Letra: %S é consoante\n", letra);
        }
    }
    
}
