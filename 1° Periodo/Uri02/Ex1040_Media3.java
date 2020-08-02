/**
 * Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal,
 * correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4
 * e 1, respectivamente, para cada uma destas notas e mostre esta média
 * acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0,
 * imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a
 * 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor
 * entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno
 * em exame.".
 *
 * No caso do aluno estar em exame, leia um valor correspondente à nota do exame
 * obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada
 * pela nota digitada. Recalcule a média (some a pontuação do exame com a média
 * anteriormente calculada e divida por 2). e imprima a mensagem "Aluno
 * aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.",
 * (caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou
 * reprovado após ter pego exame) apresente na última linha uma mensagem "Media
 * final: " seguido da média final para esse aluno.
 *
 * Entrada A entrada contém quatro números de ponto flutuante correspendentes as
 * notas dos alunos.
 *
 * Saída Todas as respostas devem ser apresentadas com uma casa decimal. As
 * mensagens devem ser impressas conforme a descrição do problema. Não esqueça
 * de imprimir o enter após o final de cada linha, caso contrário obterá
 * "Presentation Error".
 */

package Uri02;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1040_Media3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //usar o float o double sa a conta errada fica 4,9 e uns cassos.
        float n1,n2,n3,n4,media,n5,t;
        int p1 = 2, p2 = 3, p3 = 4, p4 = 1;
        
        n1 = input.nextFloat();
        n2 = input.nextFloat();
        n3 = input.nextFloat();
        n4 = input.nextFloat();
        
        media = (((n1 * p1) + (n2 * p2) + (n3 * p3) + (n4 * p4)) / (p1 + p2 + p3 + p4));

        //System.out.printf("%.1f\n",media);
        
        if (media >= 7 ){
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno aprovado.");
        }else if (media < 7 && media >=5){
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno em exame.");
            
            //System.out.println("Digite sua 5 ° nota: ");
            n5 = input.nextFloat();
            t = (media + n5) /2;
            
            if (t >= 5){
                System.out.printf("Nota do exame: %.1f\n",n5);
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: %.1f\n",t);
            }else if (t < 5){
                System.out.printf("Nota do exame: %.1f\n",n5);
                System.out.printf("Aluno reprovado.\n");
                System.out.printf("Media final: %.1f\n",t);
            }
        }else {
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno reprovado.");
        }
    }
    
}
