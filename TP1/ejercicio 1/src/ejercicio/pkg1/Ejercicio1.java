package ejercicio.pkg1;
import java.util.Scanner;
public class Ejercicio1 {


    public static void main(String[] args) {
      int n1, n2, n3, pr , sum , may, min , res , prod;
       Scanner sc = new Scanner(System.in);
       
       // LEE LAS TRES VARIABLES
       
        System.out.print("Introduzca primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca tercer número: ");
        n3 = sc.nextInt();
        
        // SE FIJA SI HAY NUMEROS IGUALES
        
        if (n1==n2 && n2==n3){
        System.out.print("Todos los numeros son iguales \n");
        
        }else if (n1==n2 && n2!=n3){
        System.out.print("Hay dos numeros iguales \n");
        
        }else if (n1!=n2 && n2==n3){
        System.out.print("Hay dos numeros iguales \n");
        
        }else if (n1!=n2 && n1==n3){
        System.out.print("Hay dos numeros iguales \n");
        
        }else if (n1!=n2 && n2!=n3 && n1!=n3){
        System.out.print("Todos los nuemros son diferentes \n");
        
        }
        
        // EL PROMEDIO DE LOS TRES
        
        sum = n1 + n2 + n3 ;
        pr = sum / 3 ;
        System.out.print("El promedio de los tres numeros es: " + pr);
        System.out.print ("\n");
        
        // LA SUMA DE LOS TRES
        
        System.out.print ("la suma de los tres es: " +sum );
        System.out.print ("\n");
        
        // AVERIGUA CUAL ES EL NUMERO MAS GRANDE Y EL MENOR
        
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: " + n1);
                may = n1;
                if (n2>n3){
                min = n3;
                res = n2;
                }else{
                min = n2;
                res = n3;
                }
            } else {
                System.out.println("El mayor es: " + n3);  
                may = n3;
                 if (n2>n1){
                min = n1;
                res = n2;
                }else{
                min = n2;
                res = n1;
                }
            }
        } else if (n2 > n3) {
            System.out.println("El mayor es: " + n2);
            may = n2;
             if (n1>n3){
                min = n3;
                res = n1;
                }else{
                min = n1;
                res = n3;
                }
        } else {
            System.out.println("El mayor es: " + n3);
            may = n3;
             if (n2>n1){
                min = n1;
                res = n2;
                }else{
                min = n2;
                res = n1;
                }
        }
        
        System.out.println("El menor es: " + min);
        
        // PRODUCTO DEL MAYOR Y EL MENOR 
        
        prod = may * min;
        System.out.println("El producto del mayor y el menor es: : " + prod);
        
        //EL RESTANTE SE DIVIDE POR TRES?
        
        if (res%3==0){
        System.out.println("El numero restante es divisible por 3");
        }else{
        System.out.println("El resto es no es divisible por 3 ");
        }
        
    }
    
}