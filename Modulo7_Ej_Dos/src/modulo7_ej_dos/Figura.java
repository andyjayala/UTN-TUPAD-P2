package modulo7_ej_dos;

public abstract class Figura {
    protected String nombre;
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
    
    public void mostrarArea() {
        System.out.println(nombre + " tiene un area de: " + calcularArea());
    }
}

