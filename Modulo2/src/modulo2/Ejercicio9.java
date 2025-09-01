package modulo2;

import java.util.Scanner;

/* Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado 
en la zona de envío (Nacional o Internacional) y el peso del paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double costoEnvio): 
Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio del 
producto. Luego, muestra el total a pagar. */

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        double envio;
        double costoEnvio = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese si el pedido es \"nacional\" o \"internacional\" segun corresponda: ");
        String zonaIngresada = sc.nextLine().toLowerCase();
        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el peso del producto: ");
        double pesoIngresado = Double.parseDouble(sc.nextLine());
                
        
        System.out.println("El costo de envio es: "+ calcularCostoEnvio(pesoIngresado,zonaIngresada));
        System.out.println("El costo precio + envio: "+ calcularTotalCompra(precioProducto,calcularCostoEnvio(pesoIngresado,zonaIngresada)));               
    }

    static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio; 
        
        switch (zona){
            case "nacional": 
                costoEnvio = peso * 5;
                return (costoEnvio);
            case "internacional":
                costoEnvio = peso * 10;
                return(costoEnvio);
            default:
                System.out.println("La zona ingresada no es correcta");
                break;
        }
        return(0);
        }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        
        return(costoEnvio + precioProducto);
    }  
     
}
