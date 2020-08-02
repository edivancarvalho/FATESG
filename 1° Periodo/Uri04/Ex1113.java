/**
  Crescente e Decrescente
  

Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.
Entrada

A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.
Saída

Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente, caso contrário imprima a mensagem “Decrescente”.
Exemplo de Entrada 	Exemplo de Saída
5 4                     Decrescente
7 2                     Decrescente               
3 8                     Crescente        
2 2             
 */
package Uri04;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1113 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //DECLARAÇÃO DA VARIAVEIS
        int x,y;
        
        do {
            x = input.nextInt();
            y = input.nextInt();
            if (x > y){
                System.out.printf("Decrescente\n");
            }else if (x < y){
                System.out.printf("Crescente\n");
            }else{
//                System.out.println();
            }
            
        } while (x != y);
    }
    
}
