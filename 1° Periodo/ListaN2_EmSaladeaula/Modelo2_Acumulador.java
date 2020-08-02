
package ListaN2_EmSaladeaula;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Modelo2_Acumulador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int c, s, idade;
        c = 1;
        s = 0;
        
        while (c <=5 ){
            System.out.println("Informe a idade: ");
            idade = input.nextInt();
            
            s = s + idade; //Acumulador
            c++; //Contador
        }
    }
    
}
