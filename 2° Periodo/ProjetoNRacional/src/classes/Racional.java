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
    
    public void setObjeto(Racional objeto) throws Exception{
        if (denominador != 0){
            throw new Exception("Denominado não pode ser Diferente de Zero.");
        }
    }
    
    public String get(){
        return (numerador + "" + numerador);
    }
    
    public Racional adicionar(Racional objetoadicionar){
        int aux1 = this.numerador;
        int aux2 = objetoadicionar.denominador;
         int resultado = 0;     
        resultado = aux1 + aux1;
        
        return new Racional();
    }

    public void adicionar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
