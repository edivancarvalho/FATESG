/**
 * Receba dois números reais do usuário em seguida exiba o resultado de uma operação 
escolhida também pelo usuário: (1) Soma (2) Subtração, (3) Multiplicação e (4) Divisão. 
Obs.: No caso da divisão, se o segundo operando for zero exiba “divisão impossível”.

 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float numero1, numero2, resultado;
        char menu;
        
        System.out.println("Escolhar uma operação \n(1 soma):"
                + "\n(2 subtração):"
                + "\n(3 multiplicação):"
                + "\n(4 divisão):\n");
        
        menu = input.nextLine().charAt(0);
        
        switch(menu){
            case '1':
                System.out.println("Digite o Primeiro numero:");
                numero1 = input.nextFloat();
        
                System.out.println("Digite o Segundo numero:");
                numero2 = input.nextFloat();
                
                resultado = numero1 + numero2;
                System.out.printf("%nA Adição de %.1f + %.1f = %.1f%n",numero1,numero2, resultado);
                break;
            case '2':
                System.out.println("Digite o Primeiro numero:");
                numero1 = input.nextFloat();
        
                System.out.println("Digite o Segundo numero:");
                numero2 = input.nextFloat();
                
                resultado = numero1 - numero2;
                System.out.printf("%nA subtração de %.1f - %.1f = %.1f%n",numero1,numero2, resultado);
                break;
            case '3':
                System.out.println("Digite o Primeiro numero:");
                numero1 = input.nextFloat();
        
                System.out.println("Digite o Segundo numero:");
                numero2 = input.nextFloat();
                
                resultado = numero1 * numero2;
                System.out.printf("%nA Multiplicação de %.1f * %.1f = %.1f%n",numero1,numero2, resultado);
                break;
            case '4':
                System.out.println("Digite o Primeiro numero:");
                numero1 = input.nextFloat();
        
                System.out.println("Digite o Segundo numero:");
                numero2 = input.nextFloat();
                
                resultado = numero1 / numero2;
                System.out.printf("%nA Divisão de %.1f / %.1f = %.1f%n",numero1,numero2, resultado);
                break;
                
        }
        
    }
    
}
