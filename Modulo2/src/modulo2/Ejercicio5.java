package modulo2;

import java.util.Scanner;

/* Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los números pares. 
El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el 
que se debe mostrar la suma total de los pares ingresados
 */

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        int num, numFinal;
        numFinal = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero entero a analizar. Si ingresa 0, se entrega el resultado: ");
        num = Integer.parseInt(sc.nextLine());
        
        
        while (num != 0) {
            if (num % 2 == 0){
                numFinal = numFinal + num;
            }  
            System.out.println("Ingrese el numero entero a analizar. Si ingresa 0, se entrega el resultado: ");
            num = Integer.parseInt(sc.nextLine());
        }
        System.out.println("El resultado es: " + numFinal);

    }
    
}
