/**
 * Escreva um programa que leia o nome, o peso de uma pessoa na Terra e o número de 
um planeta e imprima o valor do peso desta pessoa neste planeta. A relação de planetas é 
dada a seguir juntamente com o valor das gravidades relativas á Terra:
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex33 {
    public static void main(String[]args) {
        
        Scanner entrada = new Scanner(System.in);
        double Mercurio = 0.37, Venus = 0.88, Marte = 0.38, Jupiter = 2.64, Saturno = 1.15, Urano = 1.17, massa, pesoPlaneta;
        int planeta;
        String nome;

        System.out.println("Escreva seu Nome:");
        nome = entrada.nextLine();

        System.out.printf("%S,Digite seu peso:\n", nome);
        massa = entrada.nextDouble();

        System.out.println("\n(1)Mercúrio (2)Vênus (3)Marte (4)Júpiter (5)Saturno (6)Urano\nInforme o numero do planeta:");
        planeta = entrada.nextInt();

        if (planeta >= 1 && planeta <= 6) {
            
            if (planeta == 1) {
                pesoPlaneta = massa * Mercurio;
                System.out.printf("%S, o seu peso no Planeta Mercurio é %.2f\n", nome, pesoPlaneta);

            } else if (planeta == 2) {
                pesoPlaneta = massa * Venus;
                System.out.printf("%S, o seu peso no Planeta Mercurio é %.2f\n", nome, pesoPlaneta);

            } else if (planeta == 3) {
                pesoPlaneta = massa * Marte;
                System.out.printf("%S, o seu peso no Planeta Mercurio é %.2f\n", nome, pesoPlaneta);

            } else if (planeta == 4) {
                pesoPlaneta = massa * Jupiter;
                System.out.printf("%S, o seu peso no Planeta Mercurio é %.2f\n", nome, pesoPlaneta);

            } else if (planeta == 5) {
                pesoPlaneta = massa * Saturno;
                System.out.printf("%S, o seu peso no Planeta Mercurio é %.2f\n", nome, pesoPlaneta);

            } else if (planeta == 6) {
                pesoPlaneta = massa * Urano;
                System.out.printf("%S, o seu peso no Planeta Mercurio é %.2f\n", nome, pesoPlaneta);

            }else{
                System.out.println("\nPlaneta Invalido!!!");
            }
        } else {
            System.out.println("\nPlaneta Invalido!!!");
        }
    }
    
}
