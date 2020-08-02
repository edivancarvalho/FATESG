
package aula_ads1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Exec07 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double C; // temperatura em celsius;
        double F; // Temperatura em Fahrenheit;
          
        System.out.println("Digite a temperatura C°: " );
        C = input.nextDouble();
     
        F = (C * (9.0/5.0)+32.0); // Formula
        System.out.println("Sua Temperatura em Fahrenheit é : " + F);
        
        
    }
}
