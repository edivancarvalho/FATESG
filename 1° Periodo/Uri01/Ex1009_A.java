package Uri01;

import java.util.Scanner;

public class Ex1009_A {
    public static void main(String[] args) {
	String vendedor;
	double salario, comissao, total, porcetagem;
		
	Scanner entrada = new Scanner(System.in);
	//System.out.println("Digite o nome do vendedor: ");
	vendedor = entrada.nextLine();
        
	//System.out.println("Digite o valor do salário");
	salario = entrada.nextDouble();
	//System.out.println("Digite o valor das vendas");
	comissao = entrada.nextDouble();
               
        //porcetagem = (vendas * 15) / 100;
        porcetagem = (comissao * 15 / 100); 
        total = salario + porcetagem;
               
	System.out.printf("TOTAL = R$ %.2f\n",total);
		
    }
}