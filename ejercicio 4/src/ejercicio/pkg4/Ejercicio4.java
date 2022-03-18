package ejercicio.pkg4;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        
        int a,i;
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese un numero que quieras saber sus divisores:");
        a= sc.nextInt();
        System.out.println(a+ " es divisible por:");
        for (i=1;i<=a;i++){
        if (a%i==0){
            System.out.println(" "+i);
        }
        }
        } 
}