package prueba.herencia;
public class PruebaHerencia {

    public static void main(String[] args) {
        int v;
        
       Constructor e1 = new Constructor(1500.00, 5.00,"Pepe", "Zapata","Balvin", 47563823, 46581685);
       Constructor e2 = new Constructor(2000.00,7.00,"Juan","Garcia","Superi",1524856428,46913548);
       Consultor e3 = new Consultor(12, 60, "Martin", "Suarez", "Cerrito", 1548932568, 45267159);
       Consultor e4 = new Consultor (15, 40, "Maxi", "Coronel", "Correa", 1523642581, 41264831);
       Operario e5 = new Operario (20,e2.getNombre(),"Matias","Santos", "Warnes",1523491647, 43615482);
       Operario e6 = new Operario (16,e1.getNombre(),"Mauro","Aguego", "SanJuan",152648153,42548216);
       
       double montoMen =  e1.getSueldo() + e6.CalcularSueldo();
        System.out.println("el monto a pagar a "+e1.getNombre()+" es: "+montoMen);
        
       montoMen =  e2.getSueldo() + e5.CalcularSueldo();
        System.out.println("el monto a pagar a "+e2.getNombre()+" es: "+montoMen);
        System.out.println(" ");
        System.out.println(e1.getNombre() +" "+ e1.getApellido()+": "+e1.getSueldo());
        System.out.println(e2.getNombre() +" "+ e2.getApellido()+": "+e2.getSueldo());
        System.out.println(e3.getNombre() +" "+ e3.getApellido()+": "+e3.CalcularSueld());
        System.out.println(e4.getNombre() +" "+ e4.getApellido()+": "+e4.CalcularSueld());
        System.out.println(e5.getNombre() +" "+ e5.getApellido()+": "+e5.CalcularSueldo());
        System.out.println(e6.getNombre() +" "+ e6.getApellido()+": "+e6.CalcularSueldo());
        System.out.println(" ");
        if(e3.getHorasT()> e4.getHorasT()){
            System.out.println(e3.getNombre()+" "+e3.getApellido()+" labura mas horas");
        }else{
            System.out.println(e4.getNombre()+" "+e4.getApellido()+" labura mas horas");
        }
        
    }
    
}
