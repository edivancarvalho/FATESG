package UriProva;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1048 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double salario, novoSalario, reajuste, percentual;
        novoSalario = reajuste = percentual = 0.0;

        salario = input.nextDouble();

        if (salario > 0 && salario <= 400.0) {
            percentual = 0.15;
        } else if (salario <= 800.0) {
            percentual = 0.12;
        } else if (salario <= 1200.0) {
            percentual = 0.10;
        } else if (salario <= 2000.0) {
            percentual = 0.07;
        } else {
            percentual = 0.04;
        }

        reajuste = salario * percentual;
        novoSalario = salario + reajuste;
        percentual *= 100;

        System.out.printf("Novo salario: %.2f%n"
                + "Reajuste ganho: %.2f\n"
                + "Em percentual: %.0f %%\n",
                novoSalario,
                reajuste,
                percentual
        );
    }
}


