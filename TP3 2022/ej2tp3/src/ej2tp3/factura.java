package ej2tp3;
public class factura {
     int numart;
    String descart;
    int cantart;
    double precart;
    
    public factura (int numart, String descart, int cantart, double precart){
        this.numart = numart;
        this.descart = descart;
        this.cantart = cantart;
        this.precart = precart;
        
    }

    public int getNumart() {
        return numart;
    }

    public void setNumart(int numart) {
        this.numart = numart;
    }

    public String getDescart() {
        return descart;
    }

    public void setDescart(String descart) {
        this.descart = descart;
    }

    public int getCantart() {
        return cantart;
    }

    public void setCantart(int cantart) {
        this.cantart = cantart;
    }

    public double getPrecart() {
        return precart;
    }

    public void setPrecart(double precart) {
        this.precart = precart;
    }
    
    public double obtenerMontoFactura (int cantart, double precart){
        
        return cantart*precart;
    }
}
