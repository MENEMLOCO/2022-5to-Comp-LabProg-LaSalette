package tpconnota;
   
public class Juegos implements Entrega{
    String titulos;
    int h;
    boolean entregado;
    String genero;
    String creador;

    public Juegos(String titulos, int h, boolean entregado, String genero, String creador) {
        this.titulos = titulos;
        this.h = h;
        this.entregado = entregado;
        this.genero = genero;
        this.creador = creador;
    }
    
    public Juegos (String titulos, int h) {
        this.titulos = titulos;
        this.h = h;
        this.entregado = false;
        this.genero = "null";
        this.creador = "null";
        
    }
    
    public Juegos (String titulos, int h, String genero, String creador) {
        this.titulos = titulos;
        this.h = h;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }
    public Juegos (){
        entregado=false;
    }
    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
    
    @Override
    public String toString() {
        return "Juego{" + "titulos=" + titulos + ", horas=" + h + ", entregado=" + entregado + ", genero=" + genero + ", creador=" + creador + '}';
    }
    
    @Override
    public void entregar() {
        this.entregado = false;
    }
    
    @Override
    public void devolver() {
        this.entregado = true;
    } 
    
    
    @Override
    public Juegos compareToV(Juegos J1, Juegos J2) {
        if (J1.getH() > J2.getH()) return J1;
        else if (J1.getH() < J2.getH())  return J2;
        else return J1;
}

    @Override
    public Serie compareToS(Serie a, Serie b) {
        throw new UnsupportedOperationException("no");
    }
}
