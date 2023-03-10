package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int n,v;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero que quiere ver los divisores:");
        n = sc.nextInt();
        System.out.println("divisores de "+n+ ": "+n);
        for (v=n/2;v>0;v--){
            if(n%v==0){
                System.out.println(v);
            }
        }
    }
    
}
