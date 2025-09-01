
package modulo2;

import java.util.Scanner;

/* Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el usuario
ingresa un número fuera de este rango, debe seguir pidiéndole la nota hasta que 
ingrese un valor válido. */

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        double nota;
        
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la nota (de 0 a 10): ");
            nota = Double.parseDouble(sc.nextLine());
        } while ((nota<0) || (nota>10));
     
    }
    
}
