package model;

import enums.Moneda;

import java.math.BigDecimal;

/**
 *
 * @author Mike
 */
public class ConvertidorDeMonedaLibraEsterlina extends ConvertidorDeMoneda {

    /**
     *
     * @param moneda
     * @param valorEnReais
     * @return
     */
    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.LIBRA_ESTERLINA;
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
        moneda = Moneda.LIBRA_ESTERLINA;
        return super.convertirParaReal(moneda, valorEnMoneda);
    }
}
