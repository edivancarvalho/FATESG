package aula_ads1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Exec08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double C; // temperatura em celsius;
        double F; // Temperatura em Fahrenheit;

        System.out.println("Digite a temperatura Fahrenheit é: ");
        F = input.nextDouble();

        C = 5.0 * (F - 32.0) / 9.0; //Formula
        System.out.println("Sua Temperatura em Graus Celsius é: " + C);

    }
}
