/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaN2_EmSaladeaula;

/**
 *
 * @author edivan
 */
public class aula12 {

    public static void main(String[] args) {

        int n = 6, c;
        int soma;

        for (n = 1; n <= 100000; n++) {
//            System.out.printf("" + n + "----");
            soma = 0;
            for (c = 1; c <= n / 2; c++) {
                if (n % c == 0) {

                    soma = soma + c;
                }

            }
            if (soma == n) {
                System.out.println(n + " é perfeito");
            }
        }
    }
}
//        // tabuaada
//        int n = 5, c;
//
//        for (n = 1; n <= 10; n++) {
//            System.out.printf("" + n + "----");
//            for (c = 1; c <= 10; c++) {
//                System.out.printf("\n %d X %d = %d", n, c, n * c);;
//            }
//        }
//        System.out.println("\n");
//
//    }
//    }
//    do{
//    idade = leia.nextInt()
//            whi
//    
//}while(Continuar -= s ou continuar = n);
//    
//}
////
//int n =5 ,c;
//for (n=1; n<=10; n++){
//
//}
