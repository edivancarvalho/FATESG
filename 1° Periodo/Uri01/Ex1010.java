package Uri01;


import java.util.Scanner;


/**
 *
 * @author edivan
 */
public class Ex1010 {
    public static void main(String[] args) {
        
        int codigo1, codigo2, Qtpecas1, Qtpecas2;
        double Vunitario1, Vunitario2;
        double T1, T2, VTotal;
                
        Scanner input = new Scanner(System.in);
        
        codigo1 = input.nextInt(); 
        Qtpecas1 = input.nextInt();
        Vunitario1 = input.nextDouble();
        T1 = Qtpecas1 * Vunitario1;
        
        codigo2 = input.nextInt(); 
        Qtpecas2 = input.nextInt();
        Vunitario2 = input.nextDouble();
        T2 = Qtpecas2 * Vunitario2;
        
        VTotal = T1 + T2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",VTotal); //%.2f\n",T)
        
    }
    
}
