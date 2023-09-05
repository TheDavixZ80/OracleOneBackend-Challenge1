public class Moneda extends Conversor {

    String nombre;
    double tipoDeCambio;
    int cantidad;

    public Moneda(String nombre, double tipoDeCambio){
        this.nombre = nombre;
        this.tipoDeCambio =  tipoDeCambio;
    }

    public Moneda(String nombre, double tipoDeCambio, int cantidad) {
        this.nombre = nombre;
        this.tipoDeCambio = tipoDeCambio;
        this.cantidad = cantidad;
    }

    public String getName() {
        return this.nombre;
    }

    public double getTipoDeCambio(){
        return this.tipoDeCambio;
    }

    public void setTipoDeCambio(double newTipoDeCambio){
        this.tipoDeCambio = newTipoDeCambio;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int newCantidad){
        this.cantidad = newCantidad;
    }

    public static String pruebita(){

        return "esto fue heredado jaja ";
    }
}
