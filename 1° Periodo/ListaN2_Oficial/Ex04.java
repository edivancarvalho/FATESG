package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int idade, opc;

        do {
            System.out.println("Informe seu nome: ");
            nome = input.nextLine();

            System.out.println(nome + ", informe sua idade: ");
            idade = input.nextInt();

            System.out.println("O usuario" + nome + " tem " + idade + " anos de vida");

            System.out.println("Deseja continuar? (1) Sim | (0) Não ::");
            opc = input.nextInt();
            while (opc != 0 && opc != 1) {
                
                System.out.println("Entrada Invalida, digite apenas 0 ou 1: ");
                opc = input.nextInt();
            }
            
            input.nextLine();

        } while (opc != 0);
    }

}
