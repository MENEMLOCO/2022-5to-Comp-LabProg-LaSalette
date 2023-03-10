
package tpconnota;

public interface Entrega {
    public void entregar();
    public void devolver();
    public boolean isEntregado();
    public Juegos compareToV(Juegos a, Juegos b);
    public Serie compareToS(Serie a, Serie b);
}
