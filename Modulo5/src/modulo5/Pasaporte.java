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

import java.time.LocalDate;

/**
 *
 * @author andre
 */
public class Pasaporte {
    
private String numero;
private LocalDate fechaEmision; 
private Foto foto;
private Titular titular;


// Para que se de una relación de composición necesitamos pasarle los atributos necesarios 
// para crear el objeto Foto "desde adentro", en vez de cargar un objeto foto ya existente
// y según la consigna para crear la foto necesitamos los siguientes atributos: imagen, formato

public Pasaporte(String numero, LocalDate fechaEmision, String imagen, String formato) {
    this.numero = numero;
    this.fechaEmision = fechaEmision;
    this.foto = new Foto(imagen, formato);
}


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    
    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getPasaporte() !=this){
        titular.setPasaporte(this);
        }
    }

    
// Si queremos mostrar los datos podemos crear un método:
public void mostrarPasaporteCompleto() {
    System.out.println("Datos completos del pasaporte numero: "+ numero);
    System.out.println("Fecha de Emision: "+fechaEmision+ ", Imagen: "+ foto.getImagen()+ 
            ", Formato: "+ foto.getFormato());
    }


}

