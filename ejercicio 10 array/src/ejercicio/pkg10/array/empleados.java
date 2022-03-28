package ejercicio.pkg10.array;

public class empleados {
String nombre;
double horas;
double tarifa;
    public empleados(String nombre, double horas, double tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }
    public double sueldoBruto (){
    if (horas<40){
    return horas * tarifa;
    }else{
        horas = horas - 40;
        horas= horas * tarifa * 1.5;
        horas= horas + tarifa*40;
    return horas ;
    }
    }

}