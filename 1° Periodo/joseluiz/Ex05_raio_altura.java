/**
 * Fazer um algoritmo que obtenha o raio e a altura de um cilindro e que calcule e escreva o seu
volume e sua área.
Área=2∗∗raio∗alturaraio e 
* Volume=∗raio2∗alt u r a

 */
package joseluiz;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex05_raio_altura {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double raio, area, volume, raioVolume,altura;
        
      
        System.out.printf("Digite o Raio: ");
        raio = input.nextDouble();
        
        System.out.printf("Digite o Altura: ");
        altura = input.nextDouble();
                
        // a = 4.P.r² esta é a formula;
        //area = ((4 * Math.PI) * (raio * raio));
        area = 2  * Math.PI * raio * (altura + raio) ;
        volume = Math.PI * ((Math.pow(raio, 2)* altura));
        
        //System.out.println(Math.pow(area, 3.0));
        //volume = 4/3.P.R³
        //volume = (4/3 * Math.PI) * (Math.pow(area, 3.0));
        //volume = 4 * Math.PI * ((Math.pow(raioVolume, 3.0)) / 3);
        
        //volume = Math.pow(raio, 3);
        
        System.out.printf("\nA area é: %.0f%n", area);
        
        //System.out.printf("A raiovolume é :%.0f%n: ", volume);
        
        System.out.printf("\nA Volume é: %.0f%n ", volume);
        
    }
    
}
