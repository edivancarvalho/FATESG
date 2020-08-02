/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex33_teste2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;
        String nome;
        double peso, n1 = 1.2, n2 = 0.88, n3 = 0.38,
                n4 = 2.64, n5 = 1.15, n6 = 1.17;

        System.out.println("Digiet seu nome: ");
        nome = input.nextLine();

        System.out.println("Digite seu PESO: ");
        peso = input.nextFloat();

        //calculo = peso * 
        System.out.println("Escolhar um numero "
                + "\n(1 Mercúrio):"
                + "\n(2 Vênus):"
                + "\n(3 Marte):"
                + "\n(4 Júpiter):"
                + "\n(5 saturno):"
                + "\n(6 Urano):\n");
        menu = input.nextInt();
        switch (menu) {

            case 1:
                System.out.printf("%s", nome);
                break;
            case '2':
                System.out.println("");
                break;
            case '3':
                System.out.println("");
                break;
            case '4':
                System.out.println("");
                break;
            case '5':
                System.out.println("");
                break;
            case '6':
                System.out.println("");
                break;
            default:

        }

    }
}

