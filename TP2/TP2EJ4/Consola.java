package ejercicio4tp2;

import java.util.Scanner;

public class Consola {
    static Rectangulo r1 = new Rectangulo(1, 1);
    static Scanner scanf = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        while (1==1) {
            int i;
            System.out.println("Ingrese la accion");
            System.out.println("1- base y altura \n 2- perimetro \n 3- area");
            i = scanf.nextInt();
            if (i==1) BaseAltura();
            if (1==2) Perimetro();
            if (i==3) Area();
        }
    }
    
    public static void BaseAltura() {
        System.out.println("Ingrese la base y la altura");
        r1.setBase(scanf.nextDouble()); 
        r1.setAltura(scanf.nextDouble()); 
    }
    public static void Perimetro() {
        double perimetro = r1.getBase() * 2 + r1.getAltura() * 2;
        System.out.println("el perimetro es " + perimetro + "\n \n");
    }
    public static void Area() {
        double area = r1.getBase() * r1.getAltura();
        System.out.println("el area es " + area + "\n \n");
        
    }
}
