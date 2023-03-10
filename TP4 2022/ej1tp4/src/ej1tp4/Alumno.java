package ej1tp4;
public class Alumno {
    private String nombre;
    private String apellido;
    private int dni;
    private int notaa,notab,notac;
    private static int sumanotas;
    private static int cantidadal=0;

    public Alumno(String nombre, String apellido, int dni, int notaa, int notab, int notac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.notaa = notaa;
        this.notab = notab;
        this.notac = notac;
        sumanotas=sumanotas + notaa*notab+notac;
        cantidadal=cantidadal+1;
    }

    public String getNombre() {
        return nombre;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNotaa() {
        return notaa;
    }

    public void setNotaa(int notaa) {
        this.notaa = notaa;
    }

    public int getNotab() {
        return notab;
    }

    public void setNotab(int notab) {
        this.notab = notab;
    }

    public int getNotac() {
        return notac;
    }

    public void setNotac(int notac) {
        this.notac = notac;
    }

    public static int getSumanotas() {
        return sumanotas;
    }

    public static void setSumanotas(int sumanotas) {
        Alumno.sumanotas = sumanotas;
    }

    public static int getCantidadal() {
        return cantidadal;
    }

    public static void setCantidadal(int cantidadal) {
        Alumno.cantidadal = cantidadal;
    }

    public static double promedioc(){
    return (sumanotas/cantidadal);
    }
    public double promedioa(){
    return ((notaa+notab+notac)/3);
    }
    
}
