package calculadora;

import static calculadora.Calculadora.calcu;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Calculadora {

    static Stack<String> pila = new Stack();
    static LinkedList<String> lista = new LinkedList();
    static ArrayList<String> calcu = new ArrayList();

    public static void main(String[] args) {
        System.out.println("escribe una cuenta: ");
        Scanner sc = new Scanner(System.in);
        String separador = sc.nextLine();
        System.out.println(separador);
        System.out.println( "lista" + lista + "pila" + pila);
        LinkedList<String> cuenta = Reordenar(separador);
        System.out.println("cuenta" + cuenta);

    }

    public static LinkedList<String> Reordenar(String input) {

        for (int i = 0; i < input.length(); i++) {
            switch (input.substring(i,i+1)) {
                case "0":
                    lista.add(input.substring(i,i+1));
                    break;
                case "1":
                    lista.add(input.substring(i,i+1));
                    break;
                case "2":
                    lista.add(input.substring(i,i+1));
                    break;
                case "3":
                    lista.add(input.substring(i,i+1));
                    break;
                case "4":
                    lista.add(input.substring(i,i+1));
                    break;
                case "5":
                    lista.add(input.substring(i,i+1));
                    break;
                case "6":
                    lista.add(input.substring(i,i+1));
                    break;
                case "7":
                    lista.add(input.substring(i,i+1));
                    break;
                case "8":
                    lista.add(input.substring(i,i+1));
                    break;
                case "9":
                    lista.add(input.substring(i,i+1));
                    break;
                case "(":
                    pila.push(input.substring(i,i+1));
                    break;
                case "*":
                    pila.push(input.substring(i,i+1));
                    break;
                case "/":
                    pila.push(input.substring(i,i+1));
                    break;
                case "+":
                    if (!pila.isEmpty()) {
                        if (pila.lastElement() == "*" || pila.lastElement() == "/") {
                            lista.add(pila.pop());
                            pila.push(input.substring(i,i+1));
                        } else {
                            pila.push(input.substring(i,i+1));
                        }
                    } else {
                        pila.push(input.substring(i,i+1));
                    }
                    break;
                case "-":
                    if (!pila.isEmpty()) {
                        if (pila.lastElement() == "*" || pila.lastElement() == "/"){
                            lista.add(pila.pop());
                            pila.push(input.substring(i,i+1));
                        } else {
                            pila.push(input.substring(i,i+1));
                        }
                    } else {
                        pila.push(input.substring(i,i+1));
                    }
                    break;
                case ")":
                    while (pila.lastElement() != "(") {
                        lista.add(pila.pop());
                    }
                    pila.pop();

            }

        }

        while (!pila.isEmpty()) {
            lista.add(pila.pop());
        }

        tranformar();
        calcular();
        System.out.println("despues de calcu"+calcu);

        return null;

    }

    public static void tranformar() {
        for (int i = 0; i < lista.size(); i++) {
            calcu.add(lista.get(i));

        }
    }

  

public static void calcular() {
        int r;
        int i = 0;
        int c = 0;
        System.out.println("calc"+ calcu);
        for(c=0;c<calcu.size();c++){
            //System.out.println("c "+c);
            switch (calcu.get(c)) {
            case "+":
                r =  Integer.valueOf(calcu.get(c-2)) + Integer.valueOf(calcu.get(c-1));
                calcu.remove(c - 2);
                calcu.remove(c - 1);
                calcu.set(c, String.valueOf(r));
                break;
            case "-":
                System.out.println("menos");
                r = 0;
                r =  Integer.valueOf(calcu.get(c-2)) - Integer.valueOf(calcu.get(c-1));
                calcu.remove(c - 2);
                calcu.remove(c - 1);
                calcu.set(c, String.valueOf(r));
                break;
            case "/":
                System.out.println("division");
                r = 0;
                r = Integer.valueOf(calcu.get(c-2)) / Integer.valueOf(calcu.get(c-1));
                calcu.remove(c - 2);
                calcu.remove(c - 1);
                calcu.set(c, String.valueOf(r));
                break;
            case "*":
                System.out.println("mult");
                r = 0;
                r = Integer.valueOf(calcu.get(c-2)) * Integer.valueOf(calcu.get(c-1));
                System.out.println("r: "+Integer.toString(r).charAt(1));
                calcu.remove(c - 2);
                calcu.remove(c - 1);
                calcu.set(c, String.valueOf(r));
                break;
        }
        }
        
        /*while (!Objects.equals(calcu.get(i), '+') && !Objects.equals(calcu.get(i), '-') && !Objects.equals(calcu.get(i), '*') && !Objects.equals(calcu.get(i), '/') && i < calcu.size()) {
            c = i;
            System.out.println(c);
            i++;
        }*/

        
    }
}
