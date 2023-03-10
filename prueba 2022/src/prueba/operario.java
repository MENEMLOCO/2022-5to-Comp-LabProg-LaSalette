package prueba;

public class operario {
     private String nombre;
     private String apellido;
     private String domicilio;
     private int domicilionum;
     private int telefono;
     private int dni;
    

    public operario(String nombre, String apellido, String domicilio, int domicilionum, int telefono, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.domicilionum = domicilionum;
        this.telefono = telefono;
        this.dni = dni;
       
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
    
   
}
