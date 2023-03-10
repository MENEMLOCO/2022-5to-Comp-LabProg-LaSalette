package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int a,b,c,p,s,m, may, men, med;
        Scanner scan =new Scanner (System.in);
        System.out.println("ingrese 3 numeros diferentes:");
        System.out.println("numero 1:");
        a = scan.nextInt();
        do{
            System.out.println("numero 2:");
            b = scan.nextInt();
        } while (a == b);
        do{
           System.out.println("numero 3:");
            c = scan.nextInt();
        }while(c==b || c==a);
       
        if (a>b && a>c){
            may = a;
            if (b>c){
                men = c;
                med = b;
            }else{
                men = b;
                med = c;
            }
        }else if(b>a && b>c){
            may = b;
            if (a>c){
                men = c;
                med = a;
            }else{
                men = a;
                med = c;
            }
        }else{
            may = c;
            if(b>a){
                men = a;
                med = b;
            }else{
                men = b;
                med = a;
            }
        }
       
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
       
        System.out.println("PROMEDIO");
        s= a+b+c;
        p=s/3;
       
        System.out.println(""+p);
       
        System.out.println("SUMA DE TODOS");
        System.out.println(""+s);
       
        System.out.println("PRODUCTO DEL MAY Y EL MEN");
        m=men*may;
        System.out.println(""+m);
       
        System.out.println("RESTANTE DIVIDIDO 3");
        if (med%3==0){
            System.out.println("si es divisible");
        }else{
            System.out.println("no es divisible");
        }
    }
   
}