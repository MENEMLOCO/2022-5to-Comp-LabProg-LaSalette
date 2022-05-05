package javaapplication1;

public class Empleado {
    
    private String nombre, apellido;
    private double mensual;

    public Empleado(String nombre, String apellido, double mensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mensual = mensual;
        
        if (mensual<0){
        this.mensual = 0;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public double Anual(){
    double anual;
    anual = mensual * 12.00;
        return anual;
    }
    
    public double DiezPorciento (){
    double porciento=0;
    porciento = Anual()*10 + porciento;
    return porciento;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getMensual() {
        return mensual;
    }

    public void setMensual(double mensual) {
        this.mensual = mensual;
    }
    
    
}
