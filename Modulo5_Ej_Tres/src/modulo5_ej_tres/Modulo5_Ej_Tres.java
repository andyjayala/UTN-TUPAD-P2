/*
3. Libro - Autor - Editorial
a. Asociación unidireccional: Libro → Autor
b. Agregación: Libro → Editorial
Clases y atributos:
i. Libro: titulo, isbn
ii. Autor: nombre, nacionalidad
iii. Editorial: nombre, direccion
 */
package modulo5_ej_tres;

public class Modulo5_Ej_Tres {

    public static void main(String[] args) {

        // Para hacer la asociación unidireccional, solo Libro ve a Autor, pero para
        // hacer la agregación, primero tenemos que crear Editorial
        // Creamos objetos con los cuales trabajar
        
        Editorial editorialA = new Editorial ("Planeta", "25 de Mayo 2000");
        Editorial editorialB = new Editorial ("Alfaguara", "Azcuenaga 134");
        
        // Instanciamos los libros con las editoriales ya existentes
        Libro libroUno = new Libro("Las Aventuras del Zorro", "zzzzzzz", editorialA);
        Libro libroDos = new Libro("Harry Potter", "hhhhhh", editorialB);
        
        Autor autorUno = new Autor("Isabel Allende", "Chilena");
        Autor autorDos = new Autor("J.K. Rowling", "Britanica");       
        
        // Con el set ya asociamos al libro con el autor
        libroUno.setAutor(autorUno);
        libroDos.setAutor(autorDos);
        
        // Vemos la información completa en ambos casos (vinculadas por agregación y
        // asociación unidireccional
        libroUno.mostrarAutoryLibro();
        System.out.println("");
        libroDos.mostrarAutoryLibro();
        
        
        
        
        
        
        
    }
    
}
