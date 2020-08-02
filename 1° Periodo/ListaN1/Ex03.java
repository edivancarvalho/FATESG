
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nomeH, sobreNomeH, nomeM, sobreNomeM;
        int ano, subtracaoAno;
        
        System.out.println("Escreva seu Primeiro nome: ");
        nomeH = input.nextLine();
        
        System.out.println(nomeH + ", Escreva seu sobre nome: ");
        sobreNomeH = input.nextLine();
        
        System.out.println(nomeH + " " +sobreNomeH + "");
        
        System.out.println("Escreva seu Primeiro nome: ");
        nomeM = input.nextLine();
        
        System.out.println(nomeM + ", Escreva seu sobre nome: ");
        sobreNomeM = input.nextLine();
        
        System.out.println(nomeM + " " +sobreNomeM + "");
        
        System.out.printf("Seu casamento ocorreu no anos de 2019 %n Digite o ano atual: ");
        ano = input.nextInt();
        
        subtracaoAno = ano - 2019;
        
        System.out.printf(" %s %s é casado com %s %s há %s anos", nomeH, sobreNomeH, nomeM, sobreNomeM, subtracaoAno);
        
    }
    
}
