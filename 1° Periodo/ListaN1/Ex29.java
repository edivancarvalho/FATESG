/**
 * Escreva um programa que leia o nome e a idade de uma pessoa e informe se ela é maior 
ou menor de idade.

 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.println("Escreva seu Nome: ");
        nome = input.nextLine();
        
        System.out.println("Qual sua idade ?: ");
        idade = input.nextInt();
        
        if (idade < 18){
            System.out.printf("%S é menor de IDADE.",nome);
        }
        else {
            System.out.printf("%S é maior de IDADE.",nome);
        }
            
    }
    
}
