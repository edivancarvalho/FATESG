/**
 * Positivos e Média ------------------------
 *
 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram
 * positivos. Na próxima linha, deve-se mostrar a média de todos os valores
 * positivos digitados, com um dígito após o ponto decimal. Entrada
 *
 * A entrada contém 6 números que podem ser valores inteiros ou de ponto
 * flutuante. Pelo menos um destes números será positivo. Saída
 *
 * O primeiro valor de saída é a quantidade de valores positivos. A próxima
 * linha deve mostrar a média dos valores positivos digitados. Exemplo de
 * Entrada Exemplo de Saída ------------------ ----------------- 7 4 valores
 * positivos -5 7.4 6 -3.4 4.6 12
 *
 */
package Uri04;

import java.util.Scanner;
/**
 *
 * @author edivan
 */
public class Ex1064 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //DECLARAÇÃO DA VARIVEIS
        double number, media = 0;

        int count = 0;
        int i = 0;
        //
        do {
            //entrada
            number = input.nextDouble();
            if (number > 0) {
                media += number;
                count++;
            } else {
                System.out.printf("");
            }
            i++;
        } while (i < 6);
        System.out.printf("%d valores positivos\n%.1f\n", count, media / count);
    }

}
