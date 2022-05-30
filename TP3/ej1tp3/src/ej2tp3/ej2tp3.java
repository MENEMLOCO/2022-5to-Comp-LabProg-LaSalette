package ej2tp3;
import java.util.Scanner;

public class ej2tp3 {

    public static void main(String[] args) {
        
        int numart;
        String descart;
        int cantart;
        double precart;
        
        Scanner scanf = new Scanner (System.in);
        
        factura f1 = new factura (0,"0", 0, 0.00);
        factura f2 = new factura (0,"0", 0, 0.00);
        
        int op1 = 0;
        
        System.out.println("Que producto desea comprar?");
        System.out.println("1. tuerca 2. clavos 3. tornillos 4. arandela\n");
        op1 = scanf.nextInt();
        
        switch  (op1){
            
            case 1: 
                f1.setNumart(op1);
                f1.setDescart("Tuerca");
                System.out.println("Que cantidad desea comprar");
                cantart = scanf.nextInt();
                f1.setCantart(cantart);   
                f1.setPrecart(7.83);
                precart = f1.getPrecart();
                System.out.println("Ferreteria Don Juan\n articulo nª "+f1.getNumart()+"\n "+f1.getDescart()+" x"+f1.getCantart()+"\n c/u por "+f1.getPrecart()+"\n Precio total: "+f1.obtenerMontoFactura(cantart, precart));
                break;
            case 2:
                f1.setNumart(op1);
                f1.setDescart("Clavos");
                System.out.println("Que cantidad desea comprar");
                cantart = scanf.nextInt();
                f1.setCantart(cantart);   
                f1.setPrecart(0.59);
                precart = f1.getPrecart();
                System.out.println("Ferreteria Don Juan\n articulo nª "+f1.getNumart()+"\n "+f1.getDescart()+" x"+f1.getCantart()+"\n c/u por "+f1.getPrecart()+"\n Precio total: "+f1.obtenerMontoFactura(cantart, precart));
                break;
            case 3:
                f1.setNumart(op1);
                f1.setDescart("Tornillos");
                System.out.println("Que cantidad desea comprar");
                cantart = scanf.nextInt();
                f1.setCantart(cantart);   
                f1.setPrecart(0.59);
                precart = f1.getPrecart();
                System.out.println("Ferreteria Don Juan\n articulo nª "+f1.getNumart()+"\n "+f1.getDescart()+" x"+f1.getCantart()+"\n c/u por "+f1.getPrecart()+"\n Precio total: "+f1.obtenerMontoFactura(cantart, precart));
                break;
            
        }
        
    }
}