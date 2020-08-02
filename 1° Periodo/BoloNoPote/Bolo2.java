package BoloNoPote;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watla
 */
public class Bolo2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat qt = new DecimalFormat("###");

        // Entradas
        double AcucarE, MargarinaE, OvosE, FarinhaTrigoE;
        // Leite ninho com morangos: 
        double Leite_condensadoE, Creme_de_leiteE, Leite_ninhoE, MorangoE;
        // Dois amores
        double Chocoloca_poE;
        // Maracuja
        double Suco_maracujaE, Amido_de_milhoE, OvosME, acucarME;

        // Entrada de processamentos
        String local;
        double lucrototal;
        double total, tudo = 0, lucro, pocentagem_lucro, precobolo;
        double pote, preco_pote, manteigaME, preco_manteigaME, preco_acuca, preco_margarina, preco_ovos, preco_farinha, preco_leite;
        double preco_leite_ME, leite_ME, pc, preco_acucarME, preco_Amido_de_milho, Preco_creme, preco_ninho, preco_morango, preco_Chocoloca_poE, preco_Suco_maracujaE;
        char opc = '.', opcb;
        double a, b, c, d, e, f, g, h, i, j;
        
         lucro = entrada.nextDouble();

        System.out.println("BEM VINDO USUARIO(A)!");
        System.out.println("Olá, de qual receita deseja realizar o orçamento?");
        do {
            
            System.out.println("1 - Leite ninho com morangos\n"
                    + "2 - Dois amores\n"
                    + "3 - Maracuja");
            System.out.println("(Apenas o numero correspondente)");
            System.out.print("> ");
            opcb = entrada.next().charAt(0);
            while (opcb != '1' && opcb != '2' && opcb != '3') {
                System.out.println("Opcão INVALIDA, digite novamente: ");
                opcb = entrada.next().charAt(0);
            }

            switch (opcb) {

                case '1':
                    // Leite ninho com morangos: 

                    System.out.println("A receita de bolo no pote Leite ninho com morango para 15 bolos contém: \n"
                            + "Ingridiente............................Quantidade\n"
                            + "Açucar.................................300g\n"
                            + "Margarina gelada.......................300g\n"
                            + "Ovos...................................4 unidades\n"
                            + "Farinha de trigo com fermento..........300g\n"
                            + "Duas latas de leite condensado.........300g cada\n"
                            + "Duas latas de creme de leite...........300g cada\n"
                            + "Leite ninho............................600g\n"
                            + "Morangos...............................20 unidades\n");

                    System.out.println("Quantas gramas de açúcar você comprou? ");
                    System.out.print("> ");
                    AcucarE = valida300();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$:");
                    preco_acuca = preco();

                    a = 300 * preco_acuca / AcucarE;

                    System.out.println("Quantas gramas de margarina você comprou? ");
                    System.out.print("> ");
                    MargarinaE = valida300();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_margarina = preco();

                    b = 300 * preco_margarina / MargarinaE;

                    System.out.println("Quantos ovos (unidade)? ");
                    System.out.print("> ");
                    OvosE = intt();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_ovos = preco();

                    c = 4 * preco_ovos / OvosE;

                    System.out.println("Quantas gramas de farinha de trigo com fermento você comprou? ");
                    System.out.print("> ");
                    FarinhaTrigoE = valida300();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_farinha = preco();

                    d = 300 * preco_farinha / FarinhaTrigoE;

                    System.out.println("INGREDIENTES DOS RECHEIOS & COBERTURAS\n");

                    System.out.println("Quantas gramas de leite condensado você comprou? ");
                    System.out.print("> ");
                    Leite_condensadoE = valida600();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_leite = preco();

                    e = 600 * preco_leite / Leite_condensadoE;

                    System.out.println("Quantas gramas de creme de leite você comprou? ");
                    System.out.print("> ");
                    Creme_de_leiteE = valida600();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    Preco_creme = preco();

                    f = 600 * Preco_creme / Creme_de_leiteE;

                    System.out.println("Quantas gramas de leite ninho você comprou? ");
                    System.out.print("> ");
                    Leite_ninhoE = valida600();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_ninho = preco();

                    g = 600 * preco_ninho / Leite_ninhoE;

                    System.out.println("Quantos morangos você comprou? ");
                    System.out.print("> ");
                    MorangoE = valida20();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_morango = preco();

                    h = 20 * preco_morango / MorangoE;

                    System.out.println("Quantos potes você comprou? ");
                    System.out.print("> : ");
                    pote = intt();

                    System.out.println("Quanto pagou?");
                    System.out.print("> R$: ");
                    preco_pote = preco();

                    i = 15 * preco_pote / pote;

                    System.out.println("Quanto custa cada bolo de pote? ");
                    System.out.print("> R$: ");
                    precobolo = preco();

                    total = a + b + c + d + e + f + g + h + i;
                    pc = total / 15;
                    lucro = precobolo - pc;
                    pocentagem_lucro = lucro / pc * 100;
                    lucrototal = lucro * 15;

                    // -----------------------------------Processamento---------------------------------------------------------------------------------------------------/                
                    if (total <= 30) {
                        System.out.println("A receita de bolo no pote Leite ninho com morango para 15 bolos contém: \n"
                                + "Ingridiente............................Preço...........Quantidade\n"
                                + "Açucar................................." + NumberFormat.getCurrencyInstance().format(preco_acuca) + "........." + AcucarE + "g.\n"
                                + "Margarina gelada......................." + NumberFormat.getCurrencyInstance().format(preco_margarina) + "........." + MargarinaE + "g.\n"
                                + "Ovos..................................." + NumberFormat.getCurrencyInstance().format(preco_ovos) + "........." + qt.format(OvosE) + " Unidades.\n"
                                + "Farinha de trigo com fermento.........." + NumberFormat.getCurrencyInstance().format(preco_farinha) + "........." + FarinhaTrigoE + "g.\n"
                                + "Duas latas de leite condensado........." + NumberFormat.getCurrencyInstance().format(preco_leite) + "........." + Leite_condensadoE + "g.\n"
                                + "Duas latas de creme de leite..........." + NumberFormat.getCurrencyInstance().format(Preco_creme) + "........." + Creme_de_leiteE + "g.\n"
                                + "Leite ninho............................" + NumberFormat.getCurrencyInstance().format(preco_ninho) + "........." + Leite_ninhoE + "g.\n"
                                + "Morangos..............................." + NumberFormat.getCurrencyInstance().format(preco_morango) + "........." + qt.format(MorangoE) + " Unidades.\n"
                                + "Pote..................................." + NumberFormat.getCurrencyInstance().format(preco_pote) + "........." + qt.format(pote) + " Unidades.");

                        System.out.println("Esta dentro da faxetaria de preço!");
                        System.out.println(NumberFormat.getCurrencyInstance().format(total));
                        System.out.println("Seu lucro Sera: " + NumberFormat.getCurrencyInstance().format(lucro));
                        System.out.println("Lucro total: " + NumberFormat.getCurrencyInstance().format(lucrototal));
                        System.out.printf("Percentual de lucro: %.2f%%\n", pocentagem_lucro);

                        System.out.println("Deseja fazer mais algum orçamento?");
                        System.out.print("> ");
                        opc = entrada.next().charAt(0);
                        while (opc != 'n' && opc != 'N' && opc != 's' && opc != 'S') {
                            System.out.println("Opção invalida, Digite S/ para sim e N / para não.");
                            System.out.print("> ");
                            opc = entrada.next().charAt(0);
                        }

                    } else {
                        System.out.println("Esta FORA da faxetaria de preço desejavel!");
                        System.out.println("Sua receita de bolo no pote Leite ninho com morango contém: \n"
                                + "Ingridiente............................Preço...........Quantidade\n"
                                + "Açucar................................." + NumberFormat.getCurrencyInstance().format(preco_acuca) + "........." + AcucarE + "g.\n"
                                + "Margarina gelada......................." + NumberFormat.getCurrencyInstance().format(preco_margarina) + "........." + MargarinaE + "g.\n"
                                + "Ovos..................................." + NumberFormat.getCurrencyInstance().format(preco_ovos) + "........." + qt.format(OvosE) + " Unidades.\n"
                                + "Farinha de trigo com fermento.........." + NumberFormat.getCurrencyInstance().format(preco_farinha) + "........." + FarinhaTrigoE + "g.\n"
                                + "Duas latas de leite condensado........." + NumberFormat.getCurrencyInstance().format(preco_leite) + "........." + Leite_condensadoE + "g.\n"
                                + "Duas latas de creme de leite..........." + NumberFormat.getCurrencyInstance().format(Preco_creme) + "........." + Creme_de_leiteE + "g.\n"
                                + "Leite ninho............................" + NumberFormat.getCurrencyInstance().format(preco_ninho) + "\n"
                                + "Morangos..............................." + NumberFormat.getCurrencyInstance().format(preco_morango) + "\n"
                                + "Pote..................................." + NumberFormat.getCurrencyInstance().format(preco_pote));

                        System.out.println(NumberFormat.getCurrencyInstance().format(total));
                        System.out.println("Seu lucro Sera: " + NumberFormat.getCurrencyInstance().format(lucro));
                        System.out.println("Lucro total: " + NumberFormat.getCurrencyInstance().format(lucrototal));
                        System.out.printf("Percentual: %.2f%%\n", pocentagem_lucro);

                        System.out.println("Deseja fazer mais algum orçamento? (S/ Para Sim N/ Para Não)");
                        System.out.print("> ");
                        opc = entrada.next().charAt(0);
                        while (opc != 'n' && opc != 'N' && opc != 's' && opc != 'S') {
                            System.out.println("Opção invalida, Digite S/ para sim e N / para não.");
                            System.out.print("> ");
                            opc = entrada.next().charAt(0);
                        }

                    }

                    break;
                case '2':

                    System.out.println("Legal, você acaba de escolher a receita de Dois Amores!");

                    System.out.println("A receita de bolo no pote de Dois amores para 15 bolos contém: \n"
                            + "Ingridiente............................Quantidade\n"
                            + "Açucar.................................300g\n"
                            + "Margarina gelada.......................300g\n"
                            + "Ovos...................................4 unidades\n"
                            + "Farinha de trigo com fermento..........300g\n"
                            + "Duas latas de leite condensado.........300g cada\n"
                            + "Duas latas de creme de leite...........300g cada\n"
                            + "Chocolate em pó........................600g\n");

                    System.out.println("Quantas gramas de açúcar você comprou?");
                    System.out.print("> ");
                    AcucarE = valida300();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$ ");
                    preco_acuca = preco();

                    a = 300 * preco_acuca / AcucarE;

                    System.out.println("Quantas gramas de margarina você comprou? ");
                    System.out.print("> ");
                    MargarinaE = valida300();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_margarina = preco();

                    b = 300 * preco_margarina / MargarinaE;

                    System.out.println("Quantos ovos (unidade)? ");
                    System.out.print("> ");
                    OvosE = intt();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_ovos = preco();

                    c = 4 * preco_ovos / OvosE;

                    System.out.println("Quantas gramas de farinha de trigo com fermento você comprou? ");
                    System.out.print("> ");
                    FarinhaTrigoE = valida300();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_farinha = preco();

                    d = 300 * preco_farinha / FarinhaTrigoE;

                    //-----------------------------------------------------------------------------------------------------------------------------------------------------------//               
                    System.out.println("INGREDIENTES DOS RECHEIOS & COBERTURAS");

                    System.out.println("Quantas gramas de leite condensado você comprou? ");
                    System.out.print("> ");
                    Leite_condensadoE = valida600();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_leite = preco();

                    e = 600 * preco_leite / Leite_condensadoE;

                    System.out.println("Quantas gramas de creme de leite você comprou? ");
                    System.out.print("> ");
                    Creme_de_leiteE = valida600();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$:");
                    Preco_creme = preco();

                    f = 600 * Preco_creme / Creme_de_leiteE;

                    System.out.println("Quantas gramas de chocolate em pó você comprou? ");
                    System.out.print("> ");
                    Chocoloca_poE = valida600();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_Chocoloca_poE = preco();

                    g = 600 * preco_Chocoloca_poE / Chocoloca_poE;

                    System.out.println("Quantos potes você comprou? ");
                    System.out.print("> ");
                    pote = intt();

                    System.out.println("Quanto pagou?");
                    System.out.print("> R$: ");
                    preco_pote = preco();

                    i = 15 * preco_pote / pote;

                    System.out.println("Quanto custa cada bolo de pote? ");
                    System.out.print("> R$: ");
                    precobolo = preco();

                    total = a + b + c + d + e + f + g + i;
                    pc = total / 15;
                    lucro = precobolo - pc;
                    pocentagem_lucro = lucro / pc * 100;
                    lucrototal = lucro * 15;

                    // -----------------------------------Processamento---------------------------------------------------------------------------------------------------/                
                    if (total <= 30) {
                        System.out.println("Sua receita de bolo no pote Dois amores para 15 bolos: \n"
                                + "Ingridiente............................Preço...........Quantidade\n"
                                + "Açucar................................." + NumberFormat.getCurrencyInstance().format(preco_acuca) + "........." + AcucarE + "g.\n"
                                + "Margarina gelada......................." + NumberFormat.getCurrencyInstance().format(preco_margarina) + "........." + MargarinaE + "g.\n"
                                + "Ovos..................................." + NumberFormat.getCurrencyInstance().format(preco_ovos) + "........." + qt.format(OvosE) + " Unidades.\n"
                                + "Farinha de trigo com fermento.........." + NumberFormat.getCurrencyInstance().format(preco_farinha) + "........." + FarinhaTrigoE + "g.\n"
                                + "Duas latas de leite condensado........." + NumberFormat.getCurrencyInstance().format(preco_leite) + "........." + Leite_condensadoE + "g.\n"
                                + "Duas latas de creme de leite..........." + NumberFormat.getCurrencyInstance().format(Preco_creme) + "........." + Creme_de_leiteE + "g.\n"
                                + "Leite ninho............................" + NumberFormat.getCurrencyInstance().format(preco_Chocoloca_poE) + "........." + Chocoloca_poE + "g.\n"
                                + "Pote..................................." + NumberFormat.getCurrencyInstance().format(preco_pote) + "........." + qt.format(pote) + "unidades.");

                        System.out.println("Esta dentro da faxetaria de preço!");
                        System.out.println(NumberFormat.getCurrencyInstance().format(total));
                        System.out.println("Seu lucro Sera: " + NumberFormat.getCurrencyInstance().format(lucro));
                        System.out.println("Lucro total: " + NumberFormat.getCurrencyInstance().format(lucrototal));
                        System.out.printf("Percentual: %.2f%%\n", pocentagem_lucro);

                        System.out.println("Deseja fazer mais algum orçamento? S/ Para Sim N/ Para Não");
                        System.out.print("> ");
                        opc = entrada.next().charAt(0);
                        while (opc != 'n' && opc != 'N' && opc != 's' && opc != 'S') {
                            System.out.println("Opção invalida, Digite S/ para sim e N / para não.");
                            System.out.print("> ");
                            opc = entrada.next().charAt(0);
                        }

                    } else {
                        System.out.println("Esta FORA da faxetaria de preço desejavel!");
                        System.out.println("Sua receita de bolo no pote Dois amores para 15 bolos: \n"
                                + "Ingridiente............................Preço...........Quantidade\n"
                                + "Açucar................................." + NumberFormat.getCurrencyInstance().format(preco_acuca) + "........." + AcucarE + "g.\n"
                                + "Margarina gelada......................." + NumberFormat.getCurrencyInstance().format(preco_margarina) + "........." + MargarinaE + "g.\n"
                                + "Ovos..................................." + NumberFormat.getCurrencyInstance().format(preco_ovos) + "........." + qt.format(OvosE) + " Unidades.\n"
                                + "Farinha de trigo com fermento.........." + NumberFormat.getCurrencyInstance().format(preco_farinha) + "........." + FarinhaTrigoE + "g.\n"
                                + "Duas latas de leite condensado........." + NumberFormat.getCurrencyInstance().format(preco_leite) + "........." + Leite_condensadoE + "g.\n"
                                + "Duas latas de creme de leite..........." + NumberFormat.getCurrencyInstance().format(Preco_creme) + "........." + Creme_de_leiteE + "g.\n"
                                + "Leite ninho............................" + NumberFormat.getCurrencyInstance().format(preco_Chocoloca_poE) + "........." + Chocoloca_poE + "g.\n"
                                + "Pote..................................." + NumberFormat.getCurrencyInstance().format(preco_pote) + "........." + qt.format(pote) + "unidades.");

                        System.out.println(NumberFormat.getCurrencyInstance().format(total));
                        System.out.println("Seu lucro Sera: " + NumberFormat.getCurrencyInstance().format(lucro));
                        System.out.println("Lucro total: " + NumberFormat.getCurrencyInstance().format(lucrototal));
                        System.out.printf("Percentual: %.2f%%\n", pocentagem_lucro);

                        System.out.println("Deseja fazer mais algum orçamento? (S/ Para Sim N/ Para Não)");
                        System.out.print("> ");
                        opc = entrada.next().charAt(0);
                        while (opc != 'n' && opc != 'N' && opc != 's' && opc != 'S') {
                            System.out.println("Opção invalida, Digite S/ para sim e N / para não.");
                            System.out.print("> ");
                            opc = entrada.next().charAt(0);
                        }

                    }

                    break;
                case '3':

                    System.out.println("Legal, você acaba de escolher a receita de Maracuja!");

                    System.out.println("A receita de bolo no pote Maracuja para 15 bolos contém: \n"
                            + "Ingridiente............................Quantidade\n"
                            + "Açucar.................................300g\n"
                            + "Margarina gelada.......................300g\n"
                            + "Ovos...................................4 unidades\n"
                            + "Farinha de trigo com fermento..........300g\n"
                            + "Suco de maracujá.......................480ml\n"
                            + "Amido de milho.........................20g\n"
                            + "Gemas..................................6 unidades\n"
                            + "Água...................................250ml\n"
                            + "Açucar.................................200g\n"
                            + "Leite..................................200ml\n"
                            + "Manteiga...............................50g\n");

                    System.out.println("Quantas gramas de açúcar você comprou? ");
                    System.out.print("> ");
                    AcucarE = valida300();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_acuca = preco();

                    a = 300 * preco_acuca / AcucarE;

                    System.out.println("Quantas gramas de margarina você comprou? ");
                    System.out.print("> ");
                    MargarinaE = valida300();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_margarina = preco();

                    b = 300 * preco_margarina / MargarinaE;

                    System.out.println("Quantos ovos? (unidade) ");
                    System.out.print("> ");
                    OvosE = intt();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$? ");
                    preco_ovos = preco();

                    c = 4 * preco_ovos / OvosE;

                    System.out.println("Quantas gramas de farinha de trigo com fermento você comprou? ");
                    System.out.print("> ");
                    FarinhaTrigoE = valida300();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_farinha = preco();

                    d = 300 * preco_farinha / FarinhaTrigoE;

                    //---------------------------------------------------------------------------------------------------------------------------------------------------//               
                    System.out.println("INGREDIENTES DOS RECHEIOS & COBERTURAS");

                    System.out.println("Quantas gramas de suco de maracúja você comprou? ");
                    System.out.print("> ");
                    Suco_maracujaE = valida480();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_Suco_maracujaE = preco();

                    e = 480 * preco_Suco_maracujaE / Suco_maracujaE;

                    System.out.println("Quantas gramas de amido de milho você comprou? ");
                    System.out.print("> ");
                    Amido_de_milhoE = valida20m();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_Amido_de_milho = preco();

                    f = 20 * preco_Amido_de_milho / Amido_de_milhoE;

                    System.out.println("Quantos ovos você comprou? ");
                    System.out.print("> ");
                    OvosME = valida6();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_ovos = preco();

                    g = 6 * preco_ovos / OvosME;

                    System.out.println("Quantas gramas de açucar você comprou? ");
                    System.out.print("> ");
                    acucarME = valida200();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_acucarME = preco();

                    h = 200 * preco_acucarME / acucarME;

                    System.out.println("Quantas ML de leite você comprou? ");
                    System.out.print("> ");
                    leite_ME = valida200ml();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_leite_ME = preco();

                    i = 200 * preco_leite_ME / leite_ME;

                    System.out.println("Quanta gramas de manteiga você comprou? ");
                    System.out.print("> ");
                    manteigaME = valida50();

                    System.out.println("Quanto pagou? ");
                    System.out.print("> R$: ");
                    preco_manteigaME = preco();

                    j = 50 * preco_manteigaME / manteigaME;

                    System.out.println("Quantos potes você comprou? ");
                    System.out.print("> ");
                    pote = intt();

                    System.out.println("Quanto pagou?");
                    System.out.print("> R$: ");
                    preco_pote = preco();

                    double l;

                    l = 15 * preco_pote / pote;

                    System.out.println("Quanto custa cada bolo de pote? ");
                    System.out.print("> R$: ");
                    precobolo = preco();

                    total = a + b + c + d + e + f + g + h + i + j + l;
                    pc = total / 15;
                    lucro = precobolo - pc;
                    pocentagem_lucro = lucro / pc * 100;
                    lucrototal = lucro * 15;

// -----------------------------------Processamento---------------------------------------------------------------------------------------------------/        
                    int z = 0;
                    if (total <= 30) {
                        System.out.println("Sua receita de bolo no pote de Maracuja: \n"
                                + "Ingridiente............................Preço...........Quantidade\n"
                                + "Açucar................................." + NumberFormat.getCurrencyInstance().format(preco_acuca) + "........." + AcucarE + "g.\n"
                                + "Margarina gelada......................." + NumberFormat.getCurrencyInstance().format(preco_margarina) + "........." + MargarinaE + "g.\n"
                                + "Ovos..................................." + NumberFormat.getCurrencyInstance().format(preco_ovos) + "........." + qt.format(OvosE) + " Unidades.\n"
                                + "Farinha de trigo com fermento.........." + NumberFormat.getCurrencyInstance().format(preco_farinha) + "........." + FarinhaTrigoE + "g.\n"
                                + "Suco de maracujá......................." + NumberFormat.getCurrencyInstance().format(preco_Suco_maracujaE) + "........." + Suco_maracujaE + "g.\n"
                                + "Gemas.................................." + NumberFormat.getCurrencyInstance().format(OvosME) + "........." + qt.format(OvosME) + "g.\n"
                                + "Agua..................................." + NumberFormat.getCurrencyInstance().format(0) + "........." + (z) + "g.\n"
                                + "Açucar................................." + NumberFormat.getCurrencyInstance().format(preco_acucarME) + "........." + acucarME + "g.\n"
                                + "Leite.................................." + NumberFormat.getCurrencyInstance().format(preco_leite_ME) + "........." + leite_ME + "g.\n"
                                + "Manteiga..............................." + NumberFormat.getCurrencyInstance().format(preco_manteigaME) + "........." + manteigaME + "g.\n"
                                + "Pote..................................." + NumberFormat.getCurrencyInstance().format(preco_pote) + "........." + qt.format(pote) + "g.\n");
                        System.out.println("Total: ");
                        System.out.println(NumberFormat.getCurrencyInstance().format(total));
                        System.out.println("Seu lucro Sera: " + NumberFormat.getCurrencyInstance().format(lucro));
                        System.out.println("Lucro total: " + NumberFormat.getCurrencyInstance().format(lucrototal));
                        System.out.printf("Percentual: %.2f%%\n", pocentagem_lucro);

                        System.out.println("Deseja fazer mais algum orçamento? S/ Para Sim N/ Para não");
                        System.out.print("> ");
                        opc = entrada.next().charAt(0);
                        while (opc != 'n' && opc != 'N' && opc != 's' && opc != 'S') {
                            System.out.println("Opção invalida, Digite S/ para sim e N / para não.");
                            System.out.print("> ");
                            opc = entrada.next().charAt(0);
                        }

                    } else {
                        System.out.println("Esta FORA da faxetaria de preço desejavel!");
                        System.out.println("Sua receita de bolo no pote de Maracuja: \n"
                                + "Ingridiente............................Preço...........Quantidade\n"
                                + "Açucar................................." + NumberFormat.getCurrencyInstance().format(preco_acuca) + "........." + AcucarE + "g.\n"
                                + "Margarina gelada......................." + NumberFormat.getCurrencyInstance().format(preco_margarina) + "........." + MargarinaE + "g.\n"
                                + "Ovos..................................." + NumberFormat.getCurrencyInstance().format(preco_ovos) + "........." + qt.format(OvosE) + " Unidades.\n"
                                + "Farinha de trigo com fermento.........." + NumberFormat.getCurrencyInstance().format(preco_farinha) + "........." + FarinhaTrigoE + "g.\n"
                                + "Suco de maracujá......................." + NumberFormat.getCurrencyInstance().format(preco_Suco_maracujaE) + "........." + Suco_maracujaE + "g.\n"
                                + "Gemas.................................." + NumberFormat.getCurrencyInstance().format(OvosME) + "........." + qt.format(OvosME) + "g.\n"
                                + "Agua..................................." + NumberFormat.getCurrencyInstance().format(0) + "........." + (z) + "g.\n"
                                + "Açucar................................." + NumberFormat.getCurrencyInstance().format(preco_acucarME) + "........." + acucarME + "g.\n"
                                + "Leite.................................." + NumberFormat.getCurrencyInstance().format(preco_leite_ME) + "........." + leite_ME + "g.\n"
                                + "Manteiga..............................." + NumberFormat.getCurrencyInstance().format(preco_manteigaME) + "........." + manteigaME + "g.\n"
                                + "Pote..................................." + NumberFormat.getCurrencyInstance().format(preco_pote) + "........." + qt.format(pote) + "g.\n");
                        System.out.println("Total: ");
                        System.out.println(NumberFormat.getCurrencyInstance().format(total));
                        System.out.println("Seu lucro Sera: " + NumberFormat.getCurrencyInstance().format(lucro));
                        System.out.println("Lucro total: " + NumberFormat.getCurrencyInstance().format(lucrototal));
                        System.out.printf("Percentual de lucro: %.2f%%\n", pocentagem_lucro);

                        System.out.println("Deseja fazer mais algum orçamento? (S/ Para Sim N/ Para Não)");
                        System.out.print("> ");
                        opc = entrada.next().charAt(0);
                        while (opc != 'n' && opc != 'N' && opc != 's' && opc != 'S') {
                            System.out.println("Opção invalida, Digite S/ para sim e N / para não.");
                            System.out.print("> ");
                            opc = entrada.next().charAt(0);
                        }

                    }

                    break;
                default:

                    break;
            }

        } while (opc != 'n' && opc != 'N');

    }

    public static double valida300() {
        Scanner entrada = new Scanner(System.in);
        double x = 0;
        boolean teste = true;
        do {
            try {
                x = Double.parseDouble(entrada.next());

                while (x < 300 || x > 100000) {
                    if (x < 300) {
                        System.out.println("Quantidade insuficiente, Digite um valor acima de 300g: ");
                    } else {
                        System.out.println("Quantidade muito grande, Digite um valor abaixo de 100kg (100.000g)");
                    }

                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros: ");

            }
        } while (teste);

        return x;

    }

    public static double valida4() {
        Scanner entrada = new Scanner(System.in);
        double x = 0;
        boolean teste = true;
        do {
            try {

                x = Double.parseDouble(entrada.next());
                while (x < 4 || x > 100) {
                    if (x < 4) {
                        System.out.println("Quantidade insuficiente, Digite uma quantidade acima de 4 unidades: ");
                    } else {
                        System.out.println("Quantidade muito grande, Digite uma quantidade abaixo de 100 unidades: ");
                    }

                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros: ");

            }
        } while (teste);

        return x;

    }

    public static double valida600() {
        Scanner entrada = new Scanner(System.in);
        double x = 0;
        boolean teste = true;
        do {
            try {
                x = Double.parseDouble(entrada.next());
                while (x < 600 || x > 100000) {
                    if (x < 600) {
                        System.out.println("Quantidade insuficiente, Digite uma quantidade acima de 600g: ");

                    } else {
                        System.out.println("Quantidade muito grande, digite um quantidade abaixo de 100kg (100.000g)");
                    }
                    x = Double.parseDouble(entrada.next());
                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros: ");

            }
        } while (teste);

        return x;

    }

    public static double valida20() {
        Scanner entrada = new Scanner(System.in);
        double x = 0;
        boolean teste = true;
        do {
            try {
                x = Double.parseDouble(entrada.next());
                while (x < 20 || x > 200) {
                    if (x < 20) {
                        System.out.println("Quantidade insuficiente, Digite uma quantidade acima de 20 unidades: ");

                    } else {
                        System.out.println("Quantidade muito grande, digite um quantidade abaixo de 200 unidades:");
                    }
                    x = Double.parseDouble(entrada.next());
                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros: ");

            }
        } while (teste);

        return x;

    }

    public static double valida480() {
        Scanner entrada = new Scanner(System.in);
        double x = 0;
        boolean teste = true;
        do {
            try {
                x = Double.parseDouble(entrada.next());
                while (x < 480 || x > 100000) {
                    if (x < 480) {
                        System.out.println("Quantidade insuficiente, Digite uma quantidade acima de 480ML: ");
                    } else {
                        System.out.println("Quantidade muito grande, digite uma quantidade abaixo de 100.000ml:");
                    }
                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros: ");

            }
        } while (teste);

        return x;

    }

    public static double valida20m() {
        Scanner entrada = new Scanner(System.in);
        double x = 0;
        boolean teste = true;
        do {
            try {
                x = Double.parseDouble(entrada.next());
                while (x < 20 || x > 100000) {
                    if (x < 20) {
                        System.out.println("Quantidade insuficiente, Digite uma quantidade acima de 20g: ");
                    } else {
                        System.out.println("Quantidade muito grande, digite uma quantidade abaixo de 100kg (100.000g)");
                    }
                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros: ");

            }
        } while (teste);

        return x;

    }

    public static double valida200() {
        Scanner entrada = new Scanner(System.in);
        double x = 0;
        boolean teste = true;
        do {
            try {
                x = Double.parseDouble(entrada.next());
                while (x < 200 || x > 100000) {
                    if (x < 200) {
                        System.out.println("Quantidade insuficiente, Digite uma quantidade acima de 200g: ");
                    } else {
                        System.out.println("Quantidade muito grande, digite uma quantidade abaixo de 100kg (100.000g): ");
                    }
                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros: ");

            }
        } while (teste);

        return x;

    }

    public static double valida200ml() {
        Scanner entrada = new Scanner(System.in);
        double x = 0;
        boolean teste = true;
        do {

            try {
                x = Double.parseDouble(entrada.next());
                while (x < 200 || x > 100000) {
                    if (x < 200) {
                        System.out.println("Quantidade insuficiente, Digite uma quantidade valor acima de 200ML: ");
                    } else {
                        System.out.println("Quantidade muito grande, digite uma quantidade abaixo de 100.000ml");
                    }

                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros: ");

            }
        } while (teste);

        return x;

    }

    public static double valida50() {
        Scanner entrada = new Scanner(System.in);
        double x = 0;
        boolean teste = true;
        do {
            try {
                x = Double.parseDouble(entrada.next());
                while (x < 50 || x > 100000) {
                    if (x < 50) {
                        System.out.println("Quantidade insuficiente, Digite uma quantidade acima de 50g: ");
                    } else {
                        System.out.println("Quantidade muito grnade, digite uma quantidade abaixo de 100kg (100.000g): ");
                    }

                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros: ");

            }
        } while (teste);

        return x;

    }

    public static double valida6() {
        Scanner entrada = new Scanner(System.in);
        double x = 0;
        boolean teste = true;
        do {
            try {
                x = Double.parseDouble(entrada.next());
                while (x < 6 || x > 500) {
                    if (x < 6) {
                        System.out.println("Quantidade insuficiente, Digite um valor acima de 6 unidades: ");
                    } else {
                        System.out.println("Quantidade muito grande, Digite uma quantidade abaixo de 500 unidades: ");
                    }

                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros: ");

            }
        } while (teste);

        return x;

    }

    public static double preco() {
        Scanner entrada = new Scanner(System.in);
        double x = 0;
        boolean teste = true;
        do {
            try {
                x = Double.parseDouble(entrada.next());
                while (x < 0.1 || x > 100000) {
                    if (x < 0.1) {
                        System.out.println("Valor muito abaixo, digite novamente: ");
                    } else {
                        System.out.println("Valor MUITO alto, acho que não custa isso tudo, digite novamente: ");
                    }
                    x = Double.parseDouble(entrada.next());
                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros: ");

            }
        } while (teste);

        return x;

    }

    public static double intt() {
        Scanner entrada = new Scanner(System.in);
        int x = 0;
        boolean teste = true;
        do {
            try {
                x = Integer.parseInt(entrada.next());
                while (x < 4 || x > 500) {
                    if (x < 4) {
                        System.out.println("Quantidade insuficiente, Digite um valor acima de 4 unidades: ");
                    } else {
                        System.out.println("Quantidade muito grande, digite uma quantidade abaixo de 500 unidades: ");
                    }
                    x = Integer.parseInt(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros: ");

            }
        } while (teste);

        return x;

    }

    public static double intt20() {
        Scanner entrada = new Scanner(System.in);
        int x = 0;
        boolean teste = true;
        do {
            try {
                while (x < 20 || x > 1000) {
                    if (x < 20) {
                        System.out.println("Quantidade insuficiente, Digite um valor acima de 20 unidades: ");
                    } else {
                        System.out.println("Quantidade muito grande, digite uma quantidade abaixo de 1000 unidades: ");
                    }
                    x = Integer.parseInt(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros: ");

            }
        } while (teste);

        return x;

    }

}
