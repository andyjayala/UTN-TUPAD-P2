
package Modulo1;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        int numUno, numDos;
        double diviTrunca, diviEnSerio;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primero numero: ");
        numUno = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        numDos = Integer.parseInt(input.nextLine());
        diviTrunca = numUno / numDos;
        diviEnSerio = (double) numUno / numDos;
        System.out.println("Si hacemos division entre enteros: " + diviTrunca +"; Si pensamos el resultado como Double: "+ diviEnSerio);
    }    
}
