package array;
/**
 * @author edivan
 */
public class InitArray {
    public static void main(String[] args) {
        
        int array[]; // declara o array identificado
        
        array = new int[10]; // cria o espaço
        
        System.out.printf("%s%8s\n", "Index", "Value"); // titulo de coluna
        
        //gera saída do valor de cada elemento do array
        for( int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }// fim do main
    }
}
