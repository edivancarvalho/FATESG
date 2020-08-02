/*
 Números Positivos

 Faça um programa que leia 6 valores. 
 Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
 A seguir, mostre a quantidade de valores positivos digitados.

 Entrada

 Seis valores, negativos e/ou positivos.
 Saída

 Imprima uma mensagem dizendo quantos valores positivos foram lidos.

 ------------------------------------------
 Exemplo de Entrada 	Exemplo de Saída.
 ------------------------------------------
 7                       4 valores positivos
 -5
 6
 -3.4
 4.6
 12
 */
package Uri04;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1060 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //DECLARAÇÃO DA VARIAVEIS
        double numero, positivo;
        int cout;
        int i = cout = 0;

        //ENTRADA;
        //processamento;
        do {
//            System.out.println("Digite o numero::");
            numero = input.nextDouble();
            if (numero > 0) {
                cout++;
            }
           i++;
        } while (i < 6);
        System.out.printf("%d valores positivos\n",cout);

    }

}
