
package modulo2;

import java.util.Scanner;

/* 
Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.
*/

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        int num;
        int contPositivo = 0;
        int contNegativo = 0;
        int contCeros = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Se le solicitan 10 numeros");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Numero " + i + ": ");
            num = Integer.parseInt (sc.nextLine());
            
            if ((num % 2 == 0) && (num != 0)){
                contPositivo ++; 
            } else if (num == 0){
                contCeros ++;
            } else {
                contNegativo ++;
            }
        }

        System.out.println("En total hay: " + contPositivo + " numeros positivos");
        System.out.println(contNegativo + " numeros negativos y "+ contCeros +" ceros.");
    }
    
}
