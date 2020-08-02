/**
 * Faça um programa que leia uma data (dia, mês e ano, em uma variável inteira
 * cada), e escreva a mesma data no formato dia de (mês por extenso) de ano. *
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex39 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int data, dia, ano, mes1;
        //String mes;

        System.out.println("digita o dia:");
        dia = input.nextInt();

        System.out.println("digita o mes:");
        mes1 = input.nextInt();

        System.out.println("digita o ano:");
        ano = input.nextInt();

        switch (mes1) {
            case 1:
                System.out.printf("%d de Janeiro de %d\n", dia, ano);
                break;
            case 2:
                System.out.printf("%d de Fevereiro de %d\n", dia, ano);
                break;
            case 3:
                System.out.printf("%d de Março de %d\n", dia, ano);
                break;
            case 4:
                System.out.printf("%d de Abril de %d\n", dia, ano);
                break;
            case 5:
                System.out.printf("%d de Maio de %d\n", dia, ano);
                break;
            case 6:
                System.out.printf("%d de Junho de %d\n", dia, ano);
                break;
            case 7:
                System.out.printf("%d de Julho de %d\n", dia, ano);
                break;
            case 8:
                System.out.printf("%d de Agosto de %d\n", dia, ano);
                break;
            case 9:
                System.out.printf("%d de Setembro de %d\n", dia, ano);
                break;
            case 10:
                System.out.printf("%d de Outobro de %d\n", dia, ano);
                break;
            case 11:
                System.out.printf("%d de Novembro de %d\n", dia, ano);
                break;
            case 12:
                System.out.printf("%d de Dezembro de %d\n", dia, ano);
                break;
        }

    }

}

