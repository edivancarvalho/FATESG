/**
 * Fazer um programa que leia e armazene em um vetor 16 números inteiros distintos.
 * Em seguida, determine e imprima o maior e segundo maior número armazenado neste vetor.
 * Exemplo: dado o vetor vet = {1,3,6,-4,10,20,15,100,-15,-45,200,300,490,17,18,380}.
 * Então o maior é 490 e o segundo maior é 380.
 */
package br.com.jose.atividades01;

/**
 *
 * @author edivan
 */
public class MaiorMenor {

    public static void main(String[] args) {

       double[] numero = {1, 3, 6, -4, 10, 20, 15, 100, -15, -45, 200, 300, 490, 17, 18, -1};
        double maior2 = 0;
        double maior1 = 0;

        for (int i = 0; i <= numero.length-1; i++) {
            if (numero[i] > maior1){
                maior1 = numero[i];
            }
            else  maior2=numero[i]; // fazer outro if
        }
        
        System.out.println("Primeiro número Maior: " + maior1);
        System.out.println("segundo número Maior: " + maior2);
    }

}
