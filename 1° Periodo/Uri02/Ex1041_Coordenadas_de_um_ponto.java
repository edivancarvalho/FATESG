package Uri02;

import java.util.Scanner;

public class Ex1041_Coordenadas_de_um_ponto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float x, y;

        x = input.nextFloat();
        y = input.nextFloat();

        // 0 é maior que 0.1 
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } //Linta de X
        else if (y == 0 && x != 0) {
            System.out.println("Eixo X");
        } //Linha de Y
        else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

    }
}
