/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex20Teste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // DECLARAÇÃO DAS VARIAVEIS
        String login = null, edivan;
        int password = 0, senha, cout;

        // INICIALIZAÇÃO DA VARIAVEL
        cout = 0;
        senha = 202;
        edivan = "edivan";

        while (login != edivan && password != senha) {
            //ENTRADA
            System.out.println("Digite seu usuario ::");
            login = input.nextLine();

            System.out.println("Digite sua senha ::");
            password = input.nextInt();
            
            //PROCESSAMENTO
            if (login != edivan && password != senha) {
                System.out.println("SENHA INCORRETA, TENTE NOVAMENTE.\n");
                cout++;
                //Buff
                input.nextLine();
            }else{
                System.out.println("BEM-VINDO AO SISTEMA.");
            }

            }
//        while (login == edivan && password == senha) {
//            //ENTRADA
//            System.out.println("Digite seu usuario ::");
//            login = input.nextLine();
//
//            System.out.println("Digite sua senha ::");
//            password = input.nextInt();
//
//            if (login != edivan && password != senha) {
//                System.out.println("ACESSO BLOQUEADO, PROCURE UM MODERADOR!");
//                cout++;
//                //Buff
//                input.nextLine();
//            }
//        }
        }
    }
