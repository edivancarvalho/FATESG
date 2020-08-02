/**
 * Escreva um programa que receba a base e a altura de um retângulo. Em seguida, calcule 
e imprima a área e o perímetro do retângulo.
Obs. Fórmulas:
Área = base * altura;
Perímetro = 2*base + 2*altura;
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double base, altura, area, perimetro;
        
        System.out.println("Digite a Base: ");
        base = input.nextDouble();
        
        System.out.println("Digite a altura: ");
        altura = input.nextDouble();
        
        area = (base * altura);
        perimetro = ((2 * base) + (2 * altura));
        
        System.out.printf("%n Area: %s%n Perímetro: %s%n %n", area, perimetro);
        
    }
    
}
