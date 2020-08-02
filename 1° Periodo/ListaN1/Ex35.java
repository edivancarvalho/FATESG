/**
 * Crie um algoritmo que exiba um cardápio com as opções: 1: Pizza, 2: Picanha e 3: Peixe 
Frito. Ao selecionar uma das opções:1, 2 e 3 deverá exibir a mensagem: “Opção (número) : 
(nome do prato), pedido realizado com sucesso”
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char menu;
        
        System.out.println("Cardápio escolha opção: (1) Pizza (2) Picanha (3) Peixe Frito): ");
        menu = input.nextLine().charAt(0);
        
        switch(menu){
            case '1':            
                System.out.println("Opção (1): Pizza, pedido realizado com sucesso.");
                break;
            case '2':            
                System.out.println("Opção (2): Picanha, pedido realizado com sucesso.");
                break;
            case '3':            
                System.out.println("Opção (3): Peixe Frito, pedido realizado com sucesso.");
                break;
            default:
        }
    }
    
}
