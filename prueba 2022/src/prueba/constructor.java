package prueba;

public class constructor {
     private String nombre;
     private String apellido;
     private String domicilio;
     private int domicilionum;
     private int telefono;
     private int dni;
     private double sueldo;
     private double impuesto;

    public constructor(String nombre, String apellido, String domicilio, int domicilionum, int telefono, int dni, double sueldo, double impuesto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.domicilionum = domicilionum;
        this.telefono = telefono;
        this.dni = dni;
        this.sueldo = sueldo;
        this.impuesto = impuesto;
        
    }
    
    public double imp (){
        double sueldo2;
        sueldo2 = sueldo - impuesto;
        return sueldo2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getDomicilionum() {
        return domicilionum;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getDni() {
        return dni;
    }
    
    public double getSueldo (){
        return sueldo;
    }
   
    public double getImpuesto (){
        return impuesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setDomicilionum(int domicilionum) {
        this.domicilionum = domicilionum;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public void setSueldo (double sueldo){
        this.sueldo = sueldo;
    }
    
    public void setImpuesto (double impuesto){
        this.impuesto = impuesto;
    }
}
