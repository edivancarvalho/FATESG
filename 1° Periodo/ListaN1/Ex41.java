/**
 *Desenvolver um programa para calcular a conta da agua para a SANEAGO. O custo da 
água varia dependendo do tipo de consumidor: residencial, comercial ou industrial. 
a. Residencial: R$ 5,00 de taxa mais R$ 0,05 por m³ gastos.
b. Comercial: R$ 500,00 para os primeiros 80m³ mais R$ 0,25 por m³ gastos acima dos 
80m³.
c. Industrial: R$ 800,00 para os primeiros 100m³ gastos mais R$ 0,04 por m³ gastos 
acima dos 100m³; 
 *
 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double residencial = 5, comercial = 500, industrial = 800;
        double metros;
        int menu;
        
        System.out.println("Escreva o valor gatos de agua: ");
        metros = input.nextDouble();
        
        System.out.println("escolhar uma opção: (1)Residencial (2)comercial (3)Industrial");
        menu = input.nextInt();
        
        switch(menu){
             case 1:
                System.out.printf("%.2f\n",residencial + (metros * 0.05));
                break;
            case 2:
                System.out.printf("%.2f\n",comercial + (metros * 0.25));
                break;
            case 3:
                System.out.printf("%.2f\n",industrial + (metros * 0.04));
                break;
        }
        
    }
    
}
