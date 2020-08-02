/**
 * Escreva um programa que receba quatro números e imprima a média ponderada, 
    sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4
 * 
 * Fonte de calculo
 * https://brasilescola.uol.com.br/o-que-e/matematica/o-que-e-media-ponderada.htm
 * 
 * M = P1N1 + P2N2 + P3N3 + P4N4
           P1 + P2 + P3 +P4
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float n1, n2, n3 ,n4;
        float Media, p1 = 1, p2 = 3, p3 = 5, p4 = 4;
        
        System.out.println("Entre com o primerio numero: ");
        n1 = input.nextFloat();
        
        System.out.println("Entre com o primerio numero: ");
        n2 = input.nextFloat();
        
        System.out.println("Entre com o primerio numero: ");
        n3 = input.nextFloat();
        
        System.out.println("Entre com o primerio numero: ");
        n4 = input.nextFloat();
        
        Media = (p1 * n1 + p2 * n2 + p3 * n3 + p4 * n4 ) / (p1 + p2 + p3 + p4) ;
        //Media = P1 * N1 + P2 * N2 + P3 * N3 + P4 * N4 / P1 + P2 + P3 + P4;
        System.out.printf("A media é : %.1f\n",Media);
    }
    
}
