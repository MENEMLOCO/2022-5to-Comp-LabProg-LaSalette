package prueba.herencia;
public class Consultor extends Persona{
    
    public Consultor(String nombre, String apellido, String domicilio, int telefono, int dni) {
        super(nombre, apellido, domicilio, telefono, dni);
    }
    
    private int horasT;
    private int tarifaH;

    public Consultor(int horasT, int tarifaH, String nombre, String apellido, String domicilio, int telefono, int dni) {
        super(nombre, apellido, domicilio, telefono, dni);
        this.horasT = horasT;
        this.tarifaH = tarifaH;
    }

    public int getHorasT() {
        return horasT;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public int getTarifaH() {
        return tarifaH;
    }

    public void setTarifaH(int tarifaH) {
        this.tarifaH = tarifaH;
    }
    
    public double CalcularSueld(){
    return horasT * tarifaH;
    }
}
