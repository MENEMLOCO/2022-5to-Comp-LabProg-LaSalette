package prueba.herencia;
public class Constructor extends Persona{
    
    public Constructor(String nombre, String apellido, String domicilio, int telefono, int dni) {
        super(nombre, apellido, domicilio, telefono, dni);
    }
    
    private double sueldo;
    private double impuesto;

    public Constructor(double sueldo, double impuesto, String nombre, String apellido, String domicilio, int telefono, int dni) {
        super(nombre, apellido, domicilio, telefono, dni);
        this.sueldo = sueldo;
        this.impuesto = impuesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    
    
    
}
