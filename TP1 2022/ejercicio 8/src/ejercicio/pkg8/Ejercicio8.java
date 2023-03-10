package ejercicio.pkg8;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        int N,v,N1,mayor = 0,menor=999999;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros que se desea cargar:");
        N=sc.nextInt();
        for (v=0;v<=N;v++){
            System.out.println("ingrese un numero:");
            N1=sc.nextInt();
            if (mayor<N1){
            mayor = N1;
            }
            if(menor>N1){
            menor=N1;
            }
            
        }
        System.out.println("el mayor es: "+mayor);
        System.out.println("el menor es: "+menor);
    }
    
}
