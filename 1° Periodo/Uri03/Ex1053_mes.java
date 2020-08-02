/*
 * Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor, 
 deve ser apresentado como resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.

 Entrada
 A entrada contém um único valor inteiro.

 Saída
 Imprima por extenso o nome do mês correspondente ao número existente na entrada, com a primeira letra em maiúscula.

 January     July
 February    August
 March       September       
 April       October
 May         November	
 June        December
 */
package Uri03;
import java.util.Scanner;
/**
 *
 * @author edivan
 */
public class Ex1053_mes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;

        x = input.nextInt();

        if (x > 0 && x <= 12) {
            if (x == 1) {
                System.out.println("January");
            } else if (x == 2) {
                System.out.println("February");
            } else if (x == 3) {
                System.out.println("March");
            } else if (x == 4) {
                System.out.println("April");
            } else if (x == 5) {
                System.out.println("May");
            } else if (x == 6) {
                System.out.println("June");
            } else if (x == 7) {
                System.out.println("July");
            } else if (x == 8) {
                System.out.println("August");
            } else if (x == 9) {
                System.out.println("September");
            } else if (x == 10) {
                System.out.println("October");
            } else if (x == 11) {
                System.out.println("November");
            } else if (x == 12) {
                System.out.println("December");
            }
        }
    }
}
