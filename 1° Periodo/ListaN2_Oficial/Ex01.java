package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, max;
        //int i = 1; //Count ou cont
        //int max = 10, i;

        System.out.println("Digite o valor maximo de casas: ");
        max = input.nextInt();

        System.out.println("Digite um numero Inteiro: ");
        i = input.nextInt();

        System.out.printf("Contando ate %d ate %d%n", i, max);

        while (i <= max) {
            System.out.println("Valor do Inteiro é : " + i);
            i++; // i = i + 1; ou i += 1;

        }

    }

}
