/**
 *  Faça um programa que leia via teclado um valor, em dólares, e a cotação do dólar; converta 
e imprima o mesmo num valor em reais. 

 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float dolar, valorDolar, cotacaoDolar, real;
                
        System.out.println("Quanto custa um dolar? digite o valor do dolar US$: ");
        valorDolar = input.nextFloat();
        
        System.out.println("Digite a quantidade de Dolar, ira quer será feita a conversao em reais R$: ");
         dolar = input.nextFloat();
        
        float dolarTotal = dolar * valorDolar;
        real = dolarTotal /  valorDolar;
        
        System.out.printf("A contacao do Dolar é US$ %.2f.\n"
                + "O valor total de dolar é US$ %.2f.\n"
                + "O valor em Reais é R$ %.2f.\n",valorDolar, dolarTotal , real);
    }
    
}
