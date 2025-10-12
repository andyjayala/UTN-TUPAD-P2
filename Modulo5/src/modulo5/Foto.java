/*
Ejercicios de Relaciones 1 a 1
1. Pasaporte - Foto - Titular
a. Composición: Pasaporte → Foto
b. Asociación bidireccional: Pasaporte ↔ Titular
Clases y atributos:
i. Pasaporte: numero, fechaEmision
ii. Foto: imagen, formato
iii. Titular: nombre, dni
 */
package modulo5;

public class Foto {
    
    // Atributos que vamos a necesitar para crear la foto
    private String imagen;
    private String formato;
    
    // Constructor con las dos variables
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    // Ponemos getters y setters
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    // Método para ver la información de la foto:
    public void mostrarFoto(){
        System.out.println("Info de la foto: Imagen: "+imagen+", Formato: "+formato);
    }
    
}

    
