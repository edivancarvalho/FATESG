package Uri01;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1018 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n100, n50, n20, n10, n5, n2, n1, valor, nota; // n = nota | v = Valor;
       
        nota = input.nextInt();
        
        valor = nota;
        
        n100 = nota /100;
        nota = nota - (n100 * 100);
        
        n50 = nota /50;
        nota = nota - (n50 * 50); // cadeia de resto.
        
        n20 = nota /20;
        nota = nota - (n20 * 20);
        
        n10 = nota /10;
        nota = nota - (n10 * 10);
        
        n5 = nota /5;
        nota = nota - (n5 * 5);
        
        n2 = nota /2;
        nota = nota - (n2 * 2);
        
        n1 = nota; // n1 receber o resto do resto;
        
        //System.out.println(nota);
        System.out.printf("%d nota(S) de R$ 100,00%",n100);
        System.out.printf("%d nota(S) de R$ 50,00\n",n50);
        System.out.printf("%d nota(S) de R$ 20,00\n",n20);
        System.out.printf("%d nota(S) de R$ 10,00\n",n10);
        System.out.printf("%d nota(S) de R$ 5,00\n",n5);
        System.out.printf("%d nota(S) de R$ 2,00\n",n2);
        System.out.printf("%d nota(S) de R$ 1,00\n",n1);
        
    }
    
}