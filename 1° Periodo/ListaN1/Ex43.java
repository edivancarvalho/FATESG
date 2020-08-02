/**
 * Faça um algoritmo que receba o salário e um código correspondente ao cargo de um 
funcionário e imprima seu cargo, o salário, o percentual de aumento ao qual este funcionário 
tem direito segundo a tabela a seguir e o valor do aumento baseado no salário:

 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
                
        int codigo, Escriturario = 1, secretario = 2, caixa = 3, gerente = 4, diretor = 5;
        double salario, comisao;
        
        System.out.println("Digite seu salario; ");
        salario = input.nextDouble();
        
        System.out.println("Digite o Código:");
        codigo = input.nextInt();
        if (codigo > 0 || codigo <=5){
            if (codigo == 1){
                comisao = salario * .50;
                System.out.printf("\nCargo: Escriturario\nSalario Bruto: %.2f\nComisao: %.2f\n", salario + comisao, comisao);
            }
            else if (codigo == 2){
                comisao = salario * .35;
                System.out.printf("\nCargo: Secretario\nSalario Bruto: %.2f\nComisao: %.2f\n", salario + comisao, comisao);
            }
            else if (codigo == 3){
                comisao = salario * .20;
                System.out.printf("\nCargo: Caixa\nSalario Bruto: %.2f\nComisao: %.2f\n", salario + comisao, comisao);
            }
            else if (codigo == 4){
                comisao = salario * .10;
                System.out.printf("\nCargo: Gerente\nSalario Bruto: %.2f\nComisao: %.2f\n", salario + comisao, comisao);
            }
            else if (codigo == 5){
                comisao = salario;
                System.out.printf("\nCargo: Diretor\nSalario Bruto: %.2f\nComisao: %.2f\n", salario + comisao, comisao);
            } else{
                System.out.println("\nCodigo Invalido, procure o RH");
            }
                
        }
        else {
            System.out.println("\nCodigo Invalido, procure o RH");
        }
        
        
    }
    
}
