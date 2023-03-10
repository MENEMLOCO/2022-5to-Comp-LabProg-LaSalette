package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,v,a, b;
        System.out.println("ingrese el numero que quiera saber el factorial:");
        n = sc.nextInt();
        a=1;
        b=1;
        for(v=0 ; v<n ; v++){
            System.out.print(a + "- ");
            b=a*b;
            a=a+1;
            
        }
        System.out.println("");
        System.out.println("el factoriual es: "+b);
    }
    
}
