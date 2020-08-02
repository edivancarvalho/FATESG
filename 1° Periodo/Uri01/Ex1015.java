package Uri01;


import java.util.Scanner;


/**
 *
 * @author edivan
 */
public class Ex1015 {
    public static void main(String[] args) {
        double X1, X2, Y1, Y2, Dis, Qua;
        //double X1, X2, Y1, Y2, Dis, Qua;
        
        Scanner input = new Scanner(System.in);
        
        X1 = input.nextDouble();
        Y1 = input.nextDouble();
        X2 = input.nextDouble();
        Y2 = input.nextDouble();
        
        Dis = Math.pow(Math.pow(X2 - X1,2) + Math.pow(Y2 - Y1,2),0.5);
        //Qua = (Math.sqrt((X2 - X1) * 2) + ((Y2 - Y1) * 2)); // ou  
        //Qua = ((X2 * X2) - (X1 * X1)) + ((Y2 * Y2) - (Y1 - Y1));
        //Dis = Math.sqrt(Qua); //Qua = Math.sqrt();
        // fonte: https://t.me/joinchat/JzOOcRQVTGxcvY01i5K-Cg
        System.out.printf("%.4f\n",Dis);
    }
    
}
