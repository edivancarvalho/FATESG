
package Aula_02;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex09_switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char menu;
        
        System.out.println("Entre com a Estação do Ano (p, v, o ou i): ");
        menu = input.nextLine().charAt(0);
        
        switch(menu){
            case 'p':
            case 'P':
                System.out.println("A primavera ocorre de Setembro a Dezembro.!");
                break;
            case 'v':
            case 'V':
                System.out.println("O verão ocorre de Dezembro a Março.");
                break;
            case 'o':
            case 'O':
                System.out.println("o Outono ocorre de Março a Junho.");
                break;
            case 'i':
            case 'I':
                System.out.println("O Inverno ocorre de Junho a Setembro.");
                break;
            default:

        }
        
    }
    
}
