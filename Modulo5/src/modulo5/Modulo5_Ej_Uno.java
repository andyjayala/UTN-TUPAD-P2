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

public class Modulo5_Ej_Uno {


    public static void main(String[] args) {
        
    // Para hacer la composición de Pasaporte --> Foto
    
    Pasaporte pasaporteUno = new Pasaporte("12345", LocalDate.of(2025,10,10), "Imagen12345","jpg");
    Pasaporte pasaporteDos = new Pasaporte("22222", LocalDate.of(2024,9,3), "Imagen22222","npg");
    Pasaporte pasaporteTres = new Pasaporte("33333", LocalDate.of(2022,3,11), "Imagen33333","jpg");
    
    pasaporteUno.mostrarPasaporteCompleto();
    
    System.out.println("");
    pasaporteDos.mostrarPasaporteCompleto();
    System.out.println(""); 
    pasaporteTres.getFoto().mostrarFoto();
    
    
    // Para hacer la asociación bidireccional Pasaporte <--> Titular
   
    // Necesitamos crear algunos Titulares y asociarlos a los pasaportes ya creados
    // Queremos crear titulares a partir solo de los datos nombre y dni
    
    Titular titularA = new Titular ("Andrea Ayala", "12345678");
    Titular titularB = new Titular ("Fulanito Perez", "23232323");
    Titular titularC = new Titular ("James Bond", "0070007"); 
    
    // Setteo titularA con pasaporteUno y titularB con pasaporteDos, accediendo desde puntos distintos
    // para mostrar la bidireccionalidad:
    
    titularA.setPasaporte(pasaporteUno);
    pasaporteDos.setTitular(titularB);
    
    System.out.println("-----------------------------------------------------");
    // Muestro datos a través de métodos creados:
    
    titularC.mostrarTitular();
    System.out.println("");
    titularA.mostrarTitularconPasaporte();
    titularB.mostrarTitularconPasaporte();
    
    
    }
}
