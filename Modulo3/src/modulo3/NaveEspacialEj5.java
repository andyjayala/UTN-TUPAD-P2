/*
Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente. 
Mostrar el estado al final.
 */
package modulo3;

public class NaveEspacialEj5 {
    
    private String nombre;
    private int combustible, nuevoCombustible;
    private static final int MAX_COMBUSTIBLE =100;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    public void mostrarEstado(){
        System.out.println("La nave se llama " + nombre+ " y hay "+ nuevoCombustible+ " litros de combustible disponibles.");
    }
    
    public int recargarCombustible(int cantidad){
        if ((combustible += cantidad) <= MAX_COMBUSTIBLE){
            nuevoCombustible = combustible + cantidad;
            return nuevoCombustible;
        } else {
            System.out.println("No puede cargar más combustible porque supera el limite de 100 litros. Queda con el combustible inicial.");
            return combustible;
        }
    }
    
    public void avanzar(int distancia){
        if (distancia <= combustible) {
            nuevoCombustible = combustible - distancia;
            System.out.println("Pudo avanzar "+ distancia+ " unidades de distancia y le queda "+ nuevoCombustible+ " litros de combustible.");
        } else {
        System.out.println("No hay combustible suficiente para avanzar");
        }
    }
    
    public void despegar(){
        if (combustible >= 10) {      
            System.out.println("Puede despegar");
        } else {
        System.out.println("No hay combustible suficiente para despegar");
        }
    }    
}
