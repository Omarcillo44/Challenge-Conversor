import java.util.Map;

public class Operacion {

    private String conversion;
    private double valorMonedaAConvertir, valorMonedaOrigen;

    public Operacion(String monedaOrigen, String monedaAConvertir, double monto){

        var nuevaSolicitud = new Solicitud();

        Map<String, Double> divisas = nuevaSolicitud.nuevoTipoCambio(monedaOrigen).conversion_rates();

        valorMonedaAConvertir = divisas.get(monedaAConvertir);
        valorMonedaOrigen = divisas.get(monedaOrigen);

        conversion = (monto) + " " + monedaOrigen + " equivalen a "
                + ((valorMonedaAConvertir * monto)) + " " + monedaAConvertir + "\n";

    }

    @Override
    public String toString() {
        return conversion;
    }
}
