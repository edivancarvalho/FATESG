/**
 * Escreva um programa que leia dois números inteiros e imprima a seguinte saída, com os 
valores calculados, sabendo que o primeiro número informado será o dividendo e o 
segundo, o divisor:
Dividendo = 
Divisor = 
Quociente = 
Resto =
*Obs. Para obter o resto de uma divisão utilize o operador %.
 * 
 */

package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex04 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numero1, numero2, calculo, resto;
        
        System.out.println("Digite um numero: ");
        numero1 = input.nextInt();
        
        System.out.println("Digite um segundo numero: ");
        numero2 = input.nextInt();
        
        calculo = numero1 / numero2;
        resto = (numero1 % numero2);
        System.out.printf(" Dividendo: %s%n Divisor: %s%n Quociente: %s%n Resto: %s%n ", numero1, numero2, calculo, resto);
        
    }
    
}
