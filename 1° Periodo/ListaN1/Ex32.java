/**
 * Leia a média de um aluno em certa disciplina e mostre o conceito obtido nessa 
disciplina. A tabela de conceitos é dada a seguir:

 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.println("Informe a primeira nota: ");
        nota1 = input.nextFloat();

        System.out.println("Informe a segunda nota: ");
        nota2 = input.nextFloat();

        System.out.println("Informe a quantidade de falta: ");
        float falta = input.nextFloat();

        media = (nota1 + nota2) / 2;
        
        if (media >= 0 && media <= 10){
            if (media >= 9){
                System.out.println("Conceito: A");
            }
            else if (media >= 7){
                System.out.println("Conceito: B");
            }
            else if (media >= 6){
                System.out.println("Conceito:  C");
            }
            else{
                System.out.println("Conceito: P");
            }
        }
        else{
            System.out.println("Média Invalida");
        }

    }
    
}
