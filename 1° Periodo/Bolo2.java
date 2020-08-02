
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
public class Bolo2 {
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
        char opc = '.', opcb;
        double a, b, c, d, e, f, g, h, i, j, l, n;
        double preco_pote, pote;
         System.out.println("#-----------------------------------------------#");
        System.out.printf("#\t\tSENAI FATESG 2019/2 \t\t#\n");
        System.out.printf("#\t\t--- BOLO NO POTE ---\t\t#\n");
        System.out.println("#-----------------------------------------------#\n");
        
        System.out.println("Olá, de qual receita deseja realizar o orçamento?");
        do {
            System.out.println("1 - Leite ninho com morangos\n"
                    + "2 - Dois amores\n"
                    + "3 - Maracuja");
             System.out.printf("\t(Apenas o número correspondente) \n>:");
            opcb = entrada.next().charAt(0);
            while (opcb != '1' && opcb != '2' && opcb != '3') {
                System.out.println("Opcão INVALIDA, digite novamente: ");
                opcb = entrada.next().charAt(0);
            }

            switch (opcb) {
                case '1':
                    // Leite ninho com morangos: 
                    System.out.printf("Legal, você acaba de escolher.\nA receita de leite ninho com morangos!\n\n");

                    System.out.printf("Quantas gramas de açúcar você comprou:\n>:  ");
                    AcucarE = valida300();

                    System.out.printf("Quanto pagou: \n>: ");
                    preco_acuca = entrada.nextDouble();

                    a = 300 * preco_acuca / AcucarE;

                    System.out.printf("Quantas gramas de margarina você comprou: \n>: ");
                    MargarinaE = valida300();

                    System.out.printf("Quanto pagou: \n>: ");
                    preco_margarina = entrada.nextDouble();

                    b = 300 * preco_margarina / MargarinaE;

                    System.out.println("Quantos ovos (unidade): ");
                    OvosE = valida4();

                    System.out.println("Quanto pagou: ");
                    preco_ovos = entrada.nextDouble();

                    c = 4 * preco_ovos / OvosE;

                    System.out.println("Quantas gramas de farinha de trigo com fermento você comprou: ");
                    FarinhaTrigoE = valida300();

                    System.out.println("Quanto pagou: ");
                    preco_farinha = entrada.nextDouble();

                    d = 300 * preco_farinha / FarinhaTrigoE;

                    System.out.println("INGREDIENTES DOS RECHEIOS & COBERTURAS\n");

                    System.out.println("Quantas gramas de leite condensado você comprou: ");
                    Leite_condensadoE = valida600();

                    System.out.println("Quanto pagou: ");
                    preco_leite = entrada.nextDouble();

                    e = 600 * preco_leite / Leite_condensadoE;

                    System.out.println("Quantas gramas de creme de leite você comprou: ");
                    Creme_de_leiteE = valida600();

                    System.out.println("Quanto pagou: ");
                    Preco_creme = entrada.nextDouble();

                    f = 600 * Preco_creme / Creme_de_leiteE;

                    System.out.println("Quantas gramas de leite ninho você comprou: ");
                    Leite_ninhoE = valida600();

                    System.out.println("Quanto pagou: ");
                    preco_ninho = entrada.nextDouble();

                    g = 600 * preco_ninho / Leite_ninhoE;

                    System.out.println("Quantos morangos você comprou: ");
                    MorangoE = valida20();

                    System.out.println("Quanto pagou: ");
                    preco_morango = entrada.nextDouble();

                    h = 20 * preco_morango / MorangoE;

                    System.out.println("Quantos potes você comprou: ");
                    pote = entrada.nextDouble();

                    System.out.println("Quanto pagou:");
                    preco_pote = entrada.nextDouble();

                    i = 15 * preco_pote / pote;

                    total = a + b + c + d + e + f + g + h + i;

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

                        System.out.println("Deseja fazer mais algum orçamento?");
                        opc = entrada.next().charAt(0);
                        while (opc != 'n' && opc != 'N' && opc != 's' && opc != 'S') {
                            System.out.println("Opção invalida, Digite S/ para sim e N / para não.");
                            opc = entrada.next().charAt(0);
                        }

                    } else {
                        System.out.println("Muito caro :(, vamos tentar de novo? ");
                        opc = entrada.next().charAt(0);
                        while (opc != 'n' && opc != 'N' && opc != 's' && opc != 'S') {
                            System.out.println("Opção invalida, Digite S/ para sim e N / para não.");
                            opc = entrada.next().charAt(0);
                        }

                    }

                    break;
                case '2':

                    System.out.println("Legal, você acaba de escolher a receita de Dois Amores!");

                    System.out.println("Quantas gramas de açúcar você comprou: ");
                    AcucarE = valida300();

                    System.out.println("Quanto pagou: ");
                    preco_acuca = entrada.nextDouble();

                    a = 300 * preco_acuca / AcucarE;

                    System.out.println("Quantas gramas de margarina você comprou: ");
                    MargarinaE = valida300();

                    System.out.println("Quanto pagou: ");
                    preco_margarina = entrada.nextDouble();

                    b = 300 * preco_margarina / MargarinaE;

                    System.out.println("Quantos ovos (unidade): ");
                    OvosE = valida4();

                    System.out.println("Quanto pagou: ");
                    preco_ovos = entrada.nextDouble();

                    c = 4 * preco_ovos / OvosE;

                    System.out.println("Quantas gramas de farinha de trigo com fermento você comprou: ");
                    FarinhaTrigoE = valida300();

                    System.out.println("Quanto pagou: ");
                    preco_farinha = entrada.nextDouble();

                    d = 300 * preco_farinha / FarinhaTrigoE;

                    //-----------------------------------------------------------------------------------------------------------------------------------------------------------//               
                    System.out.println("INGREDIENTES DOS RECHEIOS & COBERTURAS");

                    System.out.println("Quantas gramas de leite condensado você comprou: ");
                    Leite_condensadoE = valida600();

                    System.out.println("Quanto pagou: ");
                    preco_leite = entrada.nextDouble();

                    e = 600 * preco_leite / Leite_condensadoE;

                    System.out.println("Quantas gramas de creme de leite você comprou: ");
                    Creme_de_leiteE = valida600();

                    System.out.println("Quanto pagou: ");
                    Preco_creme = entrada.nextDouble();

                    f = 600 * Preco_creme / Creme_de_leiteE;

                    System.out.println("Quantas gramas de chocolate em pó você comprou: ");
                    Chocoloca_poE = valida600();

                    System.out.println("Quanto pagou: ");
                    preco_Chocoloca_poE = entrada.nextDouble();

                    g = 600 * preco_Chocoloca_poE / Chocoloca_poE;

                    System.out.println("Quantos potes você comprou: ");
                    pote = entrada.nextDouble();

                    System.out.println("Quanto pagou:");
                    preco_pote = entrada.nextInt();

                    h = 15 * preco_pote / pote;

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

                        System.out.println("Deseja fazer mais algum orçamento?");
                        opc = entrada.next().charAt(0);
                        while (opc != 'n' && opc != 'N' && opc != 's' && opc != 'S') {
                            System.out.println("Opção invalida, Digite S/ para sim e N / para não.");
                            opc = entrada.next().charAt(0);
                        }

                    } else {
                        System.out.println("Muito caro :(, vamos tentar de novo? ");
                        opc = entrada.next().charAt(0);
                        while (opc != 'n' && opc != 'N' && opc != 's' && opc != 'S') {
                            System.out.println("Opção invalida, Digite S/ para sim e N / para não.");
                            opc = entrada.next().charAt(0);
                        }

                    }

                    break;
                case '3':

                    System.out.println("Legal, você acaba de escolher a receita de leite ninho com morangos!");

                    System.out.println("Quantas gramas de açúcar você comprou: ");
                    AcucarE = valida300();

                    System.out.println("Quanto pagou: ");
                    preco_acuca = entrada.nextDouble();

                    a = 300 * preco_acuca / AcucarE;

                    System.out.println("Quantas gramas de margarina você comprou: ");
                    MargarinaE = valida300();

                    System.out.println("Quanto pagou: ");
                    preco_margarina = entrada.nextDouble();

                    b = 300 * preco_margarina / MargarinaE;

                    System.out.println("Quantos ovos (unidade): ");
                    OvosE = valida4();

                    System.out.println("Quanto pagou: ");
                    preco_ovos = entrada.nextDouble();

                    c = 4 * preco_ovos / OvosE;

                    System.out.println("Quantas gramas de farinha de trigo com fermento você comprou: ");
                    FarinhaTrigoE = valida300();

                    System.out.println("Quanto pagou: ");
                    preco_farinha = entrada.nextDouble();

                    d = 300 * preco_farinha / FarinhaTrigoE;

                    //---------------------------------------------------------------------------------------------------------------------------------------------------//               
                    System.out.println("INGREDIENTES DOS RECHEIOS & COBERTURAS");

                    System.out.println("Quantos ML de suco de maracúja você comprou: ");
                    Suco_maracujaE = valida480();

                    System.out.println("Quanto pagou: ");
                    preco_Suco_maracujaE = entrada.nextDouble();

                    e = 480 * preco_Suco_maracujaE / Suco_maracujaE;

                    System.out.println("Quantas gramas de amido de milho você comprou: ");
                    Amido_de_milhoE = valida20m();

                    System.out.println("Quanto pagou: ");
                    preco_Amido_de_milho = entrada.nextDouble();

                    f = 20 * preco_Amido_de_milho / Amido_de_milhoE;

                    System.out.println("Quantos ovos você comprou: ");
                    OvosME = valida6();

                    System.out.println("Quanto pagou: ");
                    preco_ovos = entrada.nextDouble();

                    g = 6 * preco_ovos / OvosME;

                    System.out.println("Quantas gramas de açucar você comprou: ");
                    acucarME = valida200();

                    System.out.println("Quanto pagou: ");
                    preco_acucarME = entrada.nextDouble();

                    h = 200 * preco_acucarME / acucarME;

                    System.out.println("Quantas ML de leite você comprou: ");
                    leite_ME = valida200ml();

                    System.out.println("Quanto pagou: ");
                    preco_leite_ME = entrada.nextDouble();

                    i = 200 * preco_leite_ME / leite_ME;

                    System.out.println("Quantas gramas de manteiga você comprou: ");
                    manteigaME = valida50();

                    System.out.println("Quanto pagou: ");
                    preco_manteigaME = entrada.nextDouble();

                    j = 50 * preco_manteigaME / manteigaME;

                    System.out.println("Quantos potes você comprou: ");
                    pote = entrada.nextDouble();

                    System.out.println("Quanto pagou:");
                    preco_pote = entrada.nextDouble();

                    l = 15 * preco_pote / pote;

// -----------------------------------Processamento---------------------------------------------------------------------------------------------------/                
                    total = a + b + c + d + e + f + g + h + i + j + l;

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

                        System.out.println("Deseja fazer mais algum orçamento?");
                        opc = entrada.next().charAt(0);
                        while (opc != 'n' && opc != 'N' && opc != 's' && opc != 'S') {
                            System.out.println("Opção invalida, Digite S/ para sim e N / para não.");
                            opc = entrada.next().charAt(0);
                        }

                    } else {
                        System.out.println("Muito caro :(, vamos tentar de novo? ");
                        opc = entrada.next().charAt(0);
                        while (opc != 'n' && opc != 'N' && opc != 's' && opc != 'S') {
                            System.out.println("Opção invalida, Digite S/ para sim e N / para não.");
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
                while (x < 300) {
                    System.out.println("Quantidade insuficiente, Digite um valor acima de 300g: ");
                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros!");

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
                while (x < 4) {
                    System.out.println("Quantidade insuficiente, Digite um valor acima de 4 unidades: ");
                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros!");

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
                while (x < 600) {
                    System.out.println("Quantidade insuficiente, Digite um valor acima de 600g: ");
                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros!");

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
                while (x < 20) {
                    System.out.println("Quantidade insuficiente, Digite um valor acima de 20 unidades: ");
                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros!");

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
                while (x < 480) {
                    System.out.println("Quantidade insuficiente, Digite um valor acima de 480ML: ");
                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros!");

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
                while (x < 20) {
                    System.out.println("Quantidade insuficiente, Digite um valor acima de 20g: ");
                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros!");

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
                while (x < 200) {
                    System.out.println("Quantidade insuficiente, Digite um valor acima de 200g: ");
                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros!");

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
                while (x < 200) {
                    System.out.println("Quantidade insuficiente, Digite um valor acima de 200ML: ");
                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros!");

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
                while (x < 50) {
                    System.out.println("Quantidade insuficiente, Digite um valor acima de 50g: ");
                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros!");

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
                while (x < 6) {
                    System.out.println("Quantidade insuficiente, Digite um valor acima de 6 unidades: ");
                    x = Double.parseDouble(entrada.next());

                }

                teste = false;
            } catch (NumberFormatException e) {

                System.out.println("Digite apenas numeros!");

            }
        } while (teste);

        return x;

    }

    
}
