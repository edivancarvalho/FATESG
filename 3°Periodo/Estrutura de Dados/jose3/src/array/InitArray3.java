package array;
/**
 * @author edivan
 */
public class InitArray3 {
    public static void main(String[] args) {
        
        final int ARRAY_LENGTH = 10; //declara a constante
        int array[] = new int[ ARRAY_LENGTH]; // criar o array
        
        // calcular o valor para cada elemento do arrary
        for (int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;
        System.out.printf("%s%8s\n", "Index","Value"); // Título de coluna
        
        // gera saída do valor de cada elemento do array
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d\n",counter, array[counter]);
    }// fim de main
}//fim da classe 
