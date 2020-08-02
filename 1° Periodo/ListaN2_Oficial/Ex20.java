/*
 * Faça um programa para realização do login em um sistema. O algoritmo deverá 
 receber um login (cadeia de caracteres) e uma senha baseada em números inteiros. 
 Em seguida o algoritmo deverá verificar a senha digitada, 
 caso ela esteja correta o sistema deverá mostrar a seguinte 
 mensagem: “BEM-VINDO AO SISTEMA, login”. 
 Caso a senha esteja incorreta a seguinte mensagem deverá ser apresentada: “SENHA INCORRETA, 
 TENTE NOVAMENTE”. Foi estipulado um limite de 3 tentativas para digitação da 
 senha, caso o usuário ultrapasse esse limite, o sistema deverá bloquear o acesso com a 
 seguinte mensagem: “ACESSO BLOQUEADO, PROCURE UM MODERADOR!”
 */
package ListaN2_Oficial;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // DECLARAÇÃO DAS VARIAVEIS
        String login, edivan;
        int password, senha, cout;

        // INICIALIZAÇÃO DA VARIAVEL
        cout = 0;
        senha = 202;
        edivan = "edivan";

        do {

            do {
                //ENTRADA
                System.out.println("Digite seu usuario ::");
                login = input.nextLine();

                System.out.println("Digite sua senha ::");
                password = input.nextInt();
                
                // PROCESSAMENTO.
                if (login != edivan && password != senha) {
                    // Relaliza 2 verificação.
                    if (cout <= 1) {
                        System.out.println("SENHA INCORRETA, TENTE NOVAMENTE.\n");
                    }
                    // 3° Verificação - Acesso Bloqueado.
                    if (cout == 2) {
                        System.out.println("ACESSO BLOQUEADO, PROCURE UM MODERADOR!.");
                    }
                } else {
                    System.out.println("BEM-VINDO AO SISTEMA.");
                    // Forçando o sistema a sair do Loop caso o acesso ao sistema.
                    cout = 5;
                }

                cout++;
                //Buff
                input.nextLine();
            } while (cout <= 2);

        } while (login == edivan && password == senha);

    }

}
