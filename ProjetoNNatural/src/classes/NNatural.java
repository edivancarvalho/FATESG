package classes;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author edivan
 */
public class NNatural {

    // atributo da classe natural
    private long numero = 0;

    // 1° Construtor default
    public NNatural() {
        numero = 0;
    }

    // 2° Construtor     paraamentro=
    public NNatural(long novoNumero) throws Exception {
        if (novoNumero < 0) {
            throw new Exception("Numero não poder ser < 0 | 2° Construtor");
        }
        this.numero = novoNumero;
    }

    // 3° Construtor
    public NNatural(NNatural parametroNumero) throws Exception {
        if (parametroNumero.numero < 0) {
            throw new Exception("Número não poder ser < 0");
        }
        this.numero = parametroNumero.numero;
    }

    // METODOS Get
    /**
     * @return the numero
     */
    public long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(long numero) throws Exception {
        if (numero < 0) {
            throw new Exception("Número não poder ser < 0");
        }
        this.numero = numero;
    }

    // feito dia 3/3/2020 as 01;58
    public void setValor(NNatural valor) throws Exception {
        if (numero < 0) {
            throw new Exception("Número não poder ser < 0, caralho");
        }
//        valor = valor;
    }
//    public void setValor(long valor) throws Exception{
//        if (valor < 0 ) throw new Exception("Número não poder ser < 0");
//        valor = valor;
//    }

    /**
     * NUMERO PERFEITO
     *
     * @adptação Edivan Carvalho
     * @fonte https://youtu.be/fEsKRvULfxY
     * @return
     */
    public boolean nPerfeito() {
        int auxNPerfeito = (int) numero;
        int soma = 0;

        for (int i = 1; i < auxNPerfeito; i++) {
            if (auxNPerfeito % i == 0) {
                soma += i;
            }
        }
        return soma == auxNPerfeito;
    }

    // Calcular NUMERO FATORIAL 
    public int fatorial() {
        int auxFatorial = (int) numero;
        int nfatorial = 1;

        for (int cont; auxFatorial > 1; auxFatorial--) {
            nfatorial = (nfatorial * auxFatorial);
        }
        return nfatorial;
    }

    // Quadrado Perfeito
    public boolean eQuadradoPerfeito() {
        int aux = (int) (Math.sqrt(numero));
        if (aux * aux == numero) {
            return true;
        } else {
            return false;
        }
    }
    
    // CAPICUA
    public boolean capicua() {
        int auxCapicua = (int) this.numero;
        int n_invertido = 0;
        int resultado = 0;
        int aux = 0;    // Primeiro voce instancia as variaveis, e depois atribui valor

        //Começa o laço de repetiçao
        aux = auxCapicua;
        do {
            resultado = aux % 10;
            aux = aux / 10;
            n_invertido = n_invertido * 10 + resultado;
        } while (aux != 0);
        if (auxCapicua == n_invertido) {
            return true;
        } else {
            return false;
        }
    }

    // NUMERO PRIMO
    public boolean primos() {
        int auxPrimos = (int) this.numero;
        int numDivisores = 0;

        for (int i = 1; i <= auxPrimos; i++) {
            if (auxPrimos % i == 0) {
                numDivisores++;
            }
        }
        if (numDivisores == 2) {
            return true;
        } else {
            return false;
        }
    }
    // BASE 10 PARA BASE 2
//    public String base2() {
//        int auxBase2 = (int) this.numero;
//
//        String bin = Integer.toString(auxBase2, 2);
//        return bin;
//    }
    // BASE 10 PARA BASE 2
    public String base2() {
        int auxBase2 = (int) this.numero;

        String bin = Integer.toString(auxBase2, 2);
        return bin;
    }

//    // BASE 10 PARA BASE 2 - ROGERIO
//    public String base2() {
//        int auxBase2 = (int) this.numero;
//
//        String bin = Integer.toBinaryString(auxBase2);
//        return bin;
//    }
    // BASE10 PARA BASE 8
    public String base8() {
        int auxBase8 = (int) this.numero;

        String octal = Integer.toString(auxBase8, 8);
        return octal;
    }
    // BASE 10 PARA BASE 16

    public String base16() {
        int num = (int) this.numero;
        String hexConverte = "";

        while (num != 0) {
            if (num % 16 < 10) {
                hexConverte = Integer.toString(num % 16) + hexConverte;
            } else {
                hexConverte = (char) ((num % 16) + 55) + hexConverte;
            }
            num = num / 16;
        }
        return hexConverte;
    }
    // base com Swicth Case
    public String MudarBase(int base) {
        int num = (int) this.numero;
        switch (base) {
            case 2:
                return Integer.toBinaryString(num);
            case 8:
                return Integer.toOctalString(num);
            case 16:
                return Integer.toHexString(num);
        }
        return null;
    }
    // MDC 
    public NNatural mdc(NNatural objeto) throws Exception {
        long aux1 = this.numero;
        long aux2 = objeto.numero;

        long resto = 0;
        long resultadoMdc = 1;

        while (aux2 != 0) {
            resto = aux1 % aux2;
            aux1 = aux2;
            aux2 = resto;
            resultadoMdc = aux1;
        }
        /**
         * usar assim NNatural objetoMdc = new NNatural(resultadoMdc); return
         * objetoMdc; ou
         */
        return new NNatural(resultadoMdc);
    }

    // MINIMO MULTIPLO COMUM
    public NNatural mmc(NNatural objetoMMC) throws Exception {
        long aux1 = this.numero;
        long aux2 = objetoMMC.numero;
        long resto = 0;
        long resultado = 0;

        while (aux2 != 0) {
            resto = aux1 % aux2;
            aux1 = aux2;
            aux2 = resto;
        }
        resultado = (this.numero * objetoMMC.numero) / aux1;
        return new NNatural(resultado);
    }

    // numero1 * numero2 / mdc;
    // PRIMOS ENTRE SIM
    //mdc == 1 ; sao primos entre si
//    public boolean siPrimos(){
//        return mdc == 1;
//    }
    public boolean saoPrimos(NNatural objetoPrimo) throws Exception {
        long aux1 = this.numero;
        long aux2 = objetoPrimo.numero;
        long mdc = mdc(objetoPrimo).numero;
        long resto = 1; //Número maior dividido pelo menor
        long divisor = 0;
        long dividendo = 0;

        if (aux1 > aux2) {
            dividendo = aux1;
            divisor = aux2;
        } else {
            dividendo = aux2;
            divisor = aux1;
        }

        do {
            resto = dividendo % divisor;

            if (resto != 0) {
                dividendo = divisor;
                divisor = resto;

            }
        } while (resto != 0);
        mdc = divisor;
        if (mdc == 1) {
            return true;
        } else {
            return false;
        }
    }
    // ativiade realizada com sucesso;.

}
