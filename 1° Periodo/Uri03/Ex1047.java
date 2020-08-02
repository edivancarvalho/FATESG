package Uri03;

import java.util.Scanner;

/**
 * @author carvalho
 * @author edivan
 */
public class Ex1047 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal, minutos,
                tempoFinalminuto, tempoInicialminuto, diferença, dhoras, dminutos;

        horaInicial = input.nextInt();
        minutoInicial = input.nextInt();
        horaFinal = input.nextInt();
        minutoFinal = input.nextInt();
        tempoInicialminuto = horaInicial * 60 + minutoInicial;
        tempoFinalminuto = horaFinal * 60 + minutoFinal;

        diferença = tempoFinalminuto - tempoInicialminuto;
        if (diferença <= 0) {
            diferença = 1440 + diferença;
        }
        dhoras = diferença / 60;
        dminutos = diferença % 60;
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", dhoras, dminutos);
    }
}
