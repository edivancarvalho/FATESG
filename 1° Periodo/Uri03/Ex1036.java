/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.

Exemplos de Entrada	Exemplos de Saída
10.0 20.1 5.1           R1 = -0.29788
                        R2 = -1.71212

0.0 20.0 5.0            Impossivel calcular

10.3 203.0 5.0          R1 = -0.02466
                        R2 = -19.68408

10.0 3.0 5.0            Impossivel calcular

 */
package Uri03;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1036 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a, b, c, x1,x2,raiz,y1,y2;
        float delta;
        
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
        //delta = (float) (Math.pow(b, 2) - (4 * a * c));
        raiz = Math.sqrt(Math.pow(b, 2) -4 * a * c );
        System.out.printf("R1 = %.5f%n",raiz);
        //formula
        // x =  -b + √ b² - 4*a*b /2*a
        
//System.out.println(Double.isNaN(Math.sqrt(Math.pow(b, 2) -4 * a * c )));
        
        //if (raiz < 0 && 0 > raiz){
       // if (Double.isNaN(raiz) || (!Double.isNaN(raiz || raiz >= 0 )){
        if (raiz >=  0){
            //y1 = (-b + (Math.sqrt(Math.pow(b, 2) -4 * a * c ))) / (2 * a);
            //System.out.printf("R1.0 = %.5f%n",y1);
            System.out.printf("raiz é maior\n");
            
            //y2 = (-b - (Math.sqrt(Math.pow(b, 2) -4 * a * c ))) / (2 * a);
            //System.out.printf("R2.0 = %.5f%n",y2);
            
        }else {
            System.out.printf("\n\nImpossivel calcular\n");
        }
           
        
        /**if (raiz > 0)
            System.out.printf("\n\nImpossivel calcular\n");
            
            
        }else {
            x1 = (-b + (Math.sqrt(Math.pow(b, 2) -4 * a * c ))) / (2 * a);
            System.out.printf("R1 = %.5f%n",x1);
            
            x2 = (-b - (Math.sqrt(Math.pow(b, 2) -4 * a * c ))) / (2 * a);
            System.out.printf("R2 = %.5f%n",x2);
        }**/
//else System.out.printf("olha la %f\n");
        
        
        /**
         * x1 = (-b + (Math.sqrt(Math.pow(b, 2) -4 * a * c ))) / (2 * a);
        
        System.out.printf("Raiz é = %.5f%n",raiz);
        System.out.printf("R1 = %.5f%n",x1);
        
        x2 = (-b - (Math.sqrt(Math.pow(b, 2) -4 * a * c ))) / (2 * a);
        System.out.printf("R2 = %.5f%n",x2);
         */
    }
    
}
