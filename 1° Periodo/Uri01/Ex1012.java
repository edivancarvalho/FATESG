package Uri01;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double A, B, C, Tri, Qua, Cir, Tra, Ret;
        double pi = 3.14159;
               
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        
        Tri = (A * C) / 2; //formula do triangulo A = (b.h)/2 | A = b.c /2;
        Cir = (pi * (C * C)); // CIRCULO Formula A = 2.π.r.r/2 ou A = π.r² (π = Pi = 3,14159, r  = raio )
        Tra = ((A + B) * C) / 2; // TRAPEZIO Formula A = ((B+b).H)/2 | A = Area, B = Base maior, b= base menor, e H = altura
        Qua = (B * B); // QUADRADO A = l.l ou A = l^
        Ret = (A * B); //RETANGULO A = b.h (A = area, b = base e H = altura)
        
        System.out.printf("TRIANGULO: %.3f\n",Tri); //%.2f\n",T)
        System.out.printf("CIRCULO: %.3f\n",Cir); //%.3f\n", T)S
        System.out.printf("TRAPEZIO: %.3f\n",Tra); //%.2f\n",T)
        System.out.printf("QUADRADO: %.3f\n",Qua); //%.2f\n",T)
        System.out.printf("RETANGULO: %.3f\n",Ret); //%.2f\n",T)
        
    }
    
}
