
package modulo2;

import java.util.Scanner;

/*Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el precio final */

public class Ejercicio4 {
    
    
        public static void main(String[] args) {
        
        char categoria;
        double precio, precioFinal;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio: ");
        precio = Double.parseDouble (sc.nextLine());
        System.out.println("Ingrese la categoria (A, B, C): ");
        categoria = sc.next().toUpperCase().charAt(0); 
        
        // Con el next() guardo el char; con el .toUpperCase() lo paso a mayuscula
        // y con .charAt(0) elijo el primer caracter
        
        switch (categoria){
            case 'A':
                precioFinal = (precio * 0.90);
                System.out.println("El precio original era "+ precio);
                System.out.println("Al ser categoria A, con el descuento queda en: "+ precioFinal);
                break;
            case 'B':
                precioFinal = (precio * 0.85);
                System.out.println("El precio original era "+ precio);
                System.out.println("Al ser categoria B, con el descuento queda en: "+ precioFinal);
                break;
            case 'C':
                precioFinal = (precio * 0.80);
                System.out.println("El precio original era "+ precio);
                System.out.println("Al ser categoria C, con el descuento queda en: "+ precioFinal);
                break;
            default:
                System.out.println("Esta categoria no es valida");
        }

    }
    
}
