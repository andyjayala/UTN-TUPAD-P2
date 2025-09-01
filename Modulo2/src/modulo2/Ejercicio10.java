
package modulo2;

import java.util.Scanner;

/* Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la 
cantidad recibida, y muestra el stock actualizado. */

public class Ejercicio10 {
    
    int stockActual = 0, cantidadVendida = 0, cantidadRecibida = 0;
    
      public static void main(String[] args) {
        
        int cantidadStock, cantidadVentas, cantidadRecep;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el stock previo: ");
        cantidadStock = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese la cantidad vendida: ");
        cantidadVentas = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el peso del producto: ");
        cantidadRecep = Integer.parseInt(sc.nextLine());
                
        
        System.out.println("El stock actualizado es: " + actualizarStock(cantidadStock, cantidadVentas, cantidadRecep));              
    }
      
    static double actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {

        int nuevoStock = 0;
        nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return(nuevoStock);

    }
    
    
    
}
