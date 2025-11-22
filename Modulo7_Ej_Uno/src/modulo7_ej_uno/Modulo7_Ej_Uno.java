/* MODULO 7:
1. Vehículos y herencia básica
● Clase base: Vehículo con atributos marca, modelo y método mostrarInfo()
● Subclase: Auto con atributo adicional cantidadPuertas, sobrescribe mostrarInfo()
● Tarea: Instanciar un auto y mostrar su información completa.
 */
package modulo7_ej_uno;

public class Modulo7_Ej_Uno {

    public static void main(String[] args) {
        
        Auto auto = new Auto("Toyota", "Corolla", 4);
        auto.mostrarInfo();

    }
    
}
