package model;

import enums.Moneda;

import java.math.BigDecimal;

/**
 *
 * @author Mike
 */
public class ConvertidorDeMonedaPesoArgentino extends ConvertidorDeMoneda {

    /**
     *
     * @param moneda
     * @param valorEnReais
     * @return
     */
    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.PESO_ARGENTINO;
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
        moneda = Moneda.PESO_ARGENTINO;
        return super.convertirParaReal(moneda, valorEnMoneda);
    }
}
