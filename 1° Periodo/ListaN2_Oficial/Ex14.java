//14. Faça um programa que utilizando a estrutura Do-While, 
//    leia para um número indeterminado de pessoas: 
//    leia a idade de cada pessoa, 
//    sendo que a leitura da idade 0 (zero) indica o fim dos dados e não deve ser considerada: 
//    calcule e escreva o número de pessoas;
//    calcule e escreva a idade média do grupo; 
//    calcule e escreva a menor idade e a maior idade.
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Usar o Do while; Obrigatorio

        // numero de pessoa X
        int pessoa;
        int idade, cout = 0;
        int nPessoa = 5, soma = 0;

        System.out.println("Digite [ 0 ] para finalizar.");
//        Faça
        do {
            System.out.printf("Digite a Idade da %d° : ", cout + 1);
            idade = input.nextInt();

            if (idade == 24) {
                System.out.println("Olá Jhonatan, ");
            }
   
            
            
            if (idade < 0) {
                System.out.println("Idade Invalida.");

            } else if (idade > 0) {

                cout++;
                soma = soma + idade;
                
            }
//      Enquanto (idade != 0), ele fica no loop de repetição agora caso o
//      idade for 0 ele imprimir o teste.  
//      enquanto for VERDADEIRO O RESULTADO TESTE.
        } while (idade != 0);
        System.out.printf("----------------------------------%n");
        System.out.printf("A soma das idades é :: %d %n ", soma);
    

    
    
    }

}
