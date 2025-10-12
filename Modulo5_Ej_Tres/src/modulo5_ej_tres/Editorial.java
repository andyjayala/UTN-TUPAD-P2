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

public class Editorial {
    private String nombre;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    
    
    
}
