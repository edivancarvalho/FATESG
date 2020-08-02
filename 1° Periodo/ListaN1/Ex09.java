/*
 * Uma loja resolveu realizar uma promoção de seus produtos oferecendo um desconto 
variável informado pelo vendedor. Escreva um programa que leia o valor original do 
produto e o valor do desconto oferecido pelo vendedor e imprima o novo valor do 
produto
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex09 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nomeProduto;
        double  desconto, valorComDesconto, valorProduto, valordeDesconto, valor;
        
        System.out.printf("Escreva o nome do produtor: ");
        nomeProduto = input.nextLine();
        
        System.out.printf("Digite o valor do(a) %S R$: ",nomeProduto);
        valorProduto = input.nextDouble();
        
        System.out.printf("Digite a porcetagem do desconto: ");
        desconto = input.nextDouble();
        
        valordeDesconto = (valorProduto * desconto) /100;
        valorComDesconto = valorProduto - valordeDesconto;
        
        System.out.printf("O Produto é %S, recebeu %s %% de desconto %nO valor a ser pago é R$: %.2f%n "
                , nomeProduto, desconto, valorComDesconto );
        
        
    }
    
}
