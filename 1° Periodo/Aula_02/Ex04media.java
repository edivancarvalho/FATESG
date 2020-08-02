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
public class Ex04media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float nota1, nota2, media;
        
        System.out.println("Informe a primeira nota: ");
        nota1 = input.nextFloat();
        
        System.out.println("Informe a segunda nota: ");
        nota2 = input.nextFloat();
        
        System.out.println("Informe a quantidade de falta: ");
        float falta = input.nextFloat();
        
        media = (nota1 + nota2 ) / 2;
        
        System.out.println("Media do Aluno = "+ media);
        
        if (media >= 6 && falta <= 12){
            System.out.println("Aprovado.");
        }
        else{
            System.out.println("Reprovado.");
        }
    }
}
