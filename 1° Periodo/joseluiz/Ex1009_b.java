package joseluiz;

import java.util.Scanner;

public class Ex1009_b {
    public static void main(String[] args) {
        String nome; //nome
        double C; //Cf comissao
        double S; //salario
        double T; // Total
        double P; //porcetagem    
                
        Scanner input = new Scanner(System.in);
        //System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        
        //System.out.println("Digite seu salario: ");
        S = input.nextDouble();
        //System.out.println("Digite valor totala das vendas: ");
        C = input.nextDouble();
                
        P = (C * 15 / 100); // ou //P = C * 0.15 + S;
        T = (S + P);
        //Cf = ( 500 * 15 )/100; //formula da porcentagem.
        //A = 2.3f;
        //System.out.println("\n TOTAL = R$ " + P + "\n seu salario total: %.1f\n" + T); //%.2f\n
        System.out.printf("TOTAL = R$ %.2f\n",T); //%.2f\n
    }
    
}
