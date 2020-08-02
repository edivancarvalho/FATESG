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
public class aula {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       // Inicialização da opção
        String opcao = "a";
        
       while(opcao.equals("a")){ // Só entra no bloco quando o resultado do teste for TRUE (Verdadeiro)
            System.out.println("Dentro do enquanto..");
            System.out.print("Digite uma opcao para o enquanto: ");
            opcao = entrada.next();
        }
        
        System.out.println("Fim do Enquanto (While)");
        
        System.out.println("--------------------------------------------------------");

        do { // Faça
            System.out.println("Dentro do faça-enquanto (do-while)...");
            System.out.print("Digite uma opcao para o do-while: ");
            opcao = entrada.next();

        } while (opcao.equals("a")); // Fica preso no bloco ENQUANTO o resultado do teste for TRUE (Verdadeiro)

        System.out.println("Saiu do faça-enquanto (do-while)...");

        
        
        int cont = 0;
        do {
            System.out.printf("Cont agora vale %d\n", cont);
            cont++;
        } while (cont < 10);
        
    }
}
