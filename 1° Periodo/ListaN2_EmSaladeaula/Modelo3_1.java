/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaN2_EmSaladeaula;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Modelo3_1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int cont = 1, idade, qntPessoas, qntMaiorIdade = 0, qntMenorIdade =0;
        double media, soma = 0;
        
        System.out.println("Informe a quantidade de Pessoas e serem entrevistadas: ");
        qntPessoas = input.nextInt();
        
        while (cont <= qntPessoas)
        {
            System.out.println("Digite a idade da Pessoa " + cont +": ");
            idade = input.nextInt();
            
            if (idade >= 18)
            {
                qntMaiorIdade++;
            }
            else{
                qntMenorIdade++;
            }
            
            soma = soma + idade;
            cont++;
        }
        
        media = soma / qntPessoas;
        
        System.out.println("A média das idades eh: " + media);
        System.out.println("Quantidade de pessoas maiores de idade: "+qntMaiorIdade);
        System.out.println("Quantidade de pessoas menores de idade: "+qntMenorIdade);
          
        }
    
}
