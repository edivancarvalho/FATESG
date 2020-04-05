package classes;

public class Cone {
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
    
    public float calcularGeratriz(){
        float valor = altura * altura + raio * raio;
        return (float) (Math.sqrt(valor)); // Coerção
    }
    
    public float calcularAreaLateral(){
        return (float) (3.1415 * getRaio() * calcularGeratriz());
    }
    
    public float calcularAreaTotal(){
        return (float)(3.1415 * raio * (calcularGeratriz() + raio ));
    }
    
    public float calcularVolume(){
       return (float) (1.0 / 3.0 * 3.1415 * raio * raio * altura);
    }
}
