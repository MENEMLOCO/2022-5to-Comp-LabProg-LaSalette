package Ejercicio2TP2;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        int i;
        double a;
        Scanner scanf = new Scanner (System.in);
        Cuenta cuenta1 = new Cuenta(0.10, 100.00);
        
        for (i=0; i<100; i++) {
            int input;
            int subInput;
            System.out.println("Inicio /n ");
            System.out.println("Elija la operacion");
            System.out.println("1- Consultar y modificar saldo");
            System.out.println("2- Consutlar y modificar intereses");
            System.out.println("3- cerrar programa");
            
            input = scanf.nextInt();
            
            switch(input) {
                case 1 : 
                    System.out.println("El saldo es " + cuenta1.getSaldo());
                    System.out.println("desea agregar (1), sustraer (2) o retroceder (3)?");
                    subInput = scanf.nextInt();
                    switch(subInput) {
                        case 1:
                            System.out.println("Ingrese la cantidad a agregar");
                            cuenta1.setSaldo(scanf.nextDouble() + cuenta1.getSaldo());
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad a sustraer");
                            a = scanf.nextDouble();
                            if (a < cuenta1.getSaldo()) cuenta1.setSaldo(cuenta1.getSaldo() - a); 
                            else System.out.println("El monto a retirar es mayor que la cantidad del la cuenta");
                            break;
                        default: System.out.println("regresando");
                    }
                
                case 2:
                    System.out.println("modificar(1) o reclamar(2) intereses;");
                    subInput = scanf.nextInt();
                    switch (subInput) {
                        case 1:
                            System.out.print("Ingrese la nueva tasa de interes mensual expresada como numero decimal");
                            cuenta1.setTipoDeInteres(scanf.nextDouble());
                            break;
                        case 2:
                            System.out.print("Ingrese la cantidad de meses a abonar");
                            cuenta1.abonarIntereses(cuenta1.getSaldo(), cuenta1.getTipoDeInteres(), scanf.nextDouble());
                            System.out.print("nuevo saldo : " + cuenta1.getSaldo());
                            break;
                        default: System.out.println("regresando");
                    }
                default: System.out.println("regresando");
            }
                    
                   
            
        }
        
        
        
    }
}
