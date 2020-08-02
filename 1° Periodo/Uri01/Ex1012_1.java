package Uri01;

import java.text.DecimalFormat;
import java.util.Scanner;

 
public class Ex1012_1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double A, B, C, triangle, circle, trapezium, square, rectangle;
        double pi =3.14159;

        DecimalFormat df = new DecimalFormat("0.000");

        A = read.nextDouble();
        B = read.nextDouble();
        C = read.nextDouble();
        System.out.println("");

        triangle = (( A * C)/2);
        circle = pi*(Math.pow(C, 2));
        trapezium = (((A + B) * C) / (2));
        square = Math.pow(B,2);
        rectangle =A * B;

        System.out.println("TRIANGULO: " + df.format(triangle));
        System.out.println("CIRCULO: " + df.format(circle));
        System.out.println("TRAPEZIO: " + df.format(trapezium));
        System.out.println("QUADRADO: " + df.format(square));
        System.out.println("RETANGULO: " + df.format(rectangle));
        System.out.println("");
    }
    
}


/**import java.util.Scanner;

/**
 *
 * @author edivan
 
public class Ex1012_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double A, B, C, Tri, Qua, Cir, Tra, Ret;
               
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        
        Tri = (A * C) / 2; //formula do triangulo A = (b.h)/2 | A = b.c /2;
        Cir = (3.141459 * (C * C)); // CIRCULO Formula A = 2.π.r.r/2 ou A = π.r² (π = Pi = 3,14159, r  = raio )
        Tra = ((A + B) * C) / 2; // TRAPEZIO Formula A = ((B+b).H)/2 | A = Area, B = Base maior, b= base menor, e H = altura
        Qua = (B * B); // QUADRADO A = l.l ou A = l^
        Ret = (A * B); //RETANGULO A = b.h (A = area, b = base e H = altura)
        
        System.out.println("TRIANGULO: " + df.format(Tri));
        System.out.println("CIRCULO: " + df.format(Cir));
        System.out.println("TRAPEZIO: " + df.format(Tra));
        System.out.println("QUADRADO: " + df.format(Qua));
        System.out.println("RETANGULO: " + df.format(Ret));
        System.out.println("");
    }
    
}
*/