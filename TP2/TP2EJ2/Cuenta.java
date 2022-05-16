package Ejercicio2TP2;

public class Cuenta {
    double tipoDeInteres, saldo;
    
    public Cuenta(double tipoDeInteres, double saldo) {
        this.tipoDeInteres = tipoDeInteres;
        this.saldo = saldo;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void abonarIntereses(double saldo, double tipoDeInteres, double mes) {
        double interes = tipoDeInteres * mes * saldo;
        setSaldo(getSaldo() + interes);
        
    }
}
