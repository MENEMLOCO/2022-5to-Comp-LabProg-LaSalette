package ejercicio1tp2;
public class Ejercicio1TP2 {

    public static void main(String[] args) {
        
        
        Empleado e1 = new Empleado("Pepito","Perez",3800.00);
        Empleado e2 = new Empleado("Juan","Martinez",2700.00);
        
        System.out.println(e1.getNombre() + " " + e2.getNombre());
        System.out.println(e1.getApellido() + " " + e2.getApellido());
        System.out.println(e1.getSalario() + " " + e2.getSalario());    
        
        System.out.println("Salarios anuales: " + e1.getSalario()*12 + " " + e2.getSalario()*12);
        
        double salarioIn = e1.getSalario()*12 + e1.getSalario()*12 / 10;
        System.out.println("Salarios anuales incrementados: " + salarioIn + " ");
        salarioIn = e2.getSalario()*12 + e2.getSalario()*12 / 10;
        System.out.print(salarioIn);
    }
    
}
