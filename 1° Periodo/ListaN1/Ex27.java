/**
 * Escreva um programa que leia três valores inteiros distintos (assuma que o usuário 
digitará valores diferentes entre si) e os armazene nas variáveis A, B e C. Em seguida, 
descubra o menor valor e o armazene em uma variável denominada MENOR; o maior valor, 
coloque-o na variável MAIOR e o valor intermediário, na variável INTER. Imprima os 
valores em ordem crescente, ou seja, imprima as variáveis MENOR, INTER e MAIOR, 
nessa ordem.

 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b,c;
        int menor, inter, maior;
        
        System.out.println("Digite o número de A:");
        a = input.nextInt();
        
        System.out.println("Digite o número de B:");
        b = input.nextInt();
        
        System.out.println("Digite o número de C:");
        c = input.nextInt();
                
        //==============================================================
        if (a < b && a < c) 
            // sim, A é menor
            menor = a;
            // NAO, descer..
        else if (b < c)
            //sim, B é menor
            menor = b;
            //Nao, entao C é menor
        else 
            menor = c;
        System.out.printf("\nMenor: %d\n", menor);
        //==============================================================
         //==============================================================
        //if (a > b && a < c )
        if (a > b && a < c || a<b && a>c )
            //sim, entao A e inter
            inter = a;
            //Nao, descer...

        //else if (b > a && b < c ) // erro esta aqui ou ... ESTAVA AQUI.
        else if (b > a && b < c || b < a && b > c) // erro esta aqui ou
            //sim, 
            inter = b;
        else 
            inter = c; // aqui
        System.out.printf("\nInter: %d\n", inter);
        //==============================================================
        if (a > b && a > c)
            // sim, entao A é maior
            maior = a;
            // Nao, descer...
        else if (b > c)
            //sim; entao B é maior
            maior = b;
            // nao, entao C é maior
        else
            maior = c;
        System.out.printf("\nMaior: %d\n", maior);
    }    
}
