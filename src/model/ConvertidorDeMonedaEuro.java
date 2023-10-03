package model;

import enums.Moneda;

import java.math.BigDecimal;

/**
 *
 * @author Mike
 */
public class ConvertidorDeMonedaEuro extends ConvertidorDeMoneda {

    /**
     *
     * @param moneda
     * @param valorEnReais
     * @return
     */
    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.EURO;
        return super.convertirParaMoneda(moneda, valorEnReais);
    }

    /**
     *
     * @param moneda
     * @param valorEnMoneda
     * @return
     */
    @Override
    public BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.EURO;
        return super.convertirParaReal(moneda, valorEnMoneda);
    }
}
