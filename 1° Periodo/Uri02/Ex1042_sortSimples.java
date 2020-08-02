
package Uri02;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1042_sortSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b,c,aux;
        int aa,bb,cc;
        
        //System.out.println("digite a:");
        aa = input.nextInt();
        a = aa;
        //System.out.println("digite b:");
        bb = input.nextInt();
        b = bb;
        //System.out.println("digite c:");
        cc = input.nextInt();
        c = cc;
        
        if (b < a){
        aux = a;
        a = b;
        b = aux;
        
        }
        if (c < a){
            aux = a;
            a = c;
            c = aux;
        }
        if (c < b){
            aux = b;
            b = c;
            c = aux;
        }
        System.out.printf("%d\n%d\n%d\n\n",a ,b ,c);
        System.out.printf("%d\n%d\n%d\n",aa ,bb ,cc);
        //System.out.printf("%d\n",b);
        //System.out.printf("%d\n",c);
    }
    
}
