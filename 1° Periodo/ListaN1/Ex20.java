/**
 * Numa determinada região, o imposto sobre propriedade é calculado a partir de duas 
informações:
    - área total do terreno (m2).
    - área construída do terreno (m2).
    
O imposto é cobrado da seguinte maneira:
* 
- R$ 5,00 para cada metro quadrado construído.
- R$ 3,80 para cada metro quadrado não construído.
* 
Faça um programa que leia a área total do terreno, a área construída do terreno, calcule e 
imprima o valor total a ser pago.

 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex20 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double areaTerreno, // area do terreno em m²
                areaContruida; // area do terreno contruida
                
        double valorTotal,
                iContruido, //Imposto da area construido 5,00;
                inaoContruido; // Imposyo da area nao construido 3,80;
        
        
        System.out.println("Digite a o total do terreno: ");
        areaTerreno = input.nextDouble();
        
        System.out.println("Digite a área construída do terreno: ");
        areaContruida = input.nextDouble();
        
        double vareaTerrenototal = (areaTerreno - areaContruida); // valor da area terreno;
        double vareaTerrenopago = (vareaTerrenototal * 5); // valor da area terreno;
        double vareacontruidaPaga = (areaContruida * 3.80);
        
        valorTotal = (vareaTerrenopago + vareacontruidaPaga);
                
        
        System.out.printf("\n Area do terreno é %.2f m² \n"
                + " área construída do terreno é %.2f m²\n"
                + " entao a area do terreno atual é %.2f m²\n\n"
                
                + " O valor a se pago pela area do terreno é R$ %.2f \n"
                + " O valor a se pago pela área construída do terreno é R$ %.2f\n"
                + "-------------------------------------------------------------\n"
                + " o valor TOTAL a ser pago é R$: %.2f Reais.\n",
                areaTerreno, areaContruida, vareaTerrenototal, vareaTerrenopago, vareacontruidaPaga, valorTotal);
        
    }
    
}
