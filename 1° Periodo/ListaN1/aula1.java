
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class aula1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double cA, cO, hip, pot;
        
        System.out.println("Digite o cateto CA: ");
        cA = input.nextDouble();
        
        System.out.println("Digite o cateto CO: ");
        cO = input.nextDouble();
        
        //pot = (Math.pow(cO, 2.0) + Math.pow(cA, 2.0));
        //hip = Math.sqrt(pot);
        
        hip = Math.sqrt(Math.pow(cA, 2.0) + Math.pow(cO, 2.0));
        
        System.out.println("\nA hipotenusa é: " + hip);
    }
    
}
