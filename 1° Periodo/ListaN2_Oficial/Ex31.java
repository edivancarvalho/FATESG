/*
 NUMERO PRIMO
 31 - Faça um programa que verifique se determinado número X é primo. Obs. Um número é 
 considerado primo se for divisível apenas por 1 e por ele mesmo.

 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 * @author Vinicios - Ajudar.
 * @author edivan
 */
public class Ex31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, divisores;
        String saida;

        // Inicialização de variáveis
        divisores = 1;

        // Entrada
        System.out.print("Digite um número: ");
        n = input.nextInt();

        // Processamento
        saida = String.format("O número %d ", n);

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                divisores++;
            }
        }

        // Verifica se é Primo;
        if (divisores == 2) {
            saida += "é";
        } else {
            saida += "NÃO é";
        }
        // junta as variavel e forma a frase ou pode por logo na codição
        saida += " um número PRIMO.";

        // Saída
        System.out.println(saida);
    }

}
