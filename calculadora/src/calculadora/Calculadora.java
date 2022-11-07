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
    static String separador;
    static LinkedList<String> cuenta = new LinkedList ();
    
   

    public static LinkedList<String> Reordenar(String input) {

        for (int i = 0; i < input.length(); i++) {
            //System.out.println("lista"+ lista);
            //System.out.println("pila"+ pila);
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
                        if (pila.lastElement().equalsIgnoreCase("*") || pila.lastElement().equalsIgnoreCase("/")){
                            //System.out.println("entre por aca");
                            lista.add(pila.pop());
                            pila.push(input.substring(i,i+1));
                        } else {
                            pila.push(input.substring(i,i+1));
                             System.out.println("entre mal");
                        }
                    } else {
                        pila.push(input.substring(i,i+1));
                    }
                    break;
                case "-":
                    if (!pila.isEmpty()) {
                        if (pila.lastElement().equalsIgnoreCase("*") || pila.lastElement().equalsIgnoreCase("/")){
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
        while(calcu.size()>1){
        calcular();
        }
        
        //System.out.println("despues de calcu"+calcu);

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
        //System.out.println("calc"+ calcu);
        for(c=0;c<calcu.size();c++){
            switch (calcu.get(c)) {
            case "+":
                r=0;
                r =  Integer.valueOf(calcu.get(c-2)) + Integer.valueOf(calcu.get(c-1));
                calcu.remove(c);
                calcu.remove(c - 1);
                calcu.set(c-2, String.valueOf(r));
                break;
            case "-":
                //System.out.println("menos");
                r = 0;
                r =  Integer.valueOf(calcu.get(c-2)) - Integer.valueOf(calcu.get(c-1));
                calcu.remove(c);
                calcu.remove(c - 1);
                calcu.set(c-2, String.valueOf(r));
                break;
            case "/":
                //System.out.println("division");
                r = 0;
                r = Integer.valueOf(calcu.get(c-2)) / Integer.valueOf(calcu.get(c-1));
                calcu.remove(c);
                calcu.remove(c - 1);
                calcu.set(c-2, String.valueOf(r));
                break;
            case "*":
                //System.out.println("mult");
                r = 0;
                r = Integer.valueOf(calcu.get(c-2)) * Integer.valueOf(calcu.get(c-1));
                //System.out.println("r: "+Integer.toString(r));
                calcu.remove(c);
                calcu.remove(c - 1);
                calcu.set(c-2 , String.valueOf(r));
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
