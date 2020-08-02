/*
 * eia um número inteiro que representa um código de DDD para discagem interurbana. 
 Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
 -----------------------------
 DD      DESTINATION         |
 -----------------------------
 61      BRASILIA
 71      SALVADOR
 11      SAO PAULO
 21      RIO DE JANEIRO
 32      JUIZ DE FORA
 19      CAMPINAS 
 27      VITORIA
 31      BELO HORIZONTE
 =============================
 XX      DDD não cadastrato.
 -----------------------------
 Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
 DDD nao cadastrado
 */
package Uri03;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex1050 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ddd;

        //System.out.println("Digite o DDD: ");
        ddd = input.nextInt();

        if (ddd == 61 || ddd == 71 || ddd == 11 || ddd == 21 || ddd == 32 || ddd == 19 || ddd == 27 || ddd == 31) {
            if (ddd == 61) {
                System.out.println("Brasilia");
            } else if (ddd == 71) {
                System.out.println("Salvador");
            } else if (ddd == 11) {
                System.out.println("Sao Paulo");
            } else if (ddd == 21) {
                System.out.println("Rio de Janeiro");
            } else if (ddd == 32) {
                System.out.println("Juiz de Fora");
            } else if (ddd == 19) {
                System.out.println("Campinas");
            } else if (ddd == 27) {
                System.out.println("Vitoria");
            } else if (ddd == 31) {
                System.out.println("Belo Horizonte");
            } else {
                System.out.println("DDD nao cadastrado");
            }
        }else System.out.println("DDD nao cadastrado");
    }
}
