//Médias Ponderadas
/**
 *
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
 * o terceiro valor tem peso 5. Entrada O arquivo de entrada contém um valor
 * inteiro N na primeira linha. * Cada N linha a seguir contém um caso de teste
 * com três valores com uma casa decimal cada valor. Saída Para cada caso de
 * teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
 *
 *
 */
package Uri04;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1079 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //DECLARAÇÃO DA VARIAVEL
        int numero;
        double nota1, nota2, nota3, media;
        //ENTRADA
        numero = input.nextInt();
        for (int i = 0; i < numero; i++) {

            nota1 = input.nextDouble();
            nota1 = 2 * nota1;

            nota2 = input.nextDouble();
            nota2 = 3 * nota2;

            nota3 = input.nextDouble();
            nota3 = 5 * nota3;

            //PROCESSAMENTO
            //2 + 3 + 5 = 10 media ponderada;
            media = (nota1 + nota2 + nota3) / 10;
            //TESTE DE MESA
//            System.out.printf("%.1f %.1f %.1f = %.1f\n", nota1, nota2, nota3, media);
            System.out.printf("%.1f\n", media);
        }

    }

}
