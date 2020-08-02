package classes;

/**
 *
 * @author edivan
 */
public class Piramide {
    // Atributos
    private float base = 0;
    private float altura = 0;
    
    // METODOS

    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float calcularVolume(){
        // coegir o valor para float.
        return (float)(1.0/3.0 * base * altura);
        //return (1/3 * base * altura); esta forma é errada;
    }
    
}
