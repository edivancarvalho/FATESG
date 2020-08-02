/**
 * *
 * Soma de Impares Consecutivos I
 *
 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números
 * impares entre eles. Entrada
 *
 * O arquivo de entrada contém dois valores inteiros. Saída
 *
 * O programa deve imprimir um valor inteiro. Este valor é a soma dos valores
 * ímpares que estão entre os valores fornecidos na entrada que deverá caber em
 * um inteiro. Exemplo de Entrada Exemplo de Saída
 * ---------------------------------------- 6 5 -5
 * ----------------------------------------- 15 13 12
 * ----------------------------------------- 12 0 12
 *
 *
 */
package Uri04;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //DELCARAÇÃO DA VARIAVEIS
        int i, X, Y, soma = 0;
        //ENTRADA
        X = input.nextInt();
        Y = input.nextInt();
        // PROCESAMENTO
        // NUMERO FOR PAR
        if (X < Y) {
            for (i = X + 1; i < Y; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        }
        //NUMERO FOR IMPAR
        else {
            for (i = Y + 1; i < X; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        }

        System.out.println(soma);
    }

}
