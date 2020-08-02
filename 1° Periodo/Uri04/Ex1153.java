/**
 * 

Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Entrada

A entrada contém um valor inteiro N (0 < N < 13).
Saída

A saída contém um valor inteiro, correspondente ao fatorial de N.
Exemplo de Entrada 	Exemplo de Saída
4                       24
 */
package Uri04;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1153 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //DECLARAÇAO DA VARIAVEL
        int n,i = 1;
        
        //ENTRADA
        n = input.nextInt();
        
        //PROCESSAMENTO
        // N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        while (n > 1) {
            i = i * n;
            n = n - 1;

        }
        System.out.printf("%d\n", i);
    }

}
