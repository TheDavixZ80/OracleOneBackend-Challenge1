public class Conversor extends GUIConversor {
    // Creo que es innecesario declarar valores tipo cambio
    static Moneda pesoColombiano = new Moneda("COP", 1);
    static Moneda dolar = new Moneda("USD",0.000247);
    static Moneda euro = new Moneda("EUR", 0.000221);
    static Moneda libra = new Moneda("GBP", 0.000192);
    static Moneda yenJapones = new Moneda("JPY", 0.035565);
    static Moneda wonSurcoreano = new Moneda("KRW", 0.035565);

    static String monedaDestino = "";

    // En este metodo se actualizan los tipos de cambio segun input
    private static void actualizarTasaCambioOrigen(String origen) {
        // en caso de nunca darle uso. BORRAR
        String monedaOrigen = "";

        switch (origen) {
            case "Pesos Colombianos":
                monedaOrigen = "Pesos Colombianos";
                Moneda.dolar.tipoDeCambio = 0.000247;
                Moneda.euro.tipoDeCambio = 0.000221;
                Moneda.libra.tipoDeCambio = 0.000192;
                Moneda.yenJapones.tipoDeCambio = 0.035565;
                Moneda.wonSurcoreano.tipoDeCambio = 0.320513;
                break;
            case "Dolares":
                monedaOrigen = "Dolares";
                Moneda.pesoColombiano.tipoDeCambio = 4105.84;
                Moneda.euro.tipoDeCambio = 0.917697;
                Moneda.libra.tipoDeCambio = 0.794868;
                Moneda.yenJapones.tipoDeCambio = 146.552;
                Moneda.wonSurcoreano.tipoDeCambio = 1323.79;
                break;
            case "Euros":
                monedaOrigen = "Euros";
                Moneda.pesoColombiano.tipoDeCambio = 4474.53;
                Moneda.dolar.tipoDeCambio = 1.08971;
                Moneda.libra.tipoDeCambio = 0.85831;
                Moneda.yenJapones.tipoDeCambio = 158.234;
                Moneda.wonSurcoreano.tipoDeCambio = 1430.70;
                break;
            case "Libras":
                monedaOrigen = "Libras";
                Moneda.pesoColombiano.tipoDeCambio = 5184.02;
                Moneda.dolar.tipoDeCambio = 1.25807;
                Moneda.euro.tipoDeCambio = 1.16507;
                Moneda.yenJapones.tipoDeCambio = 184.341;
                Moneda.wonSurcoreano.tipoDeCambio = 1668.09;
                break;
            case "Yen Japones":
                monedaOrigen = "Yen japones";
                Moneda.pesoColombiano.tipoDeCambio = 28.1171;
                Moneda.dolar.tipoDeCambio = 0.00683;
                Moneda.euro.tipoDeCambio = 0.00633;
                Moneda.libra.tipoDeCambio = 0.005425;
                Moneda.wonSurcoreano.tipoDeCambio = 9.03615;
                break;
            case "Won Surcoreano":
                monedaOrigen = "Won Surcoreano";
                Moneda.pesoColombiano.tipoDeCambio = 28.1171;
                Moneda.dolar.tipoDeCambio = 0.00683;
                Moneda.euro.tipoDeCambio = 0.00633;
                Moneda.libra.tipoDeCambio = 0.005425;
                Moneda.yenJapones.tipoDeCambio = 0.110670;
                break;
        }
    }

    private static Double obtenerTasaCambioDestino(String origen, String destino) {

        double tipoDeCambio = 0;
        // OBTENER TASA DE CAMBIO
        switch (destino) {
            case "Pesos Colombianos" -> {
                monedaDestino = "Pesos Colombianos";
                tipoDeCambio = Moneda.pesoColombiano.tipoDeCambio;
            }
            case "Dolares" -> {
                monedaDestino = "Dolares";
                tipoDeCambio = Moneda.dolar.tipoDeCambio;
            }
            case "Euros" -> {
                monedaDestino = "Euros";
                tipoDeCambio = Moneda.euro.tipoDeCambio;
            }
            case "Libras" -> {
                monedaDestino = "Libras";
                tipoDeCambio = Moneda.libra.tipoDeCambio;
            }
            case "Yen Japones" -> {
                monedaDestino = "Yen japones";
                tipoDeCambio = Moneda.yenJapones.tipoDeCambio;
            }
            case "Won Surcoreano" -> {
                monedaDestino = "Won Surcoreano";
                tipoDeCambio = Moneda.wonSurcoreano.tipoDeCambio;
            }
        }
        return tipoDeCambio;
    }

    // ESTO SE EJECUTA TRAS PRESIONAR BOTON
    public static String convertirA(String monedaOrigenString, String monedaDestinoString,
            double cantidadMonedaOrigen) {


        // esto llama el metodo de arriba
        actualizarTasaCambioOrigen(monedaOrigenString);
        Double tasaMonedaDestino = obtenerTasaCambioDestino(monedaOrigenString,
                monedaDestinoString);
        double resultado = cantidadMonedaOrigen * tasaMonedaDestino;

        return String.format("%.2f",resultado);
    }

}
