/*
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 SAIDA
 I=1 J=60
 I=4 J=55
 I=7 J=50
 ...
 I=? J=0
 */
package Uri04;

/**
 *
 * @author edivan
 */
public class Ex1095 {

    public static void main(String[] args) {

        //DECLARAÇÃO DA VARIVEIS
        int j = 60, i = 1;

        //PROCESSAMENTO
        while (j >= 0 & i <= 60) {
            System.out.printf("I=%d J=%d\n", i, j);
            i = i + 3;
            j = j - 5;

        }

    }
}