
package Aula_02;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class maiorIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int idade;
        String nome;
        
        System.out.println("Informe o seu nome: ");
        nome = input.nextLine();
        
        System.out.println(nome + ",Informe sua idade: ");
        idade = input.nextInt();
        
        if (idade >= 18){
            System.out.println(nome + " é maior de idade: ");
            
            if (idade >= 65){
                System.out.println(nome + " tambem é IDOSO.");
            }
            else{
                System.out.println(nome + " Não é idoso");
            }
        }
        else System.out.println(nome + " é MENOR DE IDADE");
    }
}
