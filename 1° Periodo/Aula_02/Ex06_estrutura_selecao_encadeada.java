package Aula_02;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex06_estrutura_selecao_encadeada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.println("Informe a primeira nota: ");
        nota1 = input.nextFloat();

        System.out.println("Informe a segunda nota: ");
        nota2 = input.nextFloat();

        media = (nota1 + nota2) / 2;
        
        if (media >= 0 && media <= 10){
            if (media >= 9){
                System.out.println("Conceito: A");
            }
            else if (media >= 7){
                System.out.println("Conceito: B");
            }
            else if (media >= 5){
                System.out.println("Conceito:  C");
            }
            else{
                System.out.println("Conceito: D");
            }
        }
        else{
            System.out.println("Média Invalida");
        }

    }

}
