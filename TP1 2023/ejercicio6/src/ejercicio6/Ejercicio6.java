package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int a,b,aux,v,mult=0;
        System.out.println("ingrese dos numeros enteros:");
        Scanner sc = new Scanner (System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        if (b<a){
            aux=a;
            a=b;
            b=aux;
        }
        for(v=a;v<b;v++){
            if(v%5==0){
             mult=mult+v;
            }
        }
        System.out.println("la respuesta es: "+mult);
    }
    
}
