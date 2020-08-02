/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoloNoPote;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Bolo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entradas
        double AcucarE, MargarinaE, OvosE, FarinhaTrigoE;
        // Leite ninho com morangos: 
        double Leite_condensadoE, Creme_de_leiteE, Leite_ninhoE, MorangoE;
        // Dois amores
        double Chocoloca_poE;
        // Maracuja
        double Suco_maracujaE, Amido_de_milhoE, OvosME, acucarME;

        // Entrada de processamentos
        double total, tudo = 0, lucro, pocentagem_lucro, precobolo;
        double manteigaME, preco_manteigaME, preco_acuca, preco_margarina, preco_ovos, preco_farinha, preco_leite;
        double preco_leite_ME, leite_ME, pc, preco_acucarME, preco_Amido_de_milho, Preco_creme, preco_ninho, preco_morango, preco_Chocoloca_poE, preco_Suco_maracujaE;
        char opc;
        double a, b, c, d, e, f, g, h, i, j;
        System.out.println("#-----------------------------------------------#");
        System.out.printf("#\t\tSENAI FATESG 2019/2 \t\t#\n");
        System.out.printf("#\t\t--- BOLO NO POTE ---\t\t#\n");
        System.out.println("#-----------------------------------------------#\n");
        
        System.out.println("Olá, Escolhar a receita para fazer o orçamento?");
        System.out.println("[1] - Leite ninho com morangos\n"
                + "[2] - Dois amores\n"
                + "[3] - Maracujá");
        System.out.printf("\t(Apenas o número correspondente) \n>:");
        
        opc = entrada.next().charAt(0);
        while (opc != '1' && opc != '2' && opc != '3') {
            System.out.println("Opcão INVÁLIDA, digite novamente: ");
            opc = entrada.next().charAt(0);
        }

        switch (opc) {
            case '1':
                // Leite ninho com morangos: 
                System.out.println("Legal, você acaba de escolher a receita de leite ninho com morangos!");

                System.out.println("Quantas gramas de açúcar você comprou: ");
                AcucarE = entrada.nextDouble();
                while (AcucarE < 300) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 300g: ");
                    AcucarE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_acuca = entrada.nextDouble();

                a = 300 * preco_acuca / AcucarE;

                System.out.println("Quantas gramas de margarina você comprou: ");
                MargarinaE = entrada.nextDouble();
                while (MargarinaE < 300) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 300g: ");
                    MargarinaE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_margarina = entrada.nextDouble();

                b = 300 * preco_margarina / MargarinaE;

                System.out.println("Quantos ovos (unidade): ");
                OvosE = entrada.nextDouble();
                while (OvosE < 4) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 3 unidades: ");
                    OvosE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_ovos = entrada.nextDouble();

                c = 4 * preco_ovos / OvosE;

                System.out.println("Quantas gramas de farinha de trigo com fermento você comprou: ");
                FarinhaTrigoE = entrada.nextDouble();
                while (FarinhaTrigoE < 300) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 300g: ");
                    FarinhaTrigoE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_farinha = entrada.nextDouble();

                d = 300 * preco_farinha / FarinhaTrigoE;

                System.out.println("INGREDIENTES DOS RECHEIOS & COBERTURAS\n");

                System.out.println("Quantas gramas de leite condensado você comprou: ");
                Leite_condensadoE = entrada.nextDouble();
                while (Leite_condensadoE < 600) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 600g: ");
                    Leite_condensadoE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_leite = entrada.nextDouble();

                e = 600 * preco_leite / Leite_condensadoE;

                System.out.println("Quantas gramas de creme de leite você comprou: ");
                Creme_de_leiteE = entrada.nextDouble();
                while (Creme_de_leiteE < 600) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 600g: ");
                    Creme_de_leiteE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                Preco_creme = entrada.nextDouble();

                f = 600 * Preco_creme / Creme_de_leiteE;

                System.out.println("Quantas gramas de leite ninho você comprou: ");
                Leite_ninhoE = entrada.nextDouble();
                while (Leite_ninhoE < 600) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 600g: ");
                    Leite_ninhoE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_ninho = entrada.nextDouble();

                g = 600 * preco_ninho / Leite_ninhoE;

                System.out.println("Quantos morangos você comprou: ");
                MorangoE = entrada.nextDouble();
                while (MorangoE < 20) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 600g: ");
                    MorangoE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_morango = entrada.nextDouble();

                h = 20 * preco_morango / MorangoE;

                total = a + b + c + d + e + f + g + h;

                // -----------------------------------Processamento---------------------------------------------------------------------------------------------------/                
                if (total <= 30) {
                    pc = total / 15;
                    System.out.println("Esta dentro da faxetaria de preço!");
                    System.out.printf("%.2f\n", total);

                    System.out.println("Quanto custa cada bolo de pote? ");
                    precobolo = entrada.nextDouble();

                    lucro = precobolo - pc;
                    pocentagem_lucro = lucro / pc * 100;

                    System.out.printf("Seu lucro Sera: %.2f\n", lucro);
                    System.out.printf("Percentual: %.2f\n", pocentagem_lucro);

                } else {
                    System.out.println("Muito caro :(, vamos tentar de novo? ");
                    opc = entrada.next().charAt(0);
                }

                break;
            case '2':

                System.out.println("Legal, você acaba de escolher a receita de Dois Amores!");

                System.out.println("Quantas gramas de açúcar você comprou: ");
                AcucarE = entrada.nextDouble();
                while (AcucarE < 300) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 300g: ");
                    AcucarE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_acuca = entrada.nextDouble();

                a = 300 * preco_acuca / AcucarE;

                System.out.println("Quantas gramas de margarina você comprou: ");
                MargarinaE = entrada.nextDouble();
                while (MargarinaE < 300) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 300g: ");
                    MargarinaE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_margarina = entrada.nextDouble();

                b = 300 * preco_margarina / MargarinaE;

                System.out.println("Quantos ovos (unidade): ");
                OvosE = entrada.nextDouble();
                while (OvosE < 4) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 3 unidades: ");
                    OvosE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_ovos = entrada.nextDouble();

                c = 4 * preco_ovos / OvosE;

                System.out.println("Quantas gramas de farinha de trigo com fermento você comprou: ");
                FarinhaTrigoE = entrada.nextDouble();
                while (FarinhaTrigoE < 300) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 300g: ");
                    FarinhaTrigoE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_farinha = entrada.nextDouble();

                d = 300 * preco_farinha / FarinhaTrigoE;

                //-----------------------------------------------------------------------------------------------------------------------------------------------------------//               
                System.out.println("INGREDIENTES DOS RECHEIOS & COBERTURAS");

                System.out.println("Quantas gramas de leite condensado você comprou: ");
                Leite_condensadoE = entrada.nextDouble();
                while (Leite_condensadoE < 600) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 600g: ");
                    Leite_condensadoE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_leite = entrada.nextDouble();

                e = 600 * preco_leite / Leite_condensadoE;

                System.out.println("Quantas gramas de creme de leite você comprou: ");
                Creme_de_leiteE = entrada.nextDouble();
                while (Creme_de_leiteE < 600) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 600g: ");
                    Creme_de_leiteE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                Preco_creme = entrada.nextDouble();

                f = 600 * Preco_creme / Creme_de_leiteE;

                System.out.println("Quantas gramas de chocolate em pó você comprou: ");
                Chocoloca_poE = entrada.nextDouble();
                while (Chocoloca_poE < 600) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 600g: ");
                    Chocoloca_poE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_Chocoloca_poE = entrada.nextDouble();

                g = 600 * preco_Chocoloca_poE / Chocoloca_poE;

                total = a + b + c + d + e + f + g;

                // -----------------------------------Processamento---------------------------------------------------------------------------------------------------/                
                if (total <= 30) {
                    pc = total / 15;
                    System.out.println("Esta dentro da faxetaria de preço!");
                    System.out.printf("%.2f\n", total);

                    System.out.println("Quanto custa cada bolo de pote? ");
                    precobolo = entrada.nextDouble();

                    lucro = precobolo - pc;
                    pocentagem_lucro = lucro / pc * 100;

                    System.out.printf("Seu lucro Sera: %.2f\n", lucro);
                    System.out.printf("Percentual: %.2f\n", pocentagem_lucro);

                } else {
                    System.out.println("Muito caro :(, vamos tentar de novo? ");
                    opc = entrada.next().charAt(0);
                }

                break;
            case '3':

                System.out.println("Legal, você acaba de escolher a receita de leite ninho com morangos!");

                System.out.println("Quantas gramas de açúcar você comprou: ");
                AcucarE = entrada.nextDouble();
                while (AcucarE < 300) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 300g: ");
                    AcucarE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_acuca = entrada.nextDouble();

                a = 300 * preco_acuca / AcucarE;

                System.out.println("Quantas gramas de margarina você comprou: ");
                MargarinaE = entrada.nextDouble();
                while (MargarinaE < 300) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 300g: ");
                    MargarinaE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_margarina = entrada.nextDouble();

                b = 300 * preco_margarina / MargarinaE;

                System.out.println("Quantos ovos (unidade): ");
                OvosE = entrada.nextDouble();
                while (OvosE < 4) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 3 unidades: ");
                    OvosE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_ovos = entrada.nextDouble();

                c = 4 * preco_ovos / OvosE;

                System.out.println("Quantas gramas de farinha de trigo com fermento você comprou: ");
                FarinhaTrigoE = entrada.nextDouble();
                while (FarinhaTrigoE < 300) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 300g: ");
                    FarinhaTrigoE = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_farinha = entrada.nextDouble();

                d = 300 * preco_farinha / FarinhaTrigoE;

                //---------------------------------------------------------------------------------------------------------------------------------------------------//               
                System.out.println("INGREDIENTES DOS RECHEIOS & COBERTURAS");

                System.out.println("Quantas gramas de suco de maracúja você comprou: ");
                Suco_maracujaE = entrada.nextDouble();
                while (Suco_maracujaE < 480) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 480ML: ");
                    Suco_maracujaE = entrada.nextDouble();
                }

                System.out.println("Quanto pagou: ");
                preco_Suco_maracujaE = entrada.nextDouble();

                e = 480 * preco_Suco_maracujaE / Suco_maracujaE;

                System.out.println("Quantas gramas de amido de milho você comprou: ");
                Amido_de_milhoE = entrada.nextDouble();
                while (Amido_de_milhoE < 20) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 20g: ");
                    Amido_de_milhoE = entrada.nextDouble();
                }

                System.out.println("Quanto pagou: ");
                preco_Amido_de_milho = entrada.nextDouble();

                f = 20 * preco_Amido_de_milho / Amido_de_milhoE;

                System.out.println("Quantos ovos você comprou: ");
                OvosME = entrada.nextDouble();
                while (OvosME < 6) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 6: ");
                    OvosME = entrada.nextDouble();
                }

                System.out.println("Quanto pagou: ");
                preco_ovos = entrada.nextDouble();

                g = 6 * preco_ovos / OvosME;

                System.out.println("Quantas gramas de açucar você comprou: ");
                acucarME = entrada.nextDouble();
                while (acucarME < 200) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 200g: ");
                    acucarME = entrada.nextDouble();
                }
                System.out.println("Quanto pagou: ");
                preco_acucarME = entrada.nextDouble();

                h = 200 * preco_acucarME / acucarME;

                System.out.println("Quantas ML de leite você comprou: ");
                leite_ME = entrada.nextDouble();
                while (leite_ME < 200) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 200ml: ");
                    leite_ME = entrada.nextDouble();
                }

                System.out.println("Quanto pagou: ");
                preco_leite_ME = entrada.nextDouble();

                i = 200 * preco_leite_ME / leite_ME;

                System.out.println("Quanta gramas de manteiga você comprou: ");
                manteigaME = entrada.nextDouble();
                while (manteigaME < 50) {
                    System.out.println("Quantidade insuficiênte, digite uma quantidade acima de 50g: ");
                    manteigaME = entrada.nextDouble();
                }

                System.out.println("Quanto pagou: ");
                preco_manteigaME = entrada.nextDouble();

                j = 50 * preco_manteigaME / manteigaME;

// -----------------------------------Processamento---------------------------------------------------------------------------------------------------/                
                total = a + b + c + d + e + f + g + h + i + j;

                if (total <= 30) {
                    pc = total / 15;
                    System.out.println("Esta dentro da faxetaria de preço!");
                    System.out.printf("%.2f\n", total);

                    System.out.println("Quanto custa cada bolo de pote? ");
                    precobolo = entrada.nextDouble();

                    lucro = precobolo - pc;
                    pocentagem_lucro = lucro / pc * 100;

                    System.out.printf("Seu lucro Sera: %.2f\n", lucro);
                    System.out.printf("Percentual: %.2f\n", pocentagem_lucro);

                } else {
                    System.out.println("Muito caro :(, vamos tentar de novo? ");
                    opc = entrada.next().charAt(0);
                }

                break;
            default:

                break;
        }

    }
    
}
