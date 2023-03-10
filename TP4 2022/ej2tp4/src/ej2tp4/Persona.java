package ej2tp4;

public class Persona {
   
    String nombre="";
    int edad=0;
    char sexo='i';
    double peso=0.0;
    double altura=0.00;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
     this.nombre=nombre;
     this.edad=edad;
     this.sexo=sexo;
   
    }
    public Persona(String nombre, int edad, char sexo,double peso,double altura) {
     this.nombre=nombre;
     this.edad=edad;
     this.sexo=sexo;
     this.peso=peso;
     this.altura=altura;
     
    }
       
    public int calcular_IMC(){
   
        double imc=peso/(altura*altura);
        if(imc<18.5){
            System.out.println("Esta por debajo del peso ideal");
        return (-1);
        } else if(imc >25){
            System.out.println("Tiene sobrepeso");
        return (1);
        }else{
            System.out.println("Esta en su peso ideal");
        return 0;
        }
    }
   
    public boolean esMayorDeEdad(){
        
      if(edad<=18){
          System.out.println("Es mayor de edad");
      return(true);
      }else{
          System.out.println("Es menor de edad");
      return(false);
      }
    }
    
    public char Sexo(){
    
      
        
     if(sexo=='H'){
         System.out.println("Es hombre");
     return('H');
     }else{} if(sexo=='M'){
         System.out.println("Es mujer");
     return('M');
     }else{
                 System.out.println("Indeterminado");
     return('I');
     }   
    }
    
    public String toStrin(){
    return(nombre + "\n" + edad + "\n" + sexo + "\n" + peso + "\n" + altura);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}