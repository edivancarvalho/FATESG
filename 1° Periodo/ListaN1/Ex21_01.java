/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex21_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
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
