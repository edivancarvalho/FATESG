package Uri01;

import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        String nome; //nome
        float C; //Cf comissao
        float S; //salario
        float T; // Total
        float P; //porcetagem    
                
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        
        System.out.println("Digite seu salario: ");
        S = entrada.nextFloat();
        System.out.println("Digite valor totala das vendas: ");
        C = entrada.nextFloat();
                
        P = ((C * 15) / 100f);        
        T = (S + P);
        //Cf = ( 500 * 15 )/100; //formula da porcentagem.
        //A = 2.3f;
        System.out.println("\n TOTAL = R$ " + P + "\n seu salario total: %.1f\n" + T); //%.2f\n
    }
    
}
