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
public class pro_exemplo1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double x;
        double pot, raiz, absolut, cosseno;
        
        System.out.println("Informe o valor de X a ser testado: ");
        x = input.nextDouble();
        
        pot = Math.pow(x, 2.0);
        System.out.println(x + " ^ 2 = " + pot);
        raiz = Math.sqrt(x);
        System.out.println("A raiz Quadrada de " + x + " = " + raiz);
        absolut = Math.abs(x);
        System.out.println("valor Absoluto de " + x + " = " + absolut);
        cosseno = Math.cos(x);
        System.out.println("Consseno de " + x + " = " + cosseno);
        
    }
    
}
