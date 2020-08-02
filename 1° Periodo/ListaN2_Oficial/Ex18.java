/*
 19 - Faça um programa que leia uma senha (número inteiro). Em seguida, pergunte 
 ao usuário a senha informada, caso a senha esteja errada imprima “Senha incorreta, 
 tente novamente” e leia novamente a senha. Caso o usuário digite a senha correta, 
 imprima “Senha correta! Bem-vindo ao sistema”.
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declaração da Variacel
        int senha = 123;
        int validacao;

        do {
            //Entrada
            System.out.println("Digite a senha: ");
            validacao = input.nextInt();
            
            //Processamento
            if (validacao == senha) {
                System.out.println("Senha correta! Bem-vindo ao sistema");
            } else {
                System.out.println("Senha Incoreta, tente novamente.");
            }
            // Saida e repetição
        } while (validacao != senha);

    }

}
