/**
 * Pares entre Cinco Números
 *
 *
 * Faça um programa que leia 5 valores inteiros. Conte quantos destes valores
 * digitados são pares e mostre esta informação. Entrada
 *
 * O arquivo de entrada contém 5 valores inteiros quaisquer. Saída
 *
 * Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de
 * valores pares lidos. Exemplo de Entrada Exemplo de Saída ------------------
 * ---------------- 7 3 valores pares -5 6 -4 12
 */
package Uri04;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1065 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //DECLARAÇÃO DA VARIAVEIS;
        int number, par;
        int i;

        //INICIALIZAÇÃO DA VARIAVEIS
        par = i = 0;

        do {
            //ENTRADA DE DADOS
            number = input.nextInt();
            // PROCESSAMENTO
            if (number % 2 == 0) {
                par++;
            } else {
                System.out.printf("");
            }
            i++;
        } while (i < 5);
        //SAIDA
        System.out.printf("%d valores pares\n", par);
    }

}
