package prueba.herencia;
public class Operario extends Persona{
    
    public Operario(String nombre, String apellido, String domicilio, int telefono, int dni) {
        super(nombre, apellido, domicilio, telefono, dni);
    }
    private int horasTra;
    private String nombreC;
    private double tarifaHo = 50;

    public Operario(int horasTra, String nombreC, String nombre, String apellido, String domicilio, int telefono, int dni) {
        super(nombre, apellido, domicilio, telefono, dni);
        this.horasTra = horasTra;
        this.nombreC = nombreC;
    }

    
    public int getHorasTra() {
        return horasTra;
    }

    public void setHorasTra(int horasTra) {
        this.horasTra = horasTra;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }
    
    public double CalcularSueldo(){
    return horasTra * tarifaHo;
    }
    
}
