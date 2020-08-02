package ListaN2_EmSaladeaula;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Modelo3_repeticao_enquato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int cont =1, idade, quantidadesPessoas;
        double media, soma = 0;
        
        System.out.println("Informe a quantidade de pessoas s serem entrevistadas: ");
        quantidadesPessoas = input.nextInt();
        
        while(cont <= quantidadesPessoas)
        {
            System.out.println("Digite a idade da pessoa"+ cont +": ");
            idade = input.nextInt();
            
            soma = soma + idade;    //<---- Acumulador
            cont++;                 // <---- COntador
        }
        media = soma / quantidadesPessoas;
        System.out.println("A média das idades eh: " + media);
    }
    
}
