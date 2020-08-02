
package ListaN2_EmSaladeaula;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Modelo1_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Codição de entrada.
        int n,c;
        
        System.out.println("Digite um numero: ");
        n = input.nextInt();
        
        // 1° passo da inicialização.
        c = 1; // c = 1
        
        //Codição de Parada
        while (c <= 10){
            System.out.printf("\n %d X %d = %d",n,c,n*c);
            c = c + 1; // ou c++
            
        }
    }
    
}
