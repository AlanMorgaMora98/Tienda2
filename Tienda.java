
package tienda;

import java.util.Scanner;


public class Tienda{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int dato1;
        
        System.out.print("------------------------------------------\n");
        System.out.print("Bienvenido\n");
        System.out.print("Si quiere dar de alta un producto presione 1\n");
        System.out.print("Si quiere modificar un producto presione 2\n");
        System.out.print("Si quiere eliminar un producto presione 3\n");
        System.out.print("Si quiere consultar la lista de los productos presione 4\n");
        
        System.out.print("------------------------------------------");
        dato1 = entrada.nextInt();
    }
    
}

public class Tienda{
	private String clave;
	private String nombre;
	private String descripcion;
	private String unidad;
	private String cantidad;
	private String precioUnitario;

	public Tienda(String clave, String nombre, String descripcion, String unidad, String cantidad, String precioUnitario){
		this.clave = clave;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.unidad = unidad;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}
        
        
        public void MotrarDatos(){
            System.out.print("El producto tiene: "+clave", "+nombre+", "+descripcion+", "+unidad+", "+cantidad+" "+precioUnitario);
        }
        
        
        public void DarAlta(){
        
            Scanner entrada2 = new Scanner(System.in);
            
            System.out.print("Ingrese la clave del producto:\n");
            dato2 = entrada2.nextLine();
          
            System.out.print("Ingrese el nombre del producto:\n");
            dato3 = entrada2.nextLine();
          
            System.out.print("Ingrese la descripcion del producto:\n");
            dato4 = entrada2.nextLine();
      
            System.out.print("Ingrese el tipo de unidad:\n");
            dato5 = entrada2.nextLine();
            
            System.out.print("Ingrese el precio del producto:\n");
            dato6 = entrada2.nextLine();      
    }
        
}
