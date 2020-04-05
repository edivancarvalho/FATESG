
package classes;

/**
 * atualizado no github
 * @author edivan
 */
public class Cilindro {

    private float raio = 0;
    private float altura = 0;

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

    public float calculoDaAreaLateral() {
        return (float) (2 * 3.1415 * raio * raio * altura);
    }

    public float areaTotal() {
        return (float) (2 * 3.1415 * raio * (altura + raio));
    }

    public float areaTotalDoVolume() {
        return (float) (3.1415 * raio * raio * altura);
    }

}
