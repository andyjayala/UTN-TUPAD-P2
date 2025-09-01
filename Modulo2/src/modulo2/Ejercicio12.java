
package modulo2;

/*
Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.
 */
public class Ejercicio12 {
    
    public static void main(String[] args) {
    
        double[] precios = {10, 20, 30, 40, 50, 60}; //a
        
        for (int i = 0; i < precios.length; i++) { //b
           double elemento = precios [i] ;
            System.out.print(elemento + " ");
        }
        
        precios[2] = 80; //c y dejo linea vacía para que vaya abajo el punto d
        System.out.println("");
        
        for (int i = 0; i < precios.length; i++) { //d
           double elemento = precios [i] ;
            System.out.print(elemento + " ");
        }
        
    }
}
