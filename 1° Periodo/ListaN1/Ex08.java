/**
 *O custo ao consumidor de um carro novo é a soma do custo de fábrica com a 
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo 
que a percentagem do distribuidor seja de 12% do preço de fábrica e os impostos de 
30% do preço de fábrica, faça um programa para ler o custo de fábrica de um carro e 
imprimir o custo ao consumidor.
 **/
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex08 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double novo, valorCarro, impostoTotal;
        double custoFabrica = 0.30, percetagemDistribuidor = 0.12;
        
        impostoTotal = (custoFabrica + percetagemDistribuidor);
        
        System.out.println("Vedendor digite o valor do carro R$ ");
        novo = input.nextDouble();
        
        valorCarro = novo + (novo * impostoTotal);
        
        System.out.printf("O Novo valor do carro novo é R$ %.2f%n", valorCarro);
        //System.out.printf("O valor do imposto é %S %% \n", impostoTotal);
    }
    
}
