/*
EXPERIENCIAS
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa 
de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. 
Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório
e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. 
Para obter estas informações, ela sabe exatamente o número de experimentos que 
foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias 
utilizadas em cada experimento.

Entrada

A primeira linha de entrada contém um valor inteiro N que indica os vários casos
de teste que vem a seguir. Cada caso de teste contém um inteiro 
Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e 
um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).
Saída

Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada 
e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o 
percentual deve ser apresentado com dois dígitos após o ponto.

*/
package Uri04;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1094 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //DECLARAÇÃO DA VARIAVEIS
        float coelhoP = 0, ratoP = 0, sapoP = 0;
        int n, quantidade, coelho = 0, rato = 0, sapo = 0, soma = 0;
        String animal;

        //ENTRADA DE DADOS
        n = input.nextInt();

        //PROCESSAMENTO;
        for (int i = 1; i <= n; i++) {
            quantidade = input.nextInt();
            animal = input.next();
            soma += quantidade;

            if (animal.equals("C")) {
                coelho += quantidade;
            } else if (animal.equals("R")) {
                rato += quantidade;
            } else if (animal.equals("S")) {
                sapo += quantidade;
            }
            coelhoP = (float) ((coelho * 100.00) / quantidade);
            ratoP = (float) ((rato * 100.00) / quantidade);
            sapoP = (float) ((sapo * 100.00) / quantidade);

        }

        System.out.printf("Total: %d cobaias\n", soma);
        System.out.printf("Total de coelhos: %d\n", coelho);
        System.out.printf("Total de ratos: %d\n", rato);
        System.out.printf("Total de sapos: %d\n", sapo);
        System.out.printf("Percentual de coelhos: %.2f %%\n", (float) coelho / soma * 100);
        System.out.printf("Percentual de ratos: %.2f %%\n", (float) rato / soma * 100);
        System.out.printf("Percentual de sapos: %.2f %%\n", (float) sapo / soma * 100);
        // TESTE DE MESA
//        System.out.printf("Percentual de coelhos: %.2f", coelhoP);
//        System.out.print(" %\n");
//        System.out.printf("Percentual de ratos: %.2f", ratoP);
//        System.out.print(" %\n");
//        System.out.printf("Percentual de sapos: %.2f", sapoP);
//        System.out.print(" %\n");
    }

}
