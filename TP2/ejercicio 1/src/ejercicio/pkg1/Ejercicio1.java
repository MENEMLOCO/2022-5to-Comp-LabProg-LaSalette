package ejercicio.pkg1;

public class Ejercicio1 {
    public static void main(String[] args) {
        empleado e1 = new empleado("Pedro","Perez",4800.00);
        empleado e2 = new empleado("Maria","Martinez",9200.00);
        
        System.out.println(e1.getNombre() + " " + e1.getApellido() +":");
        System.out.println("Sueldo anual: "+ e1.getSalario()*12);
        double salarioIn = e1.getSalario()*12 + e1.getSalario()*12 / 10;
        System.out.println("Salarios anuales incrementados: " + salarioIn);
        
        System.out.println(e2.getNombre() + " " + e2.getApellido() +":");
        System.out.println("Sueldo anual: "+ e2.getSalario()*12);    
        salarioIn = e2.getSalario()*12 + e2.getSalario()*12 / 10;
        System.out.print("Salarios anuales incrementados: "+salarioIn);
    }
    
}
