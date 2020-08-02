// Escreva um programa que leia o nome e a idade de uma pessoa e imprima: “O usuário
// *Nome* informou que tem *idade* anos”.
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.println("Escreva seu nome: ");
        nome = input.nextLine();
        System.out.println(nome + ", Escreva sua Idade: ");
        idade = input.nextInt();
        
        System.out.println("O usuario " + nome + ", tem " + idade + " anos");
        
    }
    
}
