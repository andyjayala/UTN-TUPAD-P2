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

public class Bateria {
    private String modelo;
    private int capacidad;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public void mostrarBateria(){
        System.out.println("Datos de la bateria: ");
        System.out.println("Modelo de la bateria: "+modelo+ ", Capacidad Bateria: "+capacidad);
    }
    
}
