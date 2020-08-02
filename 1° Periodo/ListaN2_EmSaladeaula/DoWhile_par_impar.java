package ListaN2_EmSaladeaula;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class DoWhile_par_impar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.println("Informe o numero a ser verificado ::");
            n = input.nextInt();

            if (n == 0) {
                System.out.println("Fim da leitura. saindo do laço de repetição.");
            }
            else if (n % 2 == 0){
                System.out.println("O numero " + n + " é PAR!");
            }
            else{
                System.out.println("O numero" + n +" é ÍMPAR");
            }
        }while(n != 0);
    }

}

