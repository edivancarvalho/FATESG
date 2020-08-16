package array;

/**
 * @author edivan
 */
public class SumArray {

    public static void main(String[] args) {

        int array[] = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int total = 0;

        // adiciona o valor de cada elemento ao total
        for (int counter = 0; counter < array.length; counter++) {
            total += array[counter];
        }

        System.out.printf("Total of array elements: %d\n", total);
    }// fim de main
}// fim da classe SumArray