package interfaces;

import enums.Moneda;

import java.math.BigDecimal;

/**
 *
 * @author Mike
 */
public interface MonedaConvertible {

    /**
     *
     * @param moneda
     * @param valorEmReais
     * @return
     */
    BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEmReais);

    /**
     *
     * @param moneda
     * @param valorNaMoeda
     * @return
     */
    BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorNaMoeda);

}
