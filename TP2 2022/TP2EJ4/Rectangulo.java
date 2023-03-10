package ejercicio4tp2;

public class Rectangulo {
    double base, altura;
    
    public Rectangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
       if (base>0.0 && base<20.0) this.base = base;
       else System.out.println("ERROR");
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (base>0.0 && base<20.0) this.altura = altura;
       else System.out.println("ERROR");
    }
    
}
