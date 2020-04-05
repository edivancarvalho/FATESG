package classes;


/**
 *
 * @author edivan
 */
public class Esfera {

    private float raio = 0;

    /**
     * @return the raio
     */
    public float getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float areaTotal(){
        return  (float) (4 * 3.1415 + getRaio());    
    }
    
    
    public float volume(){
        return (float) ((4.0 / 3.0) * 3.1415 * raio * raio * raio) ;
    }
    
    

}
