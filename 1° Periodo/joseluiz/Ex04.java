/**
 * Desenvolver um algoritmo para ler os comprimentos dos três lados de um triângulo (L1, L2 e L3) e
calcular a área do triângulo de acordo com a fórmula:
* 
    Área = T ∗T −L1 ∗ T −L2 ∗ T −L3 e 

T = L1L2L3/2
 */
package joseluiz;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double l1, l2,l3;
        double t, area,raiz;
        
        System.out.println("Digite o Lado A do Triangulo: ");
        l1 = input.nextDouble();
        
        System.out.println("Digite o Lado B do Triangulo: ");
        l2 = input.nextDouble();
        
        System.out.println("Digite o Lado C do Triangulo: ");
        l3 = input.nextDouble();
        
        t = (l1 + l2 + l3)/2;
        System.out.printf("O perimetro é: %f\n",t);
        
        // formula Área = T ∗T −L1 ∗ T −L2 ∗ T −L3
        raiz = Math.sqrt (t * (t - l1) * (t - l2) * (t - l3));
        area = Math.sqrt(raiz);
        
        System.out.printf("A area do Triangulo é: %f\n", raiz);
        System.out.println("---------------------------------\n");
        
        System.out.println(" É mais fácil usar essa FORMULA\n");
        System.out.println("        A = b.h/2\n");
    }
    
}
