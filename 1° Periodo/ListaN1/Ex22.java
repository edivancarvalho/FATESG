/**
 * Escreva um programa que receba um número inteiro de 3 dígitos e imprima o dígito das 
Centenas, o dígito das Dezenas e o dígito das Unidades. 
* Em seguida, o programa deverá inverter o número recebido, isto é, se o usuário digitou 123, seu programa deverá gerar o 
número 321.
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int centena, abc, aux;
        
        System.out.printf("Digite um numero com 3 digitos: \n");
        abc = input.nextInt();
        
        centena = abc /100;
        int dezenas = (abc%100)/10;
        int unidades = (abc%100)%10;
        
        System.out.printf("\nO numero digitado foi \"%d\" %nA inverão é: %d%d%d%n",abc,unidades,dezenas,centena);
        
    }
    
}
