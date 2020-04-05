
package classes;

/**
 *
 * @author edivan
 */
public class Retangulo {
    private float comprimento = 0;
    private float largura = 0;

    /**
     * @return the comprimento
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the largura
     */
    public float getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    // ##############   CALCULOS    ################
    public float calculoDoPerimetro(){
        return (float) 0;
    }
    public float calculoDoRetangulo(){
        return (float )0;
    }
    public float calculoDaArea(){
        return (float) largura * comprimento;
                
    }
    public float calculoPerimetro(){
        return (float) largura + largura + comprimento + comprimento;
    }
    
}
