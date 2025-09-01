
package modulo2;

import java.util.Scanner;

/* Escribe un programa en Java que pida al usuario tres números enteros y 
determine cuál es el mayor. */

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int numUno, numDos, numTres, numGrande;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numUno = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        numDos = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el tercer numero: ");
        numTres = Integer.parseInt(sc.nextLine());
        
        if (numUno > numDos){ 
            numGrande = numUno;
        } else { numGrande = numDos;
                }
        if (numGrande > numTres) {
            System.out.println("El numero mas grande es "+ numGrande);
        } else { System.out.println("El numero mas grande es "+ numTres);
        }
    
    }
}
