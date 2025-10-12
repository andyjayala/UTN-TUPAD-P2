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

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if(pasaporte != null && pasaporte.getTitular() !=this){
            pasaporte.setTitular(this);
        }
    }

    // Quiero crear titulares a partir solo de los datos nombre y dni
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre!= null){
            this.nombre = nombre;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni!= null){
            this.dni = dni;
    }
    }
    
    public void mostrarTitular(){
        System.out.println("Nombre Titular: "+ nombre+ ", con DNI: "+dni);
    }
    
    
    public void mostrarTitularconPasaporte(){
        System.out.println("El titular: "+ nombre+ ", con DNI "+dni+ " tiene el pasaporte "+ pasaporte.getNumero());
    }   
}
