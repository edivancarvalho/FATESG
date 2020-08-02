/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri03;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex2323_teste2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        // faser o teorema de pitagora e se os dois lados forem iguual ele é triandulo rentangulo.
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        //formula Pitagoras H² = c² + c² // C² = a² + ²;
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            // System.out.println("As medidas dos lados formam um triangulo.\n");

            if (a == b && b == c) {// == igual, && e
                System.out.println("Valido-Equilatero");

            } else if (a == b || a == c || b == c) {
                //System.out.println("Valido-Isoceles");
                System.out.println("Valido-Isoceles");

            } else if (a != b && b != c && a != c) {
                System.out.println("Valido-Escaleno");
            }
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Retangulo: S");
            } else if (a * a != b * b + c * c || b * b != a * a + c * c || c * c != a * a + b * b) {
                System.out.println("Retangulo: N");
            }

        } else {
            System.out.println("Invalido");
        }
    }
}
