package ejercicio.pkg7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        int a=0;
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int n = rm.nextInt(50);
        System.out.println("JUEGO: HAY QUE ADVINAR UN NUMERO RANDOM, \nLO QUE HAY QUE HACER ES INGRESAR UN NUMERO Y DIREMOS SI ES MAYOR O MENOR \nQUE EL NUMERO A ENCONTRAR");
        System.out.println("\nINGRESE UN NUMERO MENOR A 50:");
            a = sc.nextInt();
        while (n != a) {
            System.out.println("INCORRECTO\n");
            System.out.println("INGRESE UN NUMERO MENOR A 50:");
            a = sc.nextInt();
        }
        System.out.println("FELICITACIONES!!!!");
    }

}
