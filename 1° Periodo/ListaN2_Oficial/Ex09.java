//Escreva um programa que mostre na tela os números inteiros de 1 a 300, em ordem
//crescente. Em seguida imprima os números em ordem decrescente.
package ListaN2_Oficial;

/**
 *
 * @author edivan
 */
public class Ex09 {

    public static void main(String[] args) {

        int i = 1;
//       int j = -1;
        // rota o comando de 1 ate 300
        do {
            System.out.printf(i + " ");
            i++;
        } while (i <= 300);
        System.out.println();
        
        //Comando inverso.
        int j = 300;
        do {
            System.out.printf(j + " ");
            j--;
        } while (j >= 1);
        System.out.println();

    }

}
