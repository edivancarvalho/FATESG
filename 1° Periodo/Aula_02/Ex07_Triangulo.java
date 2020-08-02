
package Aula_02;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex07_Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float a, b, c;
        
        System.out.println("Informe o lado A: ");
        a = input.nextFloat();
        
        System.out.println("Informe o lado B: ");
        b = input.nextFloat();
        
        System.out.println("Informe o lado C: ");
        c = input.nextFloat();
        
        if (( a < b +c ) && (b < a + c) && (c < a + b)){
            System.out.println("As medidas dos lados formam um triangulo.");
        }
        else {
            System.out.println("As medidas dos lados NÃO formam um triangulo.");
        }
    }
}
