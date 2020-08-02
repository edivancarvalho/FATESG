/**
 */
package Uri02;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1038_Lanche {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double codigo,quantidade;
        double c1 = 4, c2 = 4.50, c3 = 5.00, c4 = 2.00, c5 = 1.50;
        
        /**
         * Código   Especificação       Preço
         * ------------------------------------
         * 1        Cachorro Quente     R$ 4.00
         * 2        X-Salada            R$ 4.50
         * 3        X-Bacon             R$ 5.00
         * 4        Torrada Simples     R$ 2.00
         * 5        Refrigerante        R$ 1.50
         */
        
        //System.out.println("Faça seu pedido");
        /**System.out.println(" (1) Cachorro Quente"
                + "\n (2) X-Salada"
                + "\n (3) X-bacon"
                + "\n (4) Torrada Simples"
                + "\n (5) Refrigerante"
                + "\n -----------------");
                */
        codigo = input.nextInt();
        //System.out.println("Quantidade: ");
        quantidade = input.nextInt();
        
        if (codigo == 1){
          //  System.out.println("Cachorro Quente");
            System.out.printf("Total: R$ %.2f\n",quantidade * c1);
        }
        if (codigo == 2){
            //System.out.println("X-Salada");
            System.out.printf("Total: R$ %.2f\n",quantidade * c2);
        }
        if (codigo == 3){
            //System.out.println("X-Bacon");
            System.out.printf("Total: R$ %.2f\n",quantidade * c3);
        }
        if (codigo == 4){
            //System.out.println("Torrada Simples");
            System.out.printf("Total: R$ %.2f\n",quantidade * c4);
        }
        if (codigo == 5){
            //System.out.println("Refrigerante");
            System.out.printf("Total: R$ %.2f\n",quantidade * c5);
        }
        
    }
}
