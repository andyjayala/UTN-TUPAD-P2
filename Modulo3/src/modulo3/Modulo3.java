
package modulo3;

import java.util.HashSet;
import java.util.Set;

public class Modulo3 {

    public static void main(String[] args) {
        
        
        // Ejercicio 1: Clase Estudiante
        
        EstudiantesEj1 estudianteUno = new EstudiantesEj1();
        
        estudianteUno.setNombre("Pepita");
        estudianteUno.setApellido("Gonzalez");
        estudianteUno.setCurso("Programacion"); 
        estudianteUno.setCalificacion(7);
        
        estudianteUno.mostrarInfo();
        estudianteUno.subirCalificacion (2.5);
        estudianteUno.bajarCalificacion (2);    
        
        // Ejercicio 2: Clase Mascota
        
        MascotaEj2 mascotaUno = new MascotaEj2();
        
        mascotaUno.setNombre("Andrea");
        mascotaUno.setEspecie("Tortuga");
        mascotaUno.setEdad(27);
        
        mascotaUno.mostrarInfo();
        mascotaUno.pasaronAnios(4);
        
        // Ejercicio 3: Clase Libro
        
        LibroEj3 libroUno = new LibroEj3 ();
        
        libroUno.setTitulo("El Monje Que Vendio su Ferrari");
        libroUno.setAutor("Robin Sharma");
        libroUno.setAnioPublicacion(2027); // año mal puesto adrede y cartel de error
        
        libroUno.setAnioPublicacion(1996); // con la fecha "bien"
  
        libroUno.mostrarInfo(); // con los datos "bien"
        
        // Ejercicio 4: Clase Gallinas
        
        GallinaEj4 gallinaUno = new GallinaEj4 ();
        
        gallinaUno.setIdGallina(0001);
        gallinaUno.setEdad(5);
        gallinaUno.setHuevosPuestos(11);
        
        gallinaUno.mostrarInfo();
        gallinaUno.ponerHuevos(2);
        gallinaUno.envejecer(3);
        
        GallinaEj4 gallinaDos = new GallinaEj4 ();
    
        gallinaDos.setIdGallina(0002);
        gallinaDos.setEdad(6);
        gallinaDos.setHuevosPuestos(8);

        gallinaDos.mostrarInfo();
        gallinaDos.ponerHuevos(1);
        gallinaDos.envejecer(3);
        
        // Ejercicio 5: Clase NaveEspacial
        
        NaveEspacialEj5 naveUno = new NaveEspacialEj5();
        
        naveUno.setNombre("Andreaspaceship");
        naveUno.setCombustible(50);
        
        naveUno.avanzar(80); // Avance fallido, se pide combustible
        naveUno.recargarCombustible(50); // Se carga combustible
        naveUno.avanzar(80); // Ahora si puede avanzar
        naveUno.mostrarEstado(); // Ver final
        
        
        
    }
    
}
