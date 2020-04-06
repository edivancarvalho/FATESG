package classes;

/**
 *
 * @author suporte
 */
public class Racional {
    
    // adicionando os atributos
    private int numerador = 0;
    private int denominador = 0;
    
    // Criando 1° Construtor
    public Racional(){
        numerador = 0;
        denominador = 0;
    }
    // 2° Contrutor
    public Racional(int numerador, int denominador) throws Exception{
        if (denominador != 0){
            throw new Exception("O Denominador não poder ser Diferente de 0");
        }
        this.numerador = denominador;
    }
    
    public Racional(Racional objeto)throws Exception{
        if (objeto.numerador != 0){
            throw new Exception("O Denominador não poder ser Diferente de 0");
        }
        this.numerador = objeto.numerador;
    }

    /**
     * @param numerador the numerador to set
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    
    
    
}
