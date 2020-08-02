package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, Qmenor = 0, Qmaior = 0, Qidoso = 0, i = 1;
        int max = 10;

        System.out.println("DIGITE A IDADE DE 10 PESSOAS. \n");
        //idade = input.nextInt();

        
        while (i <= 10) {
            System.out.printf("Digite a idade da pessoa %d :: ",i);
            idade = input.nextInt();
            
            // 1 - A Quantdiade de pessoas ate 18 anos.
            if (idade <= 18) {
                Qmenor++;
            }
            // 2 - Quantidade de pessoas entre 18 e 65 anos.
            else if(idade >=18 && idade <= 65 ){
                Qmaior++;
            }
            // 3 - Quantidade de pessoas acima de 65 anos.
            else 
                Qidoso++;
            i++;
        }
        
        System.out.printf("%nQuantidades das pessoas MENOR que [18] é :: %d%n", Qmenor);
        System.out.printf("Quantidades das pessoas MAIOR que [18] é :: %d%n", Qmaior);
        System.out.printf("Quantidades das pessoas MAIOR que [65] é :: %d%n", Qidoso);
        

        
    }

}
