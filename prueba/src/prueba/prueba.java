package prueba;

import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String nombre;
        String apellido;
        String domicilio;
        int domicilionum;
        int telefono;
        int dni;
        double sueldo;
        double impuesto;
        int horas;
        int tarifa;

        System.out.println("Ingrese el nombre del primer constructor:");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del primer costructor:");
        apellido = sc.nextLine();
        System.out.println("Ingrese el domicilio del primer constructor:");
        domicilio = sc.nextLine();
        System.out.println("Ingrese el numero del domicilio del primer constructor:");
        domicilionum = sc.nextInt();
        System.out.println("Ingrese el telefono del primer constructor:");
        telefono = sc.nextInt();
        System.out.println("Ingrese el dni del primer constructor:");
        dni = sc.nextInt();
        System.out.println("Ingrese el sueldo del primer constructor:");
        sueldo = sc.nextDouble();
        System.out.println("Ingrese el impuesto del primer constructor:");
        impuesto = sc.nextDouble();

        constructor e1 = new constructor(nombre, apellido, domicilio, domicilionum, telefono, dni, sueldo, impuesto);
        
        
        System.out.println("Ingrese el nombre del primer consultor:");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del primer consultor:");
        apellido = sc.nextLine();
        System.out.println("Ingrese el domicilio del primer consultor:");
        domicilio = sc.nextLine();
        System.out.println("Ingrese el numero del domicilio del primer consultor:");
        domicilionum = sc.nextInt();
        System.out.println("Ingrese el telefono del primer consultor:");
        telefono = sc.nextInt();
        System.out.println("Ingrese el dni del primer consultor:");
        dni = sc.nextInt();
        System.out.println("Ingrese las horas trabajadas del primer consultor:");
        horas = sc.nextInt();
        System.out.println("Ingrese la tarifa del primer consultor:");
        tarifa = sc.nextInt();
        
        consultor e2 = new consultor(nombre, apellido, domicilio, domicilionum, telefono, dni,horas,tarifa);
                
        
        System.out.println("Ingrese el nombre del primer operador:");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del primer operador:");
        apellido = sc.nextLine();
        System.out.println("Ingrese el domicilio del primer operador:");
        domicilio = sc.nextLine();
        System.out.println("Ingrese el numero del domicilio del primer operador:");
        domicilionum = sc.nextInt();
        System.out.println("Ingrese el telefono del primer operador:");
        telefono = sc.nextInt();
        System.out.println("Ingrese el dni del primer operador:");
        dni = sc.nextInt();
        
        
        operario e3 = new operario(nombre, apellido, domicilio, domicilionum, telefono, dni);
        
       System.out.println("Ingrese el nombre del segundo constructor:");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del segundo costructor:");
        apellido = sc.nextLine();
        System.out.println("Ingrese el domicilio del segundo constructor:");
        domicilio = sc.nextLine();
        System.out.println("Ingrese el numero del domicilio del segundo constructor:");
        domicilionum = sc.nextInt();
        System.out.println("Ingrese el telefono del segundo constructor:");
        telefono = sc.nextInt();
        System.out.println("Ingrese el dni del segundo constructor:");
        dni = sc.nextInt();
        System.out.println("Ingrese el sueldo del segundo constructor:");
        sueldo = sc.nextDouble();
        System.out.println("Ingrese el impuesto del segundo constructor:");
        impuesto = sc.nextDouble();
        
        constructor e4 = new constructor(nombre, apellido, domicilio, domicilionum, telefono, dni, sueldo, impuesto);
        
        System.out.println("Ingrese el nombre del segundo consultor:");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del segundo consultor:");
        apellido = sc.nextLine();
        System.out.println("Ingrese el domicilio del segundo consultor:");
        domicilio = sc.nextLine();
        System.out.println("Ingrese el numero del domicilio del segundo consultor:");
        domicilionum = sc.nextInt();
        System.out.println("Ingrese el telefono del segundo consultor:");
        telefono = sc.nextInt();
        System.out.println("Ingrese el dni del segundo consultor:");
        dni = sc.nextInt();
        System.out.println("Ingrese las horas trabajadas del segundo consultor:");
        horas = sc.nextInt();
        System.out.println("Ingrese la tarifa del segundo consultor:");
        tarifa = sc.nextInt();
        
        consultor e5 = new consultor(nombre, apellido, domicilio, domicilionum, telefono, dni,horas,tarifa);
        
        System.out.println("Ingrese el nombre del segundo operador:");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del segundo operador:");
        apellido = sc.nextLine();
        System.out.println("Ingrese el domicilio del segundo operador:");
        domicilio = sc.nextLine();
        System.out.println("Ingrese el numero del domicilio del segundo operador:");
        domicilionum = sc.nextInt();
        System.out.println("Ingrese el telefono del segundo operador:");
        telefono = sc.nextInt();
        System.out.println("Ingrese el dni del segundo operador:");
        dni = sc.nextInt(); 
        
        operario e6 = new operario(nombre, apellido, domicilio, domicilionum, telefono, dni);
        
        System.out.println("nombre del operario y salario:");
        System.out.println("1."+e3.getNombre()+" "+e3.getSalario());
        System.out.println("2."+e6.getNombre()+ " "+e6.getSalario());
        
    }
}
