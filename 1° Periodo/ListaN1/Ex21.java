/**
 * Faça um programa que leia um tempo total em segundos e expresse-o em horas,
 * minutos e segundos. Ex. 140s = 0h 2m 20s.
 * 
*
 * 1min = 60s 3600 = 1 hora 2min = 120s 3min = 180s
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // OBSERVAÇÃO: NÃO USAR O FLOAT PORQUE VAI DA MERDA.
        int valor, segundo, minuto, N;
        
        System.out.println("Digite o valor");
        N = input.nextInt();
        
        valor = N;
        int hora = N / 3600;
        N %= 3600;
        
        minuto = N / 60;
        N %= 60;
        
        segundo = N ;
        
        
        System.out.printf("%dH %dm %ds.\n",hora, minuto, segundo);
        
    }

}
