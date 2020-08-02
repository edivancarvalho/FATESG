/**
 * 
 * Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A 
fórmula de conversão de temperatura a ser utilizada é C = (F – 32) * 5 / 9, em que a 
variável F é a temperatura em graus Fahrenheit e a variável C é a temperatura em graus 
Celsius.
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex10 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double fahrenheit, c;
        
        System.out.printf("Digite a temperatura em Fahrenheit: ");
        fahrenheit = input.nextDouble();
        
        c = ((fahrenheit - 32) * 5 )/ 9; //Formula
        
        System.out.printf(" A conversão de %.0f F em Celsuis é C° %.1f %n", fahrenheit, c);
    }
    
}
