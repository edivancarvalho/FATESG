/**
 * Faça um algoritmo que recebe o raio de uma esfera e calcula o seu volume 
 * (v = 4/3.P.R³), e a área (a = 4P.R²).

 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double raio, area, volume, raioVolume;
        
      
        System.out.printf("Digite o Raio: ");
        raio = input.nextDouble();
                
        // a = 4.P.r² esta é a formula;
        //area = ((4 * Math.PI) * (raio * raio));
        area = 4  * (Math.pow(raio, 2.0)) ;
        raioVolume = raio / 2;
        
        //System.out.println(Math.pow(area, 3.0));
        //volume = 4/3.P.R³
        //volume = (4/3 * Math.PI) * (Math.pow(area, 3.0));
        volume = 4 * Math.PI * ((Math.pow(raioVolume, 3.0)) / 3);
        
        //volume = Math.pow(raio, 3);
        
        System.out.printf("A area é :%.0f%n: ", area);
        
        System.out.printf("A raiovolume é :%.0f%n: ", raioVolume);
        
        System.out.printf("A Volume é :%.0f%n: ", volume);
        
    }
    
}
