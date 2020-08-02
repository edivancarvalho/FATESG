/**
 * Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a 
variável A passe a possuir o valor da variável B, e a variável B passe a possuir o valor da 
variável A. Apresentar os valores trocados.
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float a, b, aux;
        System.out.println("Informe o valor de A: ");
        a = input.nextFloat();
        
        System.out.println("Informe o valor de B: ");
        b = input.nextFloat();
        //Troca
        aux = a;
        a = b;
        b = aux;
        
        System.out.printf("A = %.2f e B = %.2f \n",a,b);
    }
    
}
