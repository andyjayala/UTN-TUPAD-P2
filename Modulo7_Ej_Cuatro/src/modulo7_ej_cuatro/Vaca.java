package modulo7_ej_cuatro;

public class Vaca extends Animal {
    
    public Vaca(String nombre) {
        super(nombre, "vaca");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Muuu");
    }
}