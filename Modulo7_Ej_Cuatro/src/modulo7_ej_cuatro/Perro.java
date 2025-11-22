package modulo7_ej_cuatro;

public class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre, "perro/a");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}