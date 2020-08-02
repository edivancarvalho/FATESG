/**
 * 
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex34 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        double peso,altura, formula;
        
        System.out.println("Escreva seu peso: ");
        peso = input.nextDouble();
        
        System.out.println("Escreva sua altura: ");
        altura = input.nextDouble();
        //Formula IMC = peso /(altura)²
        
        formula = (peso / (altura * altura));
        System.out.printf("%.2f\n",formula);
        
        
        if (formula < 18.5 || formula < 25 || formula <= 30 || formula > 30 ){
            
            if (formula < 18.5){
                System.out.printf("Abaixo do peso\n");
            }
            else if (formula < 25){
                System.out.printf("Peso normal\n");
            }
            else if (formula <= 30 ){
                System.out.printf("acima do peso\n");
            }
            else if (formula > 30 ) {
                System.out.printf("Você esta obeso\n");
            }
            else{
                System.out.println("Caracter invalido a.\n");
            }
        }else{
            System.out.println("Caracter invalido.\n");
        }
        
        
    }
    
}
