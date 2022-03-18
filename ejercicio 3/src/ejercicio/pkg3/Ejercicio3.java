package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {

   
    public static void main(String[] args) {
     int n,v,r=1;
     Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero para hacer el factorial:");
     n=sc.nextInt();
     for (v=1;v<=n;v++){
         r=v*r;
     }
        System.out.println("el factorial es:"+r);
     
    }
    
}