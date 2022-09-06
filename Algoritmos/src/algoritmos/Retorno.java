package algoritmos;

public class Retorno {

    public enum Resultado {
        OK, ERROR, NO_IMPLEMENTADA
    }

    int valorEntero = 0;
    String valorString = "";
    boolean valorBooleano = false;

    public int getValorEntero() {
        return valorEntero;
    }

    public void setValorEntero(int valorEntero) {
        this.valorEntero = valorEntero;
    }

    public String getValorString() {
        return valorString;
    }

    public void setValorString(String valorString) {
        this.valorString = valorString;
    }

    public boolean isValorBooleano() {
        return valorBooleano;
    }

    public void setValorBooleano(boolean valorBooleano) {
        this.valorBooleano = valorBooleano;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    Resultado resultado;

    //Constructor
    public Retorno(Resultado resultado) {
        this.resultado = resultado;
    }
}