/*
Gestión de Gallinas en Granja Digital
a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.
 */
package modulo3;

public class GallinaEj4 {
    
    private int idGallina; // Asumo que es un código numérico que se le pone
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>= 0){
            this.edad = edad;
        } else {
            System.out.println("No puede ser un numero menor a 0");
        }
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    

    public void mostrarInfo(){
        System.out.println("Gallina con ID: "+ idGallina);
        System.out.println("Tiene "+ edad +" anios y puso hasta ahora "+ huevosPuestos + " huevos");
    }
    
    public void ponerHuevos(int huevos){
        huevosPuestos += huevos;
        System.out.println("Ahora puso "+ huevos +" huevos, dando un total de "+ huevosPuestos +" huevos puestos.");      
    }
    
    public void envejecer(int anios){
        edad += anios;
        System.out.println("Pasaron "+ anios +" anios y ahora la gallina tiene "+ edad+ " anios de edad");
    }    
       
}
