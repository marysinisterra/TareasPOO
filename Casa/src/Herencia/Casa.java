
package Herencia;

public class Casa {
    
   // protected double area// se usa para poder llamarlo desde otra clase 
    private  double area;
    private double precio;
    
    
    public Casa (double area, double precio){
    this.area = area;
    this.precio = precio;
    }
    
     public double getArea() {
        return area;
    }
    
     public void setArea(double area) {
        this.area = area;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   

  
    
    
}
