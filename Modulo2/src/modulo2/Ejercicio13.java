
package modulo2;

/*
Impresión recursiva de arrays antes y después de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.
 */
public class Ejercicio13 {
    
    public static void main(String[] args) {
    
        double[] precios = {10, 20, 30, 40, 50.55, 60.666};
        System.out.print("Precios originales: ");
        mostrarPreciosRecursivo(precios, 0);

        precios[2] = 111.111;
        System.out.println("");
        System.out.print("Precios modificados: ");
        mostrarPreciosRecursivo(precios, 0); 
    }
   
        public static void mostrarPreciosRecursivo(double[] precios, int indice) {
            if (indice <= precios.length) {
                 for (int i = 0; i < precios.length; i++) { //d
            double elemento = precios [i] ;
            System.out.print(elemento + " ");
            }           
            return;
            }
            mostrarPreciosRecursivo(precios, indice - 1);
        }
    }
    
