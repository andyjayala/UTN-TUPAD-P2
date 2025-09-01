
package modulo2;

import java.util.Scanner;

public class Ejercicio1 {
    
    /* 1. Verificación de Año Bisiesto.
    Escribe un programa en Java que solicite al usuario un año y determine 
    si es bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, 
    salvo que sea divisible por 400. */
    
    public static void main(String[] args) {
       
        int anio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el anio que quiere analizar: ");
        anio = Integer.parseInt(sc.nextLine());
        
        if((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)){
           System.out.println("Es bisiesto");
        } else { System.out.println("No es bisiesto");
                }
    
    } 
        
}
    
