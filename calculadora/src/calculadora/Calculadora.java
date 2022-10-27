package calculadora;

import static calculadora.Calculadora.calcu;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class Calculadora {

    static Stack<Character> pila = new Stack();
    static LinkedList<Character> lista = new LinkedList();
    static ArrayList<Character> calcu = new ArrayList();

    public static void main(String[] args) {
        System.out.println("escribe una cuenta: ");
        Scanner sc = new Scanner(System.in);
        char[] separador = sc.nextLine().toCharArray();
        System.out.println(separador);
        System.out.println( "lista" + lista + "pila" + pila);
        LinkedList<Character> cuenta = Reordenar(separador);
        System.out.println("cuenta" + cuenta);

    }

    public static LinkedList<Character> Reordenar(char[] input) {

        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case '0':
                    lista.add(input[i]);
                    break;
                case '1':
                    lista.add(input[i]);
                    break;
                case '2':
                    lista.add(input[i]);
                    break;
                case '3':
                    lista.add(input[i]);
                    break;
                case '4':
                    lista.add(input[i]);
                    break;
                case '5':
                    lista.add(input[i]);
                    break;
                case '6':
                    lista.add(input[i]);
                    break;
                case '7':
                    lista.add(input[i]);
                    break;
                case '8':
                    lista.add(input[i]);
                    break;
                case '9':
                    lista.add(input[i]);
                    break;
                case '(':
                    pila.push(input[i]);
                    break;
                case '*':
                    pila.push(input[i]);
                    break;
                case '/':
                    pila.push(input[i]);
                    break;
                case '+':
                    if (!pila.isEmpty()) {
                        if (pila.lastElement() == '*' || pila.lastElement() == '/') {
                            lista.add(pila.pop());
                            pila.push(input[i]);
                        } else {
                            pila.push(input[i]);
                        }
                    } else {
                        pila.push(input[i]);
                    }
                    break;
                case '-':
                    if (!pila.isEmpty()) {
                        if (pila.lastElement() == '*' || pila.lastElement() == '/') {
                            lista.add(pila.pop());
                            pila.push(input[i]);
                        } else {
                            pila.push(input[i]);
                        }
                    } else {
                        pila.push(input[i]);
                    }
                    break;
                case ')':
                    while (pila.lastElement() != '(') {
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

        int i = 0;
        int c = 0;
        
        for(c=0;c<calcu.size();c++){
            switch (calcu.get(c)) {
            case '+':
                int r = calcu.get(c - 1) + calcu.get(c - 2);
                calcu.remove(c - 2);
                calcu.remove(c - 1);
                calcu.set(c, Character.forDigit(r, 10));
                break;
            case '-':
                r = 0;
                r = calcu.get(c - 2) - calcu.get(c - 1);
                calcu.remove(c - 2);
                calcu.remove(c - 1);
                calcu.set(c, Character.forDigit(r, 10));
                break;
            case '/':
                r = 0;
                r = calcu.get(c - 2) / calcu.get(c - 1);
                calcu.remove(c - 2);
                calcu.remove(c - 1);
                calcu.set(c, Character.forDigit(r, 10));
                break;
            case '*':
                r = 0;
                r = calcu.get(c - 2) * calcu.get(c - 1);
                calcu.remove(c - 2);
                calcu.remove(c - 1);
                calcu.set(c, Character.forDigit(r, 10));
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
