/*
 Altere o exercício 23, onde o sistema deverá gerar a tabuada completa de 1 até 10.
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex29 {

    public static void main(String[] args) {
        
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("Tabuada do : " + numero);
            for (int i = 1; i <= 10; i++) {
                int resultado = numero + i;
                System.out.println(numero + " * " + i + " = " + resultado);
            }
            System.out.println();
        }
    }
}
