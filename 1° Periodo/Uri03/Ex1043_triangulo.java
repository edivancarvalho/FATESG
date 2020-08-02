/*

.
|\
| \ 
|  \
|___\
----------
 */
package Uri03;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1043_triangulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a, b, c, Perimetro, area;

        //System.out.println("Informe o lado altura: ");
        a = input.nextFloat();

        //System.out.println("Informe o lado Base: ");
        b = input.nextFloat();

        //System.out.println("Informe o lado Cateto: ");
        c = input.nextFloat();

        //Formulas
        Perimetro = a + b + c;
        area = ((b + a) * c) / 2;// essa formula é a area do trapezio.

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            //System.out.printf("Perimetro = %d%n",Perimetro);
            //System.out.println("As medidas dos lados formam um triangulo.");
            System.out.printf("Perimetro = %.1f%n", Perimetro);
        } else {
            //System.out.println("As medidas dos lados NÃO formam um triangulo.");
            System.out.printf("Area = %.1f%n", area);
        }
    }
}
