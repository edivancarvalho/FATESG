
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author edivan
 */
public class Teste {
    public static void main(String[] args) {
        // Declaração de Variáveis
        Scanner sc;
        int cont, quantidade;
        double n, soma, media;

        // Inicialização de Variáveis
        sc = new Scanner(System.in);
        cont = 0;
        soma = 0;

        // Entrada
        System.out.println();
        System.out.print("Informe a quantidade de números que vai digitar: ");
        quantidade = sc.nextInt();

        if (quantidade == 0) {
            System.out.println("Ok. =|"); // Não quer digitar nenhum número
        } else {
            while (cont < quantidade) {
                System.out.printf("Digite o %dº valor em número decimal: ", cont + 1);
                n = sc.nextDouble();
                soma += n;
                cont++;
            }
            // Processamento
            media = soma / quantidade;

            // Saída
            System.out.println();
            System.out.printf("Média do(s) %d valor(es) informado(s): %.3f\n", quantidade, media);
        }
    }
}
