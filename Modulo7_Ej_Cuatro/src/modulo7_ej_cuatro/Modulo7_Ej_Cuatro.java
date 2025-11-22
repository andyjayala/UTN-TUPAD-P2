/* Modulo 7:
4. Animales y comportamiento sobrescrito
● Clase: Animal con método hacerSonido() y describirAnimal()
● Subclases: Perro, Gato, Vaca sobrescriben hacerSonido() con @Override
● Tarea: Crear lista de animales y mostrar sus sonidos con polimorfismo
 */
package modulo7_ej_cuatro;

public class Modulo7_Ej_Cuatro {

    public static void main(String[] args) {

        Animal[] animales = {
            new Perro("Chispita"),
            new Vaca("Mika"),
            new Perro("Roma"),
            new Gato("Macri"),
            new Vaca("Lola"),
        };
        
        for (Animal animal : animales) {
            animal.describirAnimal();
            System.out.print(" y se decir ");
            animal.hacerSonido();
            System.out.println();
        }

    }
}
    
