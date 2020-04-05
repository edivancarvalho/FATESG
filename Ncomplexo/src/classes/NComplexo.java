package classes;

/**
 *
 * @author edivan
 */
public class NComplexo {
    // atributos
    private int parteReal = 0;
    private int parteImaginaria = 0;
    // Metodos
    
    public NComplexo(){ // construtor
        parteReal = 0;
        parteImaginaria = 0;
    }
    // Contrutor fixo
    public NComplexo(int parteReal, int parteImaginaria){
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }
    // contrutor de copiar.
    public NComplexo(NComplexo objeto){
        this.parteReal = objeto.parteReal;
        this.parteImaginaria = objeto.parteImaginaria;
                
    }    
    public void set(int parteReal, int parteImaginaria){
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }
    
    public void set(NComplexo objeto){
        this.parteReal = objeto.parteReal;
        this.parteImaginaria = objeto.parteImaginaria;
    }
    
    public String get(){
        return (parteReal + " + " + parteImaginaria + "i");
    }
    
    
    public NComplexo adicionar(NComplexo objeto){
        int real = this.parteReal + objeto.parteReal;
        int imaginaria = this.parteImaginaria + objeto.parteImaginaria;
        NComplexo aux = new NComplexo(real, imaginaria);
        return aux;
        
        // ou
//        return new NComplexo (this.parteReal+objeto.parteReal,
//        this.parteImaginaria+objeto.parteImaginaria);
        
    }
}
