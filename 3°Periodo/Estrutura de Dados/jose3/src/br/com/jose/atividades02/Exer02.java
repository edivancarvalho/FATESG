package br.com.jose.atividades02;

/**
 *
 * @author edivan
 */
public class Exer02 {
    public static void main(String[] args) {
        
        int[] vetor1 = new int [50];
        int aux = 0;
        // gera numero de 1 ate 50;
        
        for (int i = 0; i < vetor1.length; i ++) { // para "i" = 0, até "i" < 100*2, faça...
            // calculos
            
            vetor1[aux] = i;
            //vetor1[aux] = vetor1[aux] % 2;
            System.out.println(vetor1[aux] % 2);
            aux++;
        }
        
        
    }
    
}
