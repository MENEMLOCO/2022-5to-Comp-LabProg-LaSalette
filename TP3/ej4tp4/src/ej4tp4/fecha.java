package ej4tp4;

public class fecha {

    private int dia;
    private int mes;
    private int anio;

    public fecha(int dia,int mes, int anio){
    if (dia <= 31) {
            this.dia = dia;
        } else {
            System.out.println("ERROR");
        }
        if (mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("ERROR");
        }
        this.anio = anio;   
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public static String mostrarFecha (int dia, int mes, int anio){
    return (dia+"/"+ mes +"/"+ anio);
    }

    public static String mostrarFecha (int dia, String mes,int anio){
    return (mes+dia+"/"+ anio);
    }
}
