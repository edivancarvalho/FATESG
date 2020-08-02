package Cinema;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Cinema02 {

    static int c1[][] = new int[10][10];
    static int conta_vendas;
    static double caixa, meia, cheia, valor = 25.00, valorAPagar;
    int cMeia = 0;

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int sair = 0;
//        int vendedor = 001;
//        int vendedor1;
        System.out.println("------------------------------------------------------------------");
        System.out.println("------------SEJA BEM VINDO POR FAVOR INFORME SEUS DADOS ----------");
        System.out.println("------------------------------------------------------------------");

        while (sair != 3) {
            System.out.println("-------------------------------------------------");
            System.out.println("(1) - VENDAS");
            System.out.println("(2) - RELATORIO DE VENDAS");
            System.out.println("(3) - VERIFICA LUGARES DISPONIVEIS");
            System.out.println("(4) - EXIT");
            System.out.println("-------------------------------------------------");
            int menu = input.nextInt();
            switch (menu) {
                case 1: {
                    iniciavenda();
                    break;
                }
                case 2: {
                    relatorio();
                    break;
                }
                case 3: {
                    consultar();
                    break;

                }
                case 4: {
                    System.exit(0);
                }
            }

        }

    }

    public static void iniciavenda() {
        Scanner input = new Scanner(System.in);
        int coluna;
        String linha;
        int entrada;
//        double meia, cheia, valorAPagar, valor = 25.00;
        do {
            System.out.print("[1] Meia entrada ou [2] cheia :: ");
            entrada = input.nextInt();
            if (entrada == 1) {
                meia = valor - ( valor * .50);
                
                
            } else if (entrada == 2) {
                valorAPagar = valor;
            }
        } while (entrada != 1 && entrada != 2);

        System.out.println("\nDigite a linha desejada: ");
        System.out.println("[A B C D E F G H I J]: ");
        linha = input.next();
        System.out.println("Digite a coluna desejada: ");
        System.out.println("[0 1 2 3 4 5 6 7 8 9]: ");
        coluna = input.nextInt();
        vetores(linha.charAt(0), coluna);
    }

    public static void relatorio() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("----------------- RELATÓRIO ANALITICO DE VENDAS ------------------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Total de Ingressos Vendidos: " + conta_vendas);
        System.out.printf("Total em Reais: R$ %.2f%n", caixa);
        System.out.println("Relação de Poltronas Vendidas: ");
        for (int linha = 0; linha < c1.length - 1; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                if (c1[linha][coluna] != 0) {
                    System.out.println("Cadeira [" + (char) ('A' + linha) + "" + coluna + "] vendida.");
                }

            }
        }
        System.out.println("");
        System.out.println("******************************************************************");
    }

    public static void consultar() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (c1[i][j] == 0) {
                    System.out.println((char) ('A' + i) + "" + j + " Livre");
                }
            }
        }
    }

    public static void vetores(char linha, int col) {
        int lin = (int) linha - 'a';

        switch (c1[lin][col]) {
            case 0:
                if (lin <= 5) {
                    System.out.println(lin);
                    double preco = 25.00;
                    System.out.println("Posição livre");
                    c1[lin][col] = 1;
                    System.out.println("----------------------------------");
                    System.out.println("=   VENDA EFETUADA COM SUCESSO   =");
                    System.out.println("----------------------------------");
                    caixa = caixa + meia;
                    
                    conta_vendas++;
                }
//                else {
//                    double preco2 = 25.00;
//                    System.out.println("Posicao livre");
//                    c1[lin][col] = 1;
//                    System.out.println("----------------------------------");
//                    System.out.println("->  VENDA EFETUADA COM SUCESSO  <-");
//                    System.out.println("----------------------------------");
//                    caixa = caixa + preco2;
//                    conta_vendas++;
//                }
                break;
            case 1:
                System.out.println("----------------------------------");
                System.out.println("----->   ESPAÇO VENDIDO    <------");
                System.out.println("----------------------------------");
                break;
            case 2:
                System.out.println("----------------------------------");
                System.out.println("----->   ESPAÇO RESERVADO  <------");
                System.out.println("----------------------------------");
                break;
            default:
        }

    }
}
