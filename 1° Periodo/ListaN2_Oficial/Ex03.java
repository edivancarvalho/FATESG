//
//Escreva um programa que leia uma quantidade de números (para teste use 10)
// calculando e imprimindo o maior, o menor e a média entre os números.
//
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaração das Variaveis
        int i = 1, menor, maior;
        double numero, media,qnumero;

        // Iniciando as variaveis.
        maior = -999999999;
        menor = 999999999;

        //Entrada
        System.out.println("Digite o numero:: ");
        numero = input.nextInt();
         
        while (i <= 10) {
            //System.out.printf("numero %d | numero %.0f\n",i,numero);
            i++;
            
            if (maior < numero){
                System.out.println("Maior");
            }
            
        }
    }

}
