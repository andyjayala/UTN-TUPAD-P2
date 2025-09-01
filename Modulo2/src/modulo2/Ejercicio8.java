
package modulo2;

import java.util.Scanner;

/* Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule 
el precio final de un producto en un e-commerce. La fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) 
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de impuesto y 
el porcentaje de descuento, llama al método y muestra el precio final. */

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        double pBase, desc, imp, precioFinal;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio base: ");
        pBase = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el descuento en porcentaje: ");
        desc = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el impuesto en porcentaje: ");
        imp = Double.parseDouble(sc.nextLine());
        
        precioFinal = calcularPrecioFinal(pBase, desc, imp);
        System.out.println("El precio final es: " + precioFinal);
                
    }

    static double calcularPrecioFinal(double pBase, double desc, double imp) {
        return (pBase + (pBase * (imp/100)) - (pBase * (desc/100)));
    }
    
}
