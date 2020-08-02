/**
 * Faça um algoritmo que calcule a quantidade de litros de combustível gasta em uma 
viagem, utilizando um automóvel que faz 12Km por litro. Para obter o cálculo, o usuário 
deve fornecer o tempo gasto na viagem e a velocidade média durante ela. Desta forma, será 
possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * 
VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de litros de 
combustível utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA / 
AUTONOMIA. O programa deve apresentar os valores da velocidade média, tempo gasto 
na viagem, a distância percorrida e a quantidade de litros utilizada na viagem. 

 */
package ListaN1;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Ex19 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double Htempo, Km, Vmedia, Qlitros;
        
        System.out.println("Digite tempo gasto em horas: ");
        Htempo = input.nextDouble();
        
        System.out.println("Digite a velocidade média: ");
        Vmedia = input.nextDouble();
        
        Qlitros = Htempo * Vmedia / 12;
        
        //calcular a velocidade media?
        //
        //velocidade = distacia / tempo
        System.out.printf("Gasto de %.1f Litros de combustível.\n",Qlitros);
    }
    
}
