/**
 * Escreva um algoritmo que leia o código de um determinado produto e mostre a
 * sua classificação de acordo com a tabela apresentada a seguir:
 *
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex44 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo;
        int menu;

        System.out.println("Digite o Código do produto:");
        menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Alimento não-perecível");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Alimento perecível");
                break;
            case 5:
            case 6:
                System.out.println("Vestuario");
                break;
            case 7:
                System.out.println("Higiene pessoal");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Limpeza e utensilios domésticos");
                break;
            default:
                System.out.println("Inválido");

        }

    }

}
