/*
1. Registro de Estudiantes
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.
 */
package modulo3;

public class EstudiantesEj1 {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public double getCalificacion(){
        return calificacion;
    }
    
    public void setCalificacion(double calificacion){
        if (calificacion > 10){ 
            this.calificacion = 10;
        } else if (calificacion < 0){
            this.calificacion = 0;
        } else {
            this.calificacion = calificacion;
        }
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre+"; Apellido: "+ apellido+"; Curso: "+ curso + "; Calificacion: "+ calificacion ); 
    }
    
    public void subirCalificacion(double puntos){
        if (calificacion + puntos <= 10) {
            calificacion += puntos;
            System.out.println("Calificacion subio a: "+ calificacion);
        } else {
            System.out.println("La nota ya supero el 10. Nota final 10.");
        }
    }
    
    public void bajarCalificacion(double puntos){
        if (calificacion - puntos >= 0) {
            calificacion -= puntos;
            System.out.println("Calificacion bajo a: "+ calificacion);
        } else {
            System.out.println("La nota llego a 0 (o menos). Nota final 0.");
        }
    }

    
}
