package ejercicio.pkg6;
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        int n1, n2, aux,r=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        if (n1>n2){
        aux = n1;
        n1=n2;
        n2=aux;
        }
        for(aux=n1;aux<=n2;aux++){
        if (aux%5==0){
        r=r+aux;
        }
        }
        System.out.println("la suma de todos los multiplos de 5 es:"+r);
    }

}
