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

public class Autor {
    private String nombre;
    private String nacionalidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;
        }
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    
}
