package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("ingrese la cantidad de numeros que queres cargar");
        int a,v,aux,ma=0,me=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(v=0;v<a;v++){
            System.out.println("ingrese un numero: ");
            aux=sc.nextInt();
            if(aux>a){
                ma=ma+aux;
            }else{
                me=me+aux;
            }
            
        }
        System.out.println("mayor: "+ma);
        System.out.println("menor: "+me);
    }
    
}
