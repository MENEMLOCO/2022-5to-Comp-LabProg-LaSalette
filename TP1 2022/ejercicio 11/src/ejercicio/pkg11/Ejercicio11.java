package ejercicio.pkg11;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int b,bi=0;
        System.out.println("Ingrese un numero binario:");
        b = sc.nextInt();
        
        ArrayList <Integer> binario = new ArrayList();
        
        while (b>=1){
            if (b%10==0){
               binario.add(0);
               b = b / 10;
            }else if (b%10==1){
                binario.add(1);
                b = b / 10;
            }else{
                System.out.println("XXX ERROR XXX");
                break;
            }
            
        }
        
        /* for(int i=0; i<binario.size();i++){
            System.out.println(binario.get(i));
        } */
        
        for (int i=0;i<binario.size();i++){
        int m =1;
            bi=bi + binario.get(i)*m;
            m=m*2;
        }
        System.out.println("el numero es:"+bi);
    }
    
}
