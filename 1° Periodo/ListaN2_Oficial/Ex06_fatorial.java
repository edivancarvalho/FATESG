/*
 Escreva um programa que calcule o fatorial de um número inteiro N fornecido pelo 
 usuário. Cuidado com valores inválidos!
 
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 * @fonte https://youtu.be/hWJli5VpbsE
 * @author edivan
 */
public class Ex06_fatorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, cont = 1;

        System.out.print("Digite um numero para fatoriar :: ");
        n = input.nextInt();

        while (n < 0) {
            System.out.println("Numero Invalido::");
            System.out.println(":: Digite novamente o numero");
            n = input.nextInt();
        }
        
        while (n > 1) {
            cont = cont * n;
            n--;

        }
        System.out.printf("%d\n", cont);

    }
}
