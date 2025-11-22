/* MODULO 7:
2. Figuras geométricas y métodos abstractos
● Clase abstracta: Figura con método calcularArea() y atributo nombre
● Subclases: Círculo y Rectángulo implementan el cálculo del área
● Tarea: Crear un array de figuras y mostrar el área de cada una usando polimorfismo.
 */
package modulo7_ej_dos;

public class Modulo7_Ej_Dos {

    public static void main(String[] args) {

        Figura[] figuras = {
            new Circulo("Circulo 1", 2.3),
            new Rectangulo("Rectangulo 1", 4, 2.5),
            new Rectangulo("Rectangulo 2", 2, 2),
            new Circulo("Circulo 2", 1)
        };
        
        for (Figura figura : figuras) {
            figura.mostrarArea();
        }
                
        
        
    }
    
}
