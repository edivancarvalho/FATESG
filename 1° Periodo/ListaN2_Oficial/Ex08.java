//Escrever um programa que calcule todos os números inteiros divisíveis por um certo
//valor indicado pelo usuário, e compreendidos em um intervalo também especificado
//pelo usuário. O usuário deve entrar com um primeiro valor correspondente ao divisor e
//após ele vai fornecer o valor inicial do intervalo, seguido do valor final deste intervalo.
//Usar o comando While. Exemplo: Valor do divisor: 3; Inicio do Intervalo: 17; Fim do
//Intervalo: 29; Saída-> Números divisíveis por 3 no intervalo de 17 a 29: 18, 21, 24, 27.

package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int divisor;
        System.out.println("Digite um numero que seja divisor: ");
        divisor = input.nextInt();
        
        System.out.println("Digite o inicio do intervalo : ");
        int inicio = input.nextInt();
        
        System.out.println("Digite o fim do intervalo : ");
        int fim = input.nextInt();
        
        for (int i  = inicio; i <= fim; i++) {
            if (i % divisor == 0) {
                System.out.println("O número " + i + " é multiplo de " + divisor );
            }
        }
    }

}
