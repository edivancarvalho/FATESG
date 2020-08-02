/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex07_Time_votação {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  Declaração das variaveis
        int g = 0, v = 0, o = 0, F, n = 5;
        char menu;

        do {
            System.out.printf("::   Pesquisa futebolllll    ::");
            //do {
            System.out.printf("\nQual a maior Torcida de Goias?\n (G) = Goias\n (V) = Vila\n (O) = Outros\n (F) = FIM\n :: ");
            //char menu;

            menu = input.next().charAt(0);
            switch (menu) {
                case 'G':
                case 'g':
                    System.out.printf("Vila");
                    g++;
                    break;

                case 'V':
                case 'v':

                    System.out.printf("Vila");
                    v++;
                    break;
                case 'O':
                case 'o':
                    System.out.printf("Outros");
                    o++;
                    //O = input.nextInt();
                    break;
                case 'F':
                case 'f':

                    break;
                default:
            }
        } while (menu != 'f' && menu != 'F');
        System.out.printf(" Goias: %d ",g++);
        System.out.printf(" Vila: %d ",v++);
        System.out.printf(" Outros: %d%n",o++);
    }

}
