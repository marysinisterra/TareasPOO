
package Herencia;

public class Departamento extends Casa {  // extende para saber de donde se esta heredando 
    //ATRIBUTOS
    private int num_Cuartos;
    
    //CONSTRUCTOR PARA DEPARTAMENTO
    public Departamento(double area, double precio, int num_Cuartos){
        super(area,precio);                //se usa super para no volver a usar el mismo constructor 
        this.num_Cuartos = num_Cuartos;
    }
    
    public void  mostrarDatos(){
    System.out.println("El area es: "+ getArea());
    System.out.println("El precio es: "+getPrecio());
    System.out.println("El numero de cuartos disponibles: "+num_Cuartos);
    }
    
}
