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
 * @author https://www.youtube.com/watch?v=nxHsvuSrKEQ
 * @author edivan
 */
public class Ex1036_teste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double delta, x1, x2, a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        // se delta for maior que zero.
        delta = Math.pow(b, 2) - (4 * a * c);
        if ((a != 0) && (delta > 0)) {
            //delta = Math.sqrt(delta);
            //x1 = ((-b) + (delta));
            //x2 = ((-b) - (delta));
            x1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
            //x1 = (x1 / (2 * a));
            System.out.printf("R1 = %.5f%n", x1);

            x2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
            //x2 = (x2 / (2 * a));
            System.out.printf("R2 = %.5f%n",x2);
        } else {
            System.out.printf("Impossivel calcular%n");
        }
    }
}
