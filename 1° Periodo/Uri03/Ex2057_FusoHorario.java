/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri03;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex2057_FusoHorario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sHoras, tempo, fuso, soma;

        //S (0 ≤ S ≤ 23), T (1 ≤ T ≤ 12) e F (-5 ≤ F ≤ 5)
        System.out.println("Digite a hora: ");
        sHoras = input.nextInt();

        System.out.println("Digite o tempo: ");
        tempo = input.nextInt();

        System.out.println("Digite a fuso: ");
        fuso = input.nextInt();
        // Soma as horas
        soma = sHoras + tempo + fuso;
        
        if (0 <= soma && soma < 24){
            System.out.printf("%d%n",soma);
        }
        else if (soma >= 24){
            System.out.printf("%d%n",soma - 24);
        }
        else if (soma < 0){
            System.out.printf("%d%n",soma + 24);
        }
    }
}