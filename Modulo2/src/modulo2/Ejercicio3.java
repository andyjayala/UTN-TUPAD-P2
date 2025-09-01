
package modulo2;

import java.util.Scanner;

/*
Escribe un programa en Java que solicite al usuario su edad y clasifique su 
etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto"
60 años o más: "Adulto mayor"

*/

public class Ejercicio3 {

    public static void main(String[] args) {
        
        int edad;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(sc.nextLine());

        if (edad < 0) {
            System.out.println("La edad ingresada no puede ser negativa");
        } else if ((12 < edad) && (edad <= 0)) {
            System.out.println("Es menor de 12 años: \"Niño\" ");
        } else if ((17 >= edad) && (edad >= 12)){
            System.out.println("Entre 12 y 17 años: \"Adolescente\"");
        } else if ((59 >= edad) && (edad >= 18)){
            System.out.println("Entre 18 y 59 años: \"Adulto\"");
        } else {
            System.out.println("60 años o más: \"Adulto Mayor\"");
        }
                                    
    }
    
    
}
