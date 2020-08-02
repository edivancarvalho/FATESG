/**
 * 
 * Faça um algoritmo que leia x e y e resolva a equação abaixo:
    𝐸𝑞 = 2 ∗ √3𝑥 + 30/3 + (𝑦 − 32)^4 

 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double x, y, eq;
        System.out.println("leia x: ");
        x  = input.nextDouble();
        
        System.out.println("leia Y: ");
        y = input.nextDouble();
        
        eq = 2 * (Math.sqrt(3*x + 30 / 3)) + (Math.pow(y - 32, 4)) ;
        System.out.println("valor de equacao: " + eq);
        
    }
    
}
