/*
Encapsulamiento con la Clase Libro
a. Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion.
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final.
 */
package modulo3;

public class LibroEj3 {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // No sé qué validación sería necesaría, asi que invento que quiero que tenga 4 digitos y sea menor al
    // año actual
    public void setAnioPublicacion(int anio) {
        if ((anio > 999) && (anio < 2025)){
            System.out.println("El anio "+ anio + " ingresado es correcto.");
            this.anioPublicacion = anio;
        } else {
            System.out.println("El anio de publicacion tiene que tener 4 digitos y ya haber pasado. No se aceptan fechas futuras.");
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Titulo del libro: \""+ titulo +"\"");
        System.out.println("Autor: "+ autor +"; Anio: "+ anioPublicacion); 
    }
    
    
}
