package ejercicio.pkg10.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h, t;
        String n;
        System.out.println("Ingrese el nombre del empleado:");
        n = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese las horas que trabajo " + n + ":");
        h = sc.nextDouble();
        System.out.println("Ingrese la tarifa por hora de trabajo:");
        t = sc.nextDouble();

        empleados e1 = new empleados(n, h, t);

        System.out.println("Ingrese el nombre del empleado:");
        n = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese las horas que trabajo " + n + ":");
        h = sc.nextDouble();
        System.out.println("Ingrese la tarifa por hora de trabajo:");
        t = sc.nextDouble();
        empleados e2 = new empleados(n, h, t);

        System.out.println("Ingrese el nombre del empleado:");
        n = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese las horas que trabajo " + n + ":");
        h = sc.nextDouble();
        System.out.println("Ingrese la tarifa por hora de trabajo:");
        t = sc.nextDouble();
        empleados e3 = new empleados(n, h, t);

        System.out.println("Ingrese el nombre del empleado:");
        n = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese las horas que trabajo " + n + ":");
        h = sc.nextDouble();
        System.out.println("Ingrese la tarifa por hora de trabajo:");
        t = sc.nextDouble();
        empleados e4 = new empleados(n, h, t);

        System.out.println("Ingrese el nombre del empleado:");
        n = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese las horas que trabajo " + n + ":");
        h = sc.nextDouble();
        System.out.println("Ingrese la tarifa por hora de trabajo:");
        t = sc.nextDouble();
        empleados e5 = new empleados(n, h, t);

        ArrayList<empleados> lista = new ArrayList();

        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e4);
        lista.add(e5);

        int zz;

        System.out.println("*******************************************");
        System.out.println("*                                         *");
        System.out.println("*                SUELDOS:                 *");
        System.out.println("*                                         *");
        System.out.println("*              1.empleado 1.              *");
        System.out.println("*              2.empleado 2.              *");
        System.out.println("*              3.empleado 3.              *");
        System.out.println("*              4.empleado 4.              *");
        System.out.println("*              5.empleado 5.              *");
        System.out.println("*                0.salir.                 *");
        System.out.println("*                                         *");
        System.out.println("*******************************************");

        zz = sc.nextInt();

        switch (zz) {
            case 1:
                System.out.println("sueldo de " + lista.get(zz - 1).nombre + " es:" + lista.get(zz - 1).sueldoBruto());
                break;
            case 2:
                System.out.println("sueldo de " + lista.get(zz - 1).nombre + " es:" + lista.get(zz - 1).sueldoBruto());
                break;
            case 3:
                System.out.println("sueldo de " + lista.get(zz - 1).nombre + " es:" + lista.get(zz - 1).sueldoBruto());
                break;
            case 4:
                System.out.println("sueldo de " + lista.get(zz - 1).nombre + " es:" + lista.get(zz - 1).sueldoBruto());
                break;
            case 5:
                System.out.println("sueldo de " + lista.get(zz - 1).nombre + " es:" + lista.get(zz - 1).sueldoBruto());
                break;

        }
        while (zz != 0){
            System.out.println("*******************************************");
            System.out.println("*                                         *");
            System.out.println("*                SUELDOS:                 *");
            System.out.println("*                                         *");
            System.out.println("*              1.empleado 1.              *");
            System.out.println("*              2.empleado 2.              *");
            System.out.println("*              3.empleado 3.              *");
            System.out.println("*              4.empleado 4.              *");
            System.out.println("*              5.empleado 5.              *");
            System.out.println("*                0.salir.                 *");
            System.out.println("*                                         *");
            System.out.println("*******************************************");

            zz = sc.nextInt();

            switch (zz) {
                case 1:
                    System.out.println("sueldo de " + lista.get(zz - 1).nombre + " es:" + lista.get(zz - 1).sueldoBruto());
                    break;
                case 2:
                    System.out.println("sueldo de " + lista.get(zz - 1).nombre + " es:" + lista.get(zz - 1).sueldoBruto());
                    break;
                case 3:
                    System.out.println("sueldo de " + lista.get(zz - 1).nombre + " es:" + lista.get(zz - 1).sueldoBruto());
                    break;
                case 4:
                    System.out.println("sueldo de " + lista.get(zz - 1).nombre + " es:" + lista.get(zz - 1).sueldoBruto());
                    break;
                case 5:
                    System.out.println("sueldo de " + lista.get(zz - 1).nombre + " es:" + lista.get(zz - 1).sueldoBruto());
                    break;

            }
        }

    }

}
