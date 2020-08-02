/*
 28 - Num frigorífico existem 5 bois. Cada boi traz em seu pescoço um cartão contendo seu 
 número de identificação e seu peso. Faça um programa que escreva o número e o peso 
 do boi mais gordo e do boi mais magro. Assuma que os dados são válidos.
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 * @author ajudar do vinicios;
 * @author edivan
 */
public class Ex28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //DECLARAÇÃO DA VARIAVEL
        String id;
        String idGordo, idMagro;
        double peso, pesoIdGordo, pesoIdMagro;

        idGordo = idMagro = "0";
        pesoIdGordo = pesoIdMagro = 0;

        for (int i = 1; i <= 5; i++) {
            // ENTRADA
            System.out.printf("Digite o código do %s° BOI :: ", i);
            id = input.nextLine();

            System.out.printf("Digite o Peso do [BOI %s] :: ", id);
            peso = input.nextDouble();
            input.nextLine();
            System.out.println();
            

            //PROCESSAMENTO;
            if (i == 1) {
                idGordo = idMagro = id;
                pesoIdGordo = pesoIdMagro = peso;

            } else {
                if (peso > pesoIdGordo){
                    idGordo = id;
                    pesoIdGordo = peso;
                }
                if (peso < pesoIdMagro){
                    idMagro = id;
                    pesoIdMagro = peso;
                }
            }

        }
        // Saída
        System.out.println();
        System.out.printf("O boi com ID [%s] é o mais gordo, com %.2f kg.\n", idGordo, pesoIdGordo);
        System.out.printf("O boi com ID [%s] é o mais magro, com %.2f kg.\n", idMagro, pesoIdMagro);
    

    }

}
