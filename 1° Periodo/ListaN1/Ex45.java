/**
 * Uma locadora tem as seguintes regras para aluguel de DVDs:
 * * 
- Às segundas, terças e quintas (2, 3 e 5) : desconto de 40% em relação ao
 * preço normal; - Às quartas , sextas, sábados e domingos (4,6 ,7 e 1): preço
 * normal; - Aluguel de DVDs comuns: preço normal; - Aluguel de lançamentos:
 * acréscimo de 15% em relação ao preço normal.
 * 
* Desenvolver um programa para ler o preço normal do DVD alugado (em R$) e sua
 * categoria (comum ou lançamento). Calcular e imprimir o preço final que será
 * pago pela locação do DVD.
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex45 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, sim, nao;
        double segundas = 0.40, terças = .40, quintas = .40; //com desconto de 40%
        double quartas, sextas, sabados, domingo; // preço normal

        double precoNormal, lançamento = .15; //lançamento = 15%

        //System.out.println("valor: ");
        //precoNormal = input.nextDouble();
        //System.out.printf("%.2f\n",precoNormal + lançamento);
        System.out.println("#=======================================#");
        System.out.println("# Edivan Carvalho | FATESG - SENAI 2019 #");
        System.out.println("#=======================================#");
        System.out.println("Digite o valor da locação R$ :: ");
        precoNormal = input.nextDouble();

        System.out.printf("Que dia semana é hoje:\n"
                + "\n (1)Domingo:"
                + "\n (2)Segunda:"
                + "\n (3)Terça"
                + "\n (4)Quarta"
                + "\n (5)Quinta"
                + "\n (6)Sexta"
                + "\n (7)Sábado\n\n::");
        menu = input.nextInt();
        switch (menu) {

            case 1: {
                System.out.printf("O DVD é Lancamento? (1)sim (0)Nao :");
                sim = input.nextInt();
                if (sim == 1) {
                    System.out.printf("Valor a paga R$ %.2f\n", precoNormal + (precoNormal * lançamento));
                } else {
                    System.out.printf("Valor a paga R$ %.2f\n", precoNormal);
                }
            }
            break;
            case 2: {
                System.out.printf("O DVD é Lancamento? (1)sim (0)Nao :");
                sim = input.nextInt();
                if (sim == 1) {
                    System.out.printf("Valor a paga R$ %.2f\n"
                            + "", precoNormal - ((precoNormal * segundas) - (precoNormal * lançamento)));
                } else {
                    System.out.printf("Valor a paga R$ %.2f\n", precoNormal - (precoNormal * segundas));
                }
            }
            break;
            case 3: {
                System.out.printf("O DVD é Lancamento? (1)sim (0)Nao :");
                sim = input.nextInt();
                if (sim == 1) {
                    System.out.printf("Valor a paga R$ %.2f\n"
                            + "", precoNormal - ((precoNormal * segundas) - (precoNormal * lançamento)));
                } else {
                    System.out.printf("Valor a paga R$ %.2f\n", precoNormal - (precoNormal * segundas));
                }
            }
            break;
            case 4: {
                System.out.printf("O DVD é Lancamento? (1)sim (0)Nao :");
                sim = input.nextInt();
                if (sim == 1) {
                    System.out.printf("Valor a paga R$ %.2f\n", precoNormal + (precoNormal * lançamento));
                } else {
                    System.out.printf("Valor a paga R$ %.2f\n", precoNormal);
                }
            }
            break;
            case 5: {
                System.out.printf("O DVD é Lancamento? (1)sim (0)Nao :");
                sim = input.nextInt();
                if (sim == 1) {
                    System.out.printf("Valor a paga R$ %.2f\n"
                            + "", precoNormal - ((precoNormal * segundas) - (precoNormal * lançamento)));
                } else {
                    System.out.printf("Valor a paga R$ %.2f\n", precoNormal - (precoNormal * segundas));
                }
            }
            break;
            case 6: {
                System.out.printf("O DVD é Lancamento? (1)sim (0)Nao :");
                sim = input.nextInt();
                if (sim == 1) {
                    System.out.printf("Valor a paga R$ %.2f\n", precoNormal + (precoNormal * lançamento));
                } else {
                    System.out.printf("Valor a paga R$ %.2f\n", precoNormal);
                }
            }
            break;
            case 7: {
                System.out.printf("O DVD é Lancamento? (1)sim (0)Nao :");
                sim = input.nextInt();
                if (sim == 1) {
                    System.out.printf("Valor a paga R$ %.2f\n", precoNormal + (precoNormal * lançamento));
                } else {
                    System.out.printf("Valor a paga R$ %.2f\n", precoNormal);
                }
            }
            break;
            default:
                System.out.println("Escolhar um dia da semana de 1 a 7,\n"
                        + "Esse dia é Invalido!!");

        }
    }

}
