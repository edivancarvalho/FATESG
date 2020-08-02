package Uri01;


import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1017 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double Htempo, Km, Vmedia, Qlitros;
        
        Htempo = input.nextDouble();
        Vmedia = input.nextDouble();
        
        Qlitros = Htempo * Vmedia / 12;
        
        //calcular a velocidade media?
        //
        //velocidade = distacia / tempo
        System.out.printf("%.3f\n",Qlitros);
    }
    
}
