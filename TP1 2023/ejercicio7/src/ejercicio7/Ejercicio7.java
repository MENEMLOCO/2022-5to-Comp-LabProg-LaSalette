package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        int b= (int)(Math.random()*10+1);
        System.out.println("ingrese un numero del 1 al 10");
        a=sc.nextInt();
        while(a!=b){
            if(a>b){
                System.out.println("el numero es menor.");
            }else{
                System.out.println("el numero es mayor.");
            }
            a=sc.nextInt();
        }
        System.out.println("CORRECTO");
    }
    
}
