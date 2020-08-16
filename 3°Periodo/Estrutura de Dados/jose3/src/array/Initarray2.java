package array;
/**
 * @author edivan
 */
public class Initarray2 {
    public static void main(String[] args) {
        // Lista de inicializadores especifica do valor
        int array[] = {32, 27, 64, 18, 95, 14, 90, 70, 69, 37};
        System.out.printf("%s%8s\n","Index","value");//Títulos de coluna
        
        // Gera saída do valor de cada elemento do array
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d\n", counter, array[counter]);
    }// fim de main
    
}// fim da classe InitArray2
