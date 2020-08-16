package br.com.jose.atividades01;

import java.util.Random;

/**
 *
 * @author edivan
 */
public class MegaRandon {

    public static void main(String[] args) {

        Random randomNumbers = new Random(); //gerador de número aleatório

        int numero[] = new int[6]; // array de contadores de frequencia

        // lança o dados 6 vezes;
        for (int i = 0; i < 6; i++) {
            numero[i] = randomNumbers.nextInt(60);
            System.out.println(numero[i]);
        }
    }
}
