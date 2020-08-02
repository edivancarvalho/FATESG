//11. Escreva um programa que leia uma quantidade inteira N e, em seguida, 
//leia N valores double. 
//Calcule e informe a média dos N valores lidos.
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        int quantidade;
        double numeroDecimal, media;
        double soma = 0;
        
        System.out.println("Quantos numeros ira digitar ? :: ");
        quantidade = input.nextInt();
        
        //Enquato
        while (quantidade > i ){
            System.out.println("Digite o numero em Decimal Ex: [2,0 | 4,5]");
            numeroDecimal = input.nextDouble();
            soma += numeroDecimal;
            i++;
        }
        media = soma / quantidade;
        
        System.out.printf("Média dos %d valor(es) informado(s): %.2f%n", quantidade, media);
    }
    
}
