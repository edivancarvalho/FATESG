/**
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
 * múltiplos entre si.
 *
 * obs° A entrada contém valores inteiros.
 */
package Uri02;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y,resto;

        y = input.nextInt();
        x = input.nextInt();
        // para obete o resto de uma divisao.
        // x / y = no caso % so pega o resto da divisao.
        //podendo ser feito assim: resto = (x % y) ou assim: x %= y
        resto = (y % x);
        x %= y;
        //y %= resto;
        if (x == 0 || resto == 0 ) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
