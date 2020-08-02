/**
 * Escreva um programa que leia um valor de hora e informe quantos minutos se passaram 
desde o início do dia.

 *
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int horas;
        
        System.out.println("Digite a hora:");
        horas = input.nextInt();
        
        int somahora = horas * 60;
        System.out.printf("%d Hora(s) em minutos é: %d Minutos%n",horas,somahora);
        
    }
    
}
