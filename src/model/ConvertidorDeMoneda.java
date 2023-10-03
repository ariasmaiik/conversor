package model;

import enums.Moneda;
import interfaces.MonedaConvertible;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Mike
 */
public class ConvertidorDeMoneda implements MonedaConvertible {

    /**
     *
     * @param moneda
     * @param valorEnReais
     * @return
     */
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        return valorEnReais.divide(moneda.getFACTOR_CONVERSION(), 2, RoundingMode.HALF_UP);
    }

    /**
     *
     * @param moneda
     * @param valorEnMoneda
     * @return
     */
    public BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorEnMoneda){
        return valorEnMoneda.multiply(moneda.getFACTOR_CONVERSION());
    };


}
