/**
 * Incremente o programa anterior onde caso a pessoa seja maior de idade
 * verifique se ela tem mais de 65 anos, ou caso seja menor de idade verifique
 * se ela é menor de 12 anos.
 *
 *
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex30 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Escreva seu Nome: ");
        nome = input.nextLine();

        System.out.println("Qual sua idade ?: ");
        idade = input.nextInt();

        if (idade >= 18 ) {
            System.out.printf("%S é maior de IDADE", nome);
            if (idade > 65){
                System.out.printf(" e maior de 65 anos.\n");
            }
            
        }
        else {
            System.out.printf("%S é menor de IDADE,", nome);
            if (idade < 12){
                System.out.printf(" e tem menos de 12 anos.\n");
            }
        }

    }
}    