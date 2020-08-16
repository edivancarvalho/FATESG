package array;
import java.util.Random;

/**
 * @author edivan
 */
public class Rolldie {
    public static void main(String[] args) {
        Random randoNumbers = new Random(); //gerador de número aleatório
        int frequency[] = new int[7]; // array de contadores de frequencia

        // lança o dados 6000vezes; usa o valor do dado como
        for (int roll = 1; roll <= 6000; roll++) 
            ++frequency[1 + randoNumbers.nextInt(6)];
        
        System.out.printf("%s%10s\n", "Face", "Frequency");

        // gera saída do valor de cada elemento do array
        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d\n", face, frequency[face]);
        }
    }//fim de main
}// fim da classe Rolldie
