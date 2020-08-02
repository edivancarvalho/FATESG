/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex02sexo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        String nome;
        char sexo;
        
        System.out.println("Informe o seu nome: ");
        nome = input.nextLine();
        
        System.out.println(nome + ",Digite (M) Masculino e ( F ) feminino: ");
        sexo = input.next().charAt(0);
                
        if (sexo == 'M'){
            System.out.println(nome + ", sexo: Masculino  ");
            
        }
        else System.out.println(nome + " ,sexo: Feminino");
    }
    
}
