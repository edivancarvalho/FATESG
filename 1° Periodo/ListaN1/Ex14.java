/**
 * 
 * Numa certa loja de eletrodomésticos, o comerciário encarregado da seção de televisores 
recebe, mensalmente, um salário fixo (que representa 2*salarioMinimo) mais a 
comissão. Essa comissão é calculada em relação ao número de televisores vendidos por 
mês de cada um dos tipos de TV, obedecendo as seguintes especificações:

    TV LCD R$ 50,00 de comissão por unidade vendida
    TV LED R$ 60,00 de comissão por unidade vendida
    TV Plasma R$ 75,00 de comissão por unidade vendida
    *
Sabendo que o salário total é calculado a partir do salário fixo + a comissão, escreva um 
programa que calcule e escreva o salário final do empregado, considerando que o usuário vai 
informar a quantidade de TVs vendidas de cada tipo e o salário mínimo atual.
 * 
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float salarioMinimo, salarioFixo, comissao, salarioFinal;
        float tvLcd = 50, tvLed = 60, tvPlasma = 75;
        float tvLcdquatidade, tvLedquatidade, tvPlasmaquatidade;
        
        System.out.println("Escreva o salario minimo: ");
        salarioMinimo = input.nextFloat();
        
        salarioFixo = (salarioMinimo * 2);
        
        System.out.println("Digite a quatidade de Tv LCD concertada: ");
        tvLcdquatidade = input.nextFloat();
        float tvLcdTotal = tvLcd * tvLcdquatidade;
        
        System.out.println("Digite a quatidade de Tv Led concertada: ");
        tvLedquatidade = input.nextFloat();
        float tvLedTotal = tvLed * tvLedquatidade;
        
        System.out.println("Digite a quatidade de Tv Plasma concertada: ");
        tvPlasmaquatidade = input.nextFloat();
        float tvPlasmaTotal = tvPlasma * tvPlasmaquatidade;
        
        comissao = tvLcdTotal + tvLedTotal + tvPlasmaTotal;
                
        salarioFinal = salarioFixo + comissao;
        
        System.out.printf("o Seu salario bruto é: %.2f\n ",salarioFinal);
    }
    
}
