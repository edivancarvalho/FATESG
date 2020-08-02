package Uri04;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1094_01 {

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
