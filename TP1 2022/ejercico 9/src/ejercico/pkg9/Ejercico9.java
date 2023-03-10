package ejercico.pkg9;

import java.util.Scanner;

public class Ejercico9 {

    public static void main(String[] args) {
        double D, R, A;
        double P = 3.14159265358979323846264338327950288419716939937510;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el radio de un circulo:");
        R = sc.nextInt();
        D = R * 2;
        System.out.println("el diametro de ese circulo es: " + D);
        A = P * R * R;
        System.out.println("el area de ese circulo es: "+A);
    }

}
