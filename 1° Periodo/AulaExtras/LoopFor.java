/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaExtras;

/**
 *
 * @author edivan
 */
public class LoopFor {

    public static void main(String[] args) {
        //FOR  Normal.
        //o for separa por 3 intens
        for (int i=0; i < 5 ; i++ ){
            System.out.println("i tem valor: "+ i);
        }
        
        for (int i=5; i > 0 ; i-- ){
            System.out.println("i tem valor: "+ i);
        }
        //For com mais de uma variavel
        for (int i=0, j=10 ; i < j ; j--){
            System.out.println("i = " + i + "; j = " + j);
            
        }
        // Partes Ausentes.
        int count = 0;
        for (; count < 10 ;){
            System.out.println("Valor de count: " + count);
            count += 2;
        }
        //Mesma coisa que o exemplo acima.
        for (int cont = 0; cont < 10; cont += 2){
            System.out.println("valor de cont: " + cont);
        }
        //Loop Infinito
        //Nao executa iddo.
        //for (;; );
        
        int soma = 0;
        for (int i=1; i < 5; soma += i++); 
        // eu posso tira as { } e por ponto e virgula.
        System.out.println("O valor da Soma é "+soma);
        
        //-->> // eu posso tira as { } e por ponto e virgula.
        for (int i=0; i < 5 ; i++)
            System.out.println("i tem valor: "+ i);
        
        
        //=========================================================
        for (int i=0; i < 5 ; i++)
            System.out.println("i tem valor: "+ i);
            System.out.println("i tem valor: ");
        
        //OBS ° é uma boa pratica usar as chaves {}.
        // pois da muita diferença no código.
        for (int i=0; i < 5 ; i++) {
            System.out.println("i tem valor: "+ i);
            System.out.println("i tem valor: ");
        }
    }
}
