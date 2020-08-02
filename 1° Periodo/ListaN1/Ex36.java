/**
 * Um comerciante calcula o valor da venda, tendo em vista a tabela a seguir.
 * Escreva um programa que leia o valor da compra e imprima o valor da venda do
 * produto.
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valor;

        System.out.println(" Digite o valor do produtor: ");
        valor = input.nextFloat();

        if (valor < 10 || valor <30 || valor <= 50 || valor > 50) {

            if (valor < 10) {
                System.out.println("Lucro de 70% \n");
            }
            else if (valor <= 10 || valor < 30) {
                System.out.println("Lucro de 50% \n");
            }
            else if (valor <= 30 || valor <= 50) {
                System.out.println("Lucro de 40% \n");
            } else {
                System.out.println("Lucro de 30%");
            }
        }

    }

}
