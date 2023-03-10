package prueba;

public class consultor {
     private String nombre;
     private String apellido;
     private String domicilio;
     private int domicilionum;
     private int telefono;
     private int dni;
     private int horas;
     private int tarifa;

    public consultor(String nombre, String apellido, String domicilio, int domicilionum, int telefono, int dni, int horas, int tarifa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.domicilionum = domicilionum;
        this.telefono = telefono;
        this.dni = dni;
        this.horas = horas;
        this.tarifa = tarifa;
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

    public int getHoras() {
        return horas;
    }

    public int getTarifa() {
        return tarifa;
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

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    
}
