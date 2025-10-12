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

public class Libro {
    
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo != null){
            this.titulo = titulo;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(isbn != null){
            this.isbn = isbn;
        }
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        if(autor != null){
            this.autor = autor;
        }
    }
    
    public void mostrarAutoryLibro(){
        System.out.println("El libro es \"" +titulo+ "\", cuyo/a autor/a es "+autor.getNombre());
        System.out.println("de nacionalidad " +autor.getNacionalidad()+ ", tiene isbn "+isbn);
        System.out.println("y es de la editorial "+editorial.getNombre()+" ubicada en "+editorial.getDireccion());
    }
    
}
