package tpconnota;

public class Serie implements Entrega{
    
    String titulo;
    int temp;
    boolean entregado;
    String genero;
    String creador;

    
    public Serie(String titulo, int temp, boolean entregado, String genero, String creador) {
        this.titulo = titulo;
        this.temp = temp;
        this.entregado = entregado;
        this.genero = genero;
        this.creador = creador;
    }
    
    public Serie(String titulo, int temp, String genero, String creador) {
        this.titulo = titulo;
        this.temp = temp;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.temp = 0;
        this. entregado = false;
        this.genero = "null";
    }

    public Serie() {
        this.temp = 0;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
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
        return "Serie{" + "titulo=" + titulo + ", temporadas=" + temp + ", entregado=" + entregado + ", genero=" + genero + ", creador=" + creador + '}';
    }
    
        public void entregar() {
        this.entregado = false;
    }
    public void devolver() {
        this.entregado = true;
    } 
    
    public boolean isEntregado() {
        return this.entregado;
    }
    
    public Serie compareToS(Serie s1, Serie s2) {
        if (s1.getTemp() > s2.getTemp()) return s1;
        else if (s1.getTemp() < s2.getTemp()) return s2;
        else return s1;
}

    public Juegos compareToV(Juegos a, Juegos b) {
        throw new UnsupportedOperationException("no"); 
    }
}
