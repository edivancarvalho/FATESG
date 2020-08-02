/**
 *  Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano, 
P(x1,y1) e P(x2,y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
 *
 *  d = √(x2 - x1)² + (y2 + y1)²
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double x1, x2, y1, y2, d;
        
        System.out.println("Digite o numero X1:");
        x1 = input.nextDouble();
        
        System.out.println("Digite o numero X2:");
        y1 = input.nextDouble();
        
        System.out.println("Digite o numero Y1:");
        x2 = input.nextDouble();
        
        System.out.println("Digite o numero Y2:");
        y2 = input.nextDouble();
        
        d = Math.sqrt(Math.pow(x2 - x1 , 2) ) + Math.pow(y2 + y1, 2) ;
        
        System.out.printf("o Resultado é: %f\n",d);
    }
    
}
