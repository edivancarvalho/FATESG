//13. Solicite um número entre 1 e 5. Se a pessoa digitar um número fora deste intervalo, 
//    o sistema deve escrever “Entrada Inválida” e solicitar o número novamente. 
//    Se digitar um número válido, imprima “Parabéns! O número digitado foi ... “.
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int menor = 1, maior = 5;

        // Faça
        do {
            System.out.println("Digite um número entre 1 a 5:: ");
            numero = input.nextInt();

            if (numero >= menor && numero <= maior) {
                System.out.printf("Parabens! O número digitado foi %d.", numero);
            } else if (numero < menor || numero > maior) {
                System.out.println("Entrada Invalida.\n");
            }

            // enquanto 
        } while (numero < 1 || numero > 5);
        System.out.println();

    }

}
