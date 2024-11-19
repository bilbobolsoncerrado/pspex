package pspex;

import java.io.Serializable;

/**
 *
 * @author 2dam
 */
public class Temperatura implements Serializable {

    Float valor;
    String unidad;

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Temperatura(Float valor, String unidad) {
        this.valor = valor;
        this.unidad = unidad;
    }

    public Temperatura(Float valor) {
        this.valor = valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

}
