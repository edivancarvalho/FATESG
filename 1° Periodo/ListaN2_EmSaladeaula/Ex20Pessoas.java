package ListaN2_EmSaladeaula;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex20Pessoas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        int cont = 1, filhos, qntMenos2Filhos = 0, qMais2Filhos = 0;
        double media, soma = 0;
        
        int  qntPessoas = 5;
        
        while (cont <= qntPessoas){
            System.out.println("Informe a quantidade de filhos: ");
            filhos = input.nextInt();
            while(filhos < 0){
                System.out.println("Qauntidade de filhos invalida, informe novamente: ");
                filhos = input.nextInt();
            }
            
            soma = soma + filhos;
            if (filhos <=2){
                qntMenos2Filhos++;
            }
            else{
                qntMenos2Filhos++;
            }
            cont++;
        }
        
    }
    
}
