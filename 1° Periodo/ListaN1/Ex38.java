/**
 * Desenvolva um programa para calcular e imprimir o preço final de um carro. O valor do 
preço inicial de fábrica é informado pelo usuário, porém o usuário ainda poderá acrescentar 
novos recursos cujo os preços estão descritos. O valor total do carro deverá ser o preço 
inicial de fábrica mais o valor de cada recurso adicionado.
i. Ar condicionado – R$ 1750,00
ii. Pintura metálica – R$ 800,00
iii. Vidro Elétrico – R$ 1200,00
iv. Direção Hidráulica – R$ 2000,00
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float carro, ar1,pintura1,vidro1,direção1;
        float ar, pintura,vidro,direção;
        
        System.out.println("Digite o calor do Carro : ");
        carro = input.nextFloat();
       
        System.out.println("\nDigite (1)Sim ou (0)Não");
        System.out.println("para adicionar recursos:");
       
        System.out.println("\nAR CONDICIONADO valor R$ 1750,00 (1) sim (0) NAO:");
        ar1 = input.nextFloat();
        ar = 1750 * ar1;
        
        System.out.println("\nPINTURA MERALICA valor R$ 800,00 (1) sim (0) NAO:");
        pintura1 = input.nextFloat();
        pintura = 800 * pintura1;
        
        System.out.println("\nVIDRO ELETRICO valor R$ 1200,00 (1) sim (0) NAO:");
        vidro1 = input.nextFloat();
        vidro = 1200 * vidro1;
        
        System.out.println("\nDIREÇÃO valor R$ 2000,00 (1) sim (0) NAO:");
        direção1 = input.nextFloat();
        direção = 2000 * direção1;
        
        float total = carro + ar + pintura + vidro + direção;
        System.out.printf("\nO valor total do seu carro é: %.2f\n", total);
    }
    
}
