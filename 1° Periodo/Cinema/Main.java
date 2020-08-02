package Cinema;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Main {

    public static void main(String[] args) {
        // Pega a hora do computador Local;
        System.out.println("Hora atual do Sistema::");
        SimpleDateFormat HoraSistema = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        System.out.println(HoraSistema.format(new Date());

        Scanner input = new Scanner(System.in);
        int escolha, filme = 0, filme1 = 0, filme2 = 0, filme3 = 0, dora = 0;
        int morto = 0, odineia = 0;

        System.out.printf("> ");

        do {
            System.out.println("Por favor escolha um filme a seguir:");
            System.out.printf("[1] Dora Aventureira.\n");
            System.out.printf("[2] O Morto Não Fala.\n");
            System.out.printf("[3] A Odiseia Dos Tolos.\n");

            escolha = input.nextInt();
            if (escolha == 1) {
                filme1 += filme1;
                dora++;

            } else if (escolha == 2) {
                filme2 += filme2;
                morto++;
            } else if (escolha == 3) {
                filme3 += filme3;
                odineia++;
            }
        } while (escolha != 1 && escolha != 2 && escolha != 3);
//            System.out.printf("Selecione um filme em cartaz:"
//                    + "[1] Dora Aventureira."
//                    + "[2] O Morto Não Fala."
//                    + "[3] A Odiseia Dos Tolos.");
//            while (entrada != 1 && entrada != 2);
//        switch (filme) {
//            case 1:
//                System.out.println("Dora Aventureira");
//                break;
//            case 2:
//                System.out.println("O Morto Não Fala");
//                break;
//            case 3:
//                System.out.println("A Odiseia Dos Tolos");
//                break;
//            default:
//            case 4: {
//                System.exit(0);
//                System.out.println("O filme escolido nao e valido");
//
//            }
//        input.nextLine();
//       //DECLARAÇÃO DE VARIÁVEIS
        double entrada = 0,
                meiaEntrada = 0,
                valorAPagar = 0,
                valor = 25.00;
        String nome;

//      System.currentTimeMillis()
        System.out.println();
        //ENTRADA DE DADOS
        System.out.print("Digite seu nome :: ");
        nome = input.nextLine();

//        System.out.println("Digite o valor da entrada cheia :: ");
//-----------------------------------------------------------------------------
//      VALIDA A ENTRADA OU MEIA;
//-----------------------------------------------------------------------------
        do {
            System.out.print("[1] Meia entrada ou [2] cheia :: ");
            entrada = input.nextInt();
            if (entrada == 1) {
                meiaEntrada = valor - (valor * .50);
            } else if (entrada == 2) {
                valorAPagar = valor;
            }
        } while (entrada != 1 && entrada != 2);

//        System.out.printf("%S sua cadeira é a [%S%d]\n", nome, linha, coluna);
//        System.out.printf("%S\n", nome);
//     System.out.println(+dia + "/" + mes + "/" + ano + " " + data);
        System.out.printf("Valor da meia entrada %.2f\n", meiaEntrada);
        System.out.printf("Valor da Entrada cheia %.2f\n", valorAPagar);
        System.out.printf("valor Total:: %.2f\n", valorAPagar + meiaEntrada);
    }

}
