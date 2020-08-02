/*
 *19- Faça um programa que receba 2 notas (valide as notas, 
 onde 0.0 ≤ nota ≤ 10) de um número indeterminado de alunos. Calcule e mostre:

 a. A média aritmética das 2 notas lidas;
 b. Uma mensagem de acordo com as regras: 
 Até 3 (Reprovado); 
 Entre 3 e 7 (Exame); 
 de 7 para cima (Aprovado);
 c. O total de alunos;
 d. Quantidade de alunos Aprovados, Reprovados e de Exame.
 e. A Média da classe.

 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração da Variavel
        double nota1, nota2, media, mediaGeral = 0, somaMedia;
        int cout = 0, reprovado = 0, exame = 0, aprovado = 0, alunos = 0;
        int sair = 3;

        // VALIDAÇÃO;
        media = nota1 = nota2 = 0;
        do {

            // ENTRADA
            System.out.println("Digite a Primeira Nota::");
            nota1 = input.nextDouble();

            System.out.println("Digite a Segunda Nota::");
            nota2 = input.nextDouble();
            alunos++;

            if (nota1 >= 0.0 && nota1 <= 10) {

            }
            //PROCESSAMENTO
            media = (nota1 + nota2) / 2;

            // SAIDA
            // a. A média aritmética das 2 notas lidas;
            System.out.printf("A media [%.1f].%n", media);
            //b. Uma mensagem de acordo com as regras: 
            //Até 3 (Reprovado); 
            if (media >= 0.0 && media <= 3) {
                System.out.println("REPROVADO\n");
                reprovado++;
            } //Entre 3 e 7 (Exame);
            else if (media > 3.0 && media <= 7) {
                System.out.println("EXAME\n");
                exame++;
            } //de 7 para cima (Aprovado);
            else if (media > 7.0 && media <= 10) {
                System.out.println("APROVADO\n");
                aprovado++;
            }
            System.out.println("[0] Sair [1] Continuar");
            sair = input.nextInt();

            cout++;
            mediaGeral = mediaGeral + media;
            somaMedia = mediaGeral / alunos;

            // buff
            input.nextLine();

        } while (sair != 0);
        // SAIDA
        System.out.printf("Total de alunos ::[%d]\n", alunos);
        System.out.printf("Alunos REPROVADOS ::[%d].\n", reprovado);
        System.out.printf("Alunos em EXAMES ::[%d].\n", exame);
        System.out.printf("Alunos APROVADOS ::[%d].\n", aprovado);
        // Media Geral
        System.out.printf("Media geral dos Alunos ::[%.1f].\n", somaMedia);

    }

}
