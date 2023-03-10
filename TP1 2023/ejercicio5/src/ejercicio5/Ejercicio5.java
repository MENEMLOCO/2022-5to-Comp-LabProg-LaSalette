package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,v,m;
        System.out.println("ingrese un numero del 1 al 10 que quieras ver la tabla demultiplicar:");
        n= sc.nextInt();
        
        for (v=1;v<11;v++){
            m= n*v;
            System.out.println(n+" * "+v+" = "+m);
        }
        
    }
    
}
