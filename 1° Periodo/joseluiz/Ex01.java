/** IMPORTANTE INFORMAÇÃO SOBRE O printf
 * %s = imprimir variavel string com letras menusculas.
 * %S = imprimir variavel string com letras Maiusculas
 * 
 * %c = imprimir um caracter| %C imprimir um em maiusculo.
 * %n = Imprimir em nova linha.
 * %d = numeros inteiros
 * %f = pontos flutuantes casas decimais.
 * %20s = imprimir com 20 caccteres tipos (escapço em branco);
 * esta sendo alinhado a direita caso para a esquerda adicionar "%-20s"
 * 
 * "%+d", valor; = colocar como o valor positivo;
 * %015d = ele compreta com o 0 ate forma o 15 caracter;
 * 
 * FORMATAÇÃO DE NUMERO,
 * 
 * %,d = ele colocar a , tipo (123,456,789); no brasil usar ponto ( . );
 * 
 * %.3f = imprimir ponto flutante com 3 casas tipo = 3.123
 * 
 * "R$%10.2f" = resultando sera; R$        3.15 | ele colocar um espacamento de 10.
 * 
 */
package joseluiz;

import java.util.Scanner;

/**
 *
 * @author edivan carvalho
 * @fazendo backup no github
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float a, b, c, delta;
        
        System.out.println("Informe o valor de A: ");
        a = input.nextFloat();
        System.out.println("Informe o valor de B: ");
        b = input.nextFloat();
        System.out.println("Informe o valor de C: ");
        c = input.nextFloat();
        
        delta = b*b -4 * a * c;
        System.out.println("O valor de Delta é : "+delta);
        System.out.printf("O valor de:%n  %.2f, %10.2f, %10.2f : ",a,b,c);
        
    }
    
}
