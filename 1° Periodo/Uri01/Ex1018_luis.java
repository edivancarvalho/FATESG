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
public class Ex1018_luis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
        int  valor, aux, n100, n50, n20, n10, n5, n2, n1;
        
        valor = input.nextInt();
        
        n100 = valor / 100;
        // %= 100 | resto do quociente da divisao. 9,5 = 50
        aux = valor%100;
        
        n50 = valor / 50;
        aux = aux%50; // N receber resto do quociente de 50
        
        n20 = aux / 20;
        aux = aux%20; // N receber resto do quociente de 20 
        
        n10 = aux / 10;
        aux = aux%10;
        
        n5 = aux / 5;
        aux = aux%5;
        
        n2 = aux / 2;
        aux = aux%2;
        
        n1 = aux/1;
        
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
