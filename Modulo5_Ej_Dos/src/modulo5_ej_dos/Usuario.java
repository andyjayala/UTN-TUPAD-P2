/*
2. Celular - Batería - Usuario
a. Agregación: Celular → Batería
b. Asociación bidireccional: Celular ↔ Usuario
Clases y atributos:
i. Celular: imei, marca, modelo
ii. Batería: modelo, capacidad
iii. Usuario: nombre, dni
 */
package modulo5_ej_dos;

public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
 
    public void mostrarUsuarioConCelu(){
        System.out.println("Viendo el modelo del celular desde el usuario: ");
        System.out.println("El usuario "+ nombre+ " con Dni "+ dni+ " tiene un celular "+ celular.getModelo());
    }

    
}
