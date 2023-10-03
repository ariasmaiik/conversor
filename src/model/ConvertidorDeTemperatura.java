package model;

/**
 *
 * @author Mike
 */
public class ConvertidorDeTemperatura {

    private double valorConvertido;

    /**
     *
     * @param valor
     * @return
     */
    public double convertirCelsiusParaFahrenheit(double valor){
        valorConvertido = valor * 1.8 + 32;
        return valorConvertido;
    }

    /**
     *
     * @param valor
     * @return
     */
    public double convertirFahrenheitParaCelsius(double valor){
        valorConvertido = (valor - 32) /1.8;
        return valorConvertido;
    }

    /**
     *
     * @param valor
     * @return
     */
    public double convertirCelsiusParaKelvin(double valor){
        valorConvertido = valor + 273;
        return valorConvertido;
    }

    /**
     *
     * @param valor
     * @return
     */
    public double convertirKelvinParaCelsius(double valor){
        valorConvertido = valor - 273;
        return valorConvertido;
    }

    /**
     *
     * @param valor
     * @return
     */
    public double convertirKelvinParaFahrenheit(double valor){
        valorConvertido = convertirKelvinParaCelsius(valor);
        valorConvertido = convertirCelsiusParaFahrenheit(valorConvertido);
        return valorConvertido;
    }

    /**
     *
     * @param valor
     * @return
     */
    public double convertirFahrenheitParaKelvin(double valor){
        valorConvertido = convertirFahrenheitParaCelsius(valor);
        valorConvertido = convertirCelsiusParaKelvin(valorConvertido);
        return valorConvertido;
    }
}
