package ejercicio.pkg2;

import java.util.Scanner;

public class ejercicio2 {

public static void main(String[] args) {
       
    int a;
   

      Scanner scanf = new Scanner (System.in);
  System.out.println("Ingrese un anio: ");
  a=scanf.nextInt();
           
    if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
System.out.println("El año es bisiesto");
else
System.out.println("El año no es bisiesto");
     }
   
}

