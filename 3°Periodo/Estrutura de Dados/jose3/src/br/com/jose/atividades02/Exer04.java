/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jose.atividades02;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Exer04 {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("(a)");

// Para cada elemento de array, gera saa de uma barra do gráfico
        for (int counter = 0; counter < array.length; counter++) // output bar label("00-09:", ..., "90-99:,"100: ")
        {
            // imprime a barra de asteriscos
            for (int stars = 0; stars < array[counter]; stars++) {
                System.out.print("*");
            }
            System.out.println(); // iniciar um anova linha de saida

        }// fim do for externo
        
        System.out.println("(d)");
        for (int counter = 0; counter < array.length; counter++) // output bar label("00-09:", ..., "90-99:,"100: ")
        {
            // imprime a barra de asteriscos
            for (int stars = 0; stars < array[counter]; stars++) {
                System.out.print(" *");
            }
            System.out.println(); // iniciar um anova linha de saida

        }// fim do for externo

        System.out.println("(b)");

        for (int j = 10; j < array.length; j--) // output bar label("00-09:", ..., "90-99:,"100: ")
        {
            System.out.println("-");
            // imprime a barra de asteriscos
            for (int stars = 10; stars > array[j]; stars--) {
                System.out.print("*");
            }
            System.out.println("teste"); // iniciar um anova linha de saida

        }// fim do for externo
    }//fim de main
}
