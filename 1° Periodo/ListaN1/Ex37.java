/**
 * Construa um programa que receba a idade de uma pessoa e classifique-a seguindo o 
critério apresentado a seguir. Considere a idade é um valor inteiro e que será informada de 
forma válida.

 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex37 {
    public static void main(String[] args) {
        Scanner intpu = new Scanner(System.in);
        int idade;
        
        System.out.println("Escreva sua idade: ");
        idade = intpu.nextInt();
              
        
        if (idade < 3 || idade <12 || idade < 20 || idade < 56){
             
            if (idade < 3){
                System.out.println("\nRecém-Narcido");
            }
            else if (idade < 12){
            System.out.println("\nCriança");
            }
            else if (idade < 20){
                System.out.println("\nAdolescente");
            }
            else if (idade < 56){
                System.out.println("\nAdulto");
            }        
        }
        else System.out.println("\nIdoso");
    }
    
}
