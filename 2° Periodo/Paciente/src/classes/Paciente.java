package classes;

/**
 *
 * @author edivan
 */
public class Paciente {

    private String nome = "";
    private float peso = 0;
    private float altura = 0;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
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

    public float calcularIMC() {
        return peso / (altura * altura);
    }

    public String calcularFaixaDePeso() {
        if (calcularIMC() <= 20) {
            return (String) "Abaixo do Peso ideal";
        } else if (calcularIMC() >= 20 && calcularIMC() <= 25) {
            return (String) "Peso Normal";
        }else if (calcularIMC() >= 25 && calcularIMC() <= 30){
            return (String) "Excesso de Peso";
        }else if (calcularIMC() > 30 && calcularIMC() <= 35)
            return (String)"Obesidade";
        
        else return (String) "Obesidade Mórbida";

    }
}
