/**Uma loja resolveu realizar uma promoção de seus produtos oferecendo um desconto 
variável em % informado pelo vendedor. Escreva um programa que leia o valor original do 
produto e o valor do desconto oferecido pelo vendedor e imprima o novo valor do produto.
*/

package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex07 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Double produto, desconto, totalDesconto, valorTotal;
        
        System.out.println("Digite o valor do produto: ");
        produto = input.nextDouble();
        
        System.out.println("Digite o valor do desconto %: " );
        desconto = input.nextDouble();
        
              
        totalDesconto = (produto  * desconto / 100 );
        valorTotal = produto - totalDesconto;
        //System.out.println("O valor do produto é " + produto + " e com desconto é: " + valorTotal);
        System.out.println("O valor do produto é " + produto + " e com desconto é: " + valorTotal);
    }
    
}
