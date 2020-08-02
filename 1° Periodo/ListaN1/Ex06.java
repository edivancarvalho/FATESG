/**
 * Para o cálculo de vários tributos, a base de cálculo é o salário mínimo. Faça um programa 
que leia o valor do salário mínimo e o valor do salário de uma pessoa. Calcule e imprima 
quantos salários mínimos a pessoa ganha.
 * 
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex06 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double salarioM = 998.00, salarioPessoa, mediaS;
        
        System.out.println("Digite o seu salario: ");
        salarioPessoa = input.nextDouble();
        
        mediaS = salarioPessoa / salarioM;
        System.out.printf("O seu Salario é em media a %.2f salarios minimos%n", mediaS );
        
        
        
        
       
        
    }
    
}
