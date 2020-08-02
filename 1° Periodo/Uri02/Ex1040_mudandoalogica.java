package Uri02;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1040_mudandoalogica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //usar o float o double sa a conta errada fica 4,9 e uns cassos.
        float n1, n2, n3, n4, media, n5, t;
        int p1 = 2, p2 = 3, p3 = 4, p4 = 1;

        n1 = input.nextFloat();
        n2 = input.nextFloat();
        n3 = input.nextFloat();
        n4 = input.nextFloat();

        media = (((n1 * p1) + (n2 * p2) + (n3 * p3) + (n4 * p4)) / (p1 + p2 + p3 + p4));

        //System.out.printf("%.1f\n", media);

        if (media < 7 && media >= 5) {
           
            n5 = input.nextFloat();
            t = (media + n5) / 2;
            
            //System.out.printf("Media: %.1f\n", media);
            //System.out.println("Aluno em exame.");

            //System.out.println("Digite sua 5 ° nota: ");
            

            //if (t >= 5) {
              //  System.out.printf("Nota do exame: %.1f\n", n5);
                //System.out.printf("Aluno aprovado.\n");
                //System.out.printf("Media final: %.1f\n", t);
            //} else if (t < 5) {
            //    System.out.printf("Nota do exame: %.1f\n", n5);
            //    System.out.printf("Aluno reprovado.\n");
            //    System.out.printf("Media final: %.1f\n", t);
            //}

        }
    }

}
