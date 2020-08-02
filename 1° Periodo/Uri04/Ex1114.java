/**
 * Senha Fixa ========= 
 * Escreva um programa que repita a leitura de uma senha
 * até que ela seja válida. Para cada leitura de senha incorreta informada,
 * escrever a mensagem "Senha Invalida". Quando a senha for informada
 * corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
 * encerrado. Considere que a senha correta é o valor 2002.  *
 * Entrada A entrada é composta por vários casos de testes contendo valores
 * inteiros.
 *
 * Saída Para cada valor lido mostre a mensagem correspondente à descrição do
 * problema.
 * 
* Exemplo de Entrada	Exemplo de Saída 
* -----------------     ----------------
* 2200                  Senha Invalida
* 1020                  Senha Invalida
* 2022                  Senha Invalida
* 2002                  Acesso Permitido
 */
package Uri04;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1114 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração da Variacel
        int senha = 2002;
        int validacao;

        do {
            //Entrada
//            System.out.println("Digite a senha: ");
            validacao = input.nextInt();

            //Processamento
            if (validacao == senha) {
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }
            // Saida e repetição
        } while (validacao != senha);

    }
}
