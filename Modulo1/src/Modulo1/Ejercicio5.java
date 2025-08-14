
package Modulo1;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        int numUno, numDos, suma, resta, multi;
        double divi;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primero numero: ");
        numUno = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        numDos = Integer.parseInt(input.nextLine());
        suma = numUno + numDos;
        resta = numUno - numDos;
        multi = numUno * numDos;
        divi = (double) numUno / numDos;
        System.out.println("Suma: " + suma+"; Resta: "+ resta+ "; Multiplicacion: "+ multi+ "; Division: "+ divi);
    }
    
}
