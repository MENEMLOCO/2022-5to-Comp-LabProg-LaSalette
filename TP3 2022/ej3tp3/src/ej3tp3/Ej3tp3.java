package ej3tp3;
import java.util.ArrayList;
import java.util.Scanner;
public class Ej3tp3 {
    public static void main(String[] args) {
          int a,i;
        
      Scanner sc = new Scanner (System.in);
        System.out.println("1. Vehiculos");
        System.out.println("2. comprar");
        System.out.println("3. Salir");  
         
        a=sc.nextInt();
        
        Autos a1=new Autos("Ecosport TITANIUM 1.5L Dragon AT","Fort",43456900,"nuevo");
        Autos a2=new Autos("Sel","Fort",6434600,"nuevo");
        Autos a3=new Autos("Nashe ","nisan",14875000,"usado");
        Autos a4=new Autos("Titan ","coscu",12354000,"nuevo");
        Autos a5=new Autos("Mustang Mach 1","Fort",463734000,"usado");
               
                
                 ArrayList <Autos> lista=new ArrayList();
        
         lista.add (a1);        
         lista.add (a2);               
         lista.add (a3);              
         lista.add (a4);               
         lista.add (a5);                
                
         switch (a) {
         
             case 1:
                 
                 for(i=0;i<5;i++){
                System.out.println("\nNombre:");
                System.out.println(lista.get(i).nombre);
                System.out.println("\nMarca:"); 
                System.out.println(lista.get(i).marca);
                System.out.println("\nPrecio:"); 
                System.out.println(lista.get(i).precio);
                System.out.println("\nEstado:"); 
                System.out.println(lista.get(i).estado);
                     System.out.println("-------------------------------------------");
                
                }
                 
                 break;
                 
             case 2: 
                 
                 System.out.println("1. Ecosport TITANIUM 1.5L Dragon AT ");
                 System.out.println("2. Sel");
                 System.out.println("3. Nashe");
                 System.out.println("4. Titan");
                 System.out.println("5. Mustang Mach 1");
                 
                System.out.println("\nIngrese el nro que quiera eliminar");
                int o=sc.nextInt();
                lista.remove (o);
            break;
            
             case 3:
                 break;
                 
               
    
    }
    

}
}

