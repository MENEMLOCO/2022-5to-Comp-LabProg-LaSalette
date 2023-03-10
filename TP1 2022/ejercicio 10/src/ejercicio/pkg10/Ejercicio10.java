package ejercicio.pkg10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        double tarifa2, sueldo = 0, horas, tarifa, v;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la tarifa por hora: ");
        tarifa = sc.nextDouble();
        tarifa2 = tarifa * 1.5;
        for (v = 1; v <= 5; v++) {
            System.out.println("el empleado " + v + " trabajo en horas: ");
            horas = sc.nextDouble();
            if (horas > 40) {
                sueldo = tarifa * 40;
                horas = horas - 40;
                sueldo = sueldo + horas * tarifa2;
            } else if (horas < 40) {
                sueldo = tarifa * horas;
            }
            System.out.println("el empleado "+v+" tiene un sueldo de: "+sueldo);
        }
        
    }

}