
package joseluiz;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b, aux;
        System.out.println("Informe o valor de A: ");
        a = input.nextFloat();
        
        System.out.println("Informe o valor de B: ");
        b = input.nextFloat();
        //Troca
        aux = a;
        a = b;
        b = aux;
        
        System.out.printf("A = %.2f e B = %.2f \n",a,b);
        
    }
    
}
