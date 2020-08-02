/*
 Sequência Lógica 2

Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, passando para a próxima linha a cada X números.
Entrada

O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).
Saída

Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, conforme exemplo abaixo. Não deve haver espaço em branco após o último valor da linha.

 */
package Uri04;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1145 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // DECLARAÇÃO DA VARIAVEL
        int x,y, count;
        count = 1;
        //ENTRADA
        x = input.nextInt();
        y = input.nextInt();
        
        // PROCESSAMENTO
        for (int i = 1; i <= y; i++) {
            System.out.print(i);
            //VALIDAÇÃO DE IMPAR E PAR E IMPLEMENTAÇAO DO ESPAÇO E TABULAÇÃO
            if (i % x == 0) {
                System.out.println("");
            } 
            else {
                System.out.printf(" ");
            }

        }
    }
}
