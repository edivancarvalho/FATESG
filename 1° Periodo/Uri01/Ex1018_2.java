package Uri01;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author edivan
 */
public class Ex1018_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
        int N, valor, n100, n50, n20, n10, n5, n2, n1;
        
        N = input.nextInt();
        
        valor = N;
        n100 = N / 100;
        // %= 100 | resto do quociente da divisao. 9,5 = 50
        N %= 100;
        
        n50 = N / 50;
        N %= 50; // N receber resto do quociente de 50
        
        n20 = N / 20;
        N %= 20; // N receber resto do quociente de 20 
        
        n10 = N / 10;
        N %= 10;
        
        n5 = N / 5;
        N %= 5;
        
        n2 = N / 2;
        N %= 2;
        
        n1 = N;
        
        System.out.println(valor);
        System.out.printf("%d nota(s) de R$ 100,00%n", n100);
        System.out.printf("%d nota(s) de R$ 50,00%n", n50);
        System.out.printf("%d nota(s) de R$ 20,00%n", n20);
        System.out.printf("%d nota(s) de R$ 10,00%n",n10);
        System.out.printf("%d nota(s) de R$ 5,00%n",n5);
        System.out.printf("%d nota(s) de R$ 2,00%n",n2);
        System.out.printf("%d nota(s) de R$ 1,00%n",n1);
        
    }
    
}
