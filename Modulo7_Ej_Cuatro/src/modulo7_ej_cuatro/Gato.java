package modulo7_ej_cuatro;

public class Gato extends Animal {
    
    public Gato(String nombre) {
        super(nombre, "gato/a");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}