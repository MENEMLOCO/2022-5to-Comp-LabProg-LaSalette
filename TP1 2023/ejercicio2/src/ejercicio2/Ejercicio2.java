package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio;
        System.out.println("ingrese un año: ");
        anio = sc.nextInt();
        
        if(anio%4==0){
            System.out.println(anio +" es un año bisiesto.");
            
        }else if(anio%100==0 && anio%400!=0 || anio%4!=0){
            System.out.println(anio +" no es bisiesto.");
        }
    }
    
}
