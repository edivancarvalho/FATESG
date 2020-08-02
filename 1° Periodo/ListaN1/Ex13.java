/***
 * Para o cálculo de vários tributos, a base de cálculo é o salário mínimo. Faça um 
    programa que leia o valor do salário mínimo e o valor do salário de uma pessoa. Calcule 
    e imprima quantos salários mínimos a pessoa ganha.
 * 
 * 
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome;
        float salarioMinimo, salario, mediaSalario;
        
        System.out.println("Escreve o salario minimo: ");
        salarioMinimo = input.nextFloat();
        
        System.out.println("Digite o seu salario: ");
        salario = input.nextFloat();
        
        mediaSalario =  salario / salarioMinimo;
        
        System.out.printf("Você receber %.2f Salario minimos\n" , mediaSalario);
        
    }
}
