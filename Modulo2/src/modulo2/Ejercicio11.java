
package modulo2;

import java.util.Scanner;

/*
Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un 
método calcularDescuentoEspecial(double precio) que use la variable global para 
calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena el valor 
del descuento y muestra el precio final con descuento.
 */

public class Ejercicio11 {
    
    public static double VARIABLE_GLOBAL = 0.10;
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio original: ");
        double precio = Double.parseDouble(sc.nextLine());
        calcularDescuentoEspecial(precio);
    }
    
    public static void calcularDescuentoEspecial(double precio) {
        
        double descuentoEspecial = precio * VARIABLE_GLOBAL;
        double precioFinal = precio - descuentoEspecial;
        
        System.out.println("Precio original es " + precio);
        System.out.println("Porcentaje de descuento aplicado es " +(VARIABLE_GLOBAL * 100)+ "%, equivalente a $" + descuentoEspecial);
        System.out.println("Precio final: $" + precioFinal);
    }
}