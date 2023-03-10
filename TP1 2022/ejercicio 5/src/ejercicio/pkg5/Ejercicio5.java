package ejercicio.pkg5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int n,i,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 10:");
        n = sc.nextInt();
        for (i=1;i<=10;i++){
            r=n*i;
            System.out.println(n+" x "+i+ " = " +r);
        }
    }

}
