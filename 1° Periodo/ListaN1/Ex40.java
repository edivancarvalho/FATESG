/**
 * Crie um programa que leia a idade de uma pessoa e que mostre a sua classe
 * eleitoral: 
 * a. Não-Eleitor: Abaixo de 16 anos. 
 * b. Eleitor obrigatório: entre  * 18 e 65 anos. 
 * c. Eleitor Facultativo: entre 16 e 18 anos e maior de 65 anos.
 *
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex40 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = input.nextInt();

        if (idade < 16 || idade < 19 | idade < 65);
        {
            if (idade < 16){
                System.out.println("Não-Eleitor");
            }
            else if (idade == 16||idade <18 ){
                System.out.println("Leitor Facultativo");
            }
            else if( idade == 18 || idade < 65) {
                System.out.println("Eleitor Obrigatorio");
            }
            else System.out.println("voce tem acima de 65 anos não é obrigatorio.");
        }
    }

}
