package model;

/**
 *
 * @author Mike
 */
public class Validador {

    /**
     *
     * @param operacion
     * @return
     */
    public boolean verificar(String operacion){
;
        boolean esNumerico =  operacion.matches("[+-]?\\d*(\\.\\d+)?");

        return esNumerico;
    }

    /**
     *
     * @param operacion
     * @return
     */
    public double transformarEnDouble(String operacion){
        double valorNumerico = Double.parseDouble(operacion);
        return valorNumerico;
    }
}
