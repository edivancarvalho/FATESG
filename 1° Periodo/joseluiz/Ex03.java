/***
 * Escrever um algoritmo que lê o público total de futebol e forneça a renda do jogo, sabendo-se que
havia 4 tipos de ingressos assim distribuídos: 
popular - 10% a R$10,00, 
geral - 50% a R$15,00,
arquibancada - 30% a R$20,00 e 
cadeiras - 10% a R$30,00.

 */
package joseluiz;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int publicoTotal, renda,menu;
        double popularDes = .10, popular = 10;
        double geralDes = .50, geral = 15;
        double arquibancadaDes = .30, arquibancada = 20;
        double cadeirasDes = .30, cadeiras = 30;
        double valor;
        int numeroIngresso, quantidadeIngresso;
        
        System.out.println("#=======================================#");
        System.out.println("# Edivan Carvalho | FATESG - SENAI 2019 #");
        System.out.println("#=======================================#\n\n");
        
         System.out.println("#=======================================#");
        System.out.println("#           SISTEMA DE INGRESSO         #");
        System.out.println("#=======================================#\n\n");
        System.out.println("Digite a quantidade do Ingresso: ");
        numeroIngresso = input.nextInt();
        
        System.out.println("\nEscolhar o tipo de Ingresso::\n "
                + "\n(1) Popular::"
                + "\n(2) Geral::"
                + "\n(3) Arquibancada::"
                + "\n(4) Cadeira::\n");
        menu = input.nextInt();
        switch (menu){
            case 1:{
                valor = numeroIngresso * (popular - (popular * .10));
                System.out.printf("\nO valor a total R$ %.2f\n",valor);
            }break;
            case 2:{
                valor = numeroIngresso * (geral - (geral * .50));
                System.out.printf("\nO valor a total R$ %.2f\n",valor);
            }break;
            case 3:{
                valor = numeroIngresso * (arquibancada - (arquibancada * .30));
                System.out.printf("\nO valor a total R$ %.2f\n",valor);
            }break;
            case 4:{
                valor = numeroIngresso * (cadeiras - (cadeiras * .10));
                System.out.printf("\nO valor a total R$ %.2f\n",valor);
            }break;
            }
        
        
        
        //System.out.printf("\n%d\n",numeroIngresso);
    }
    
}
