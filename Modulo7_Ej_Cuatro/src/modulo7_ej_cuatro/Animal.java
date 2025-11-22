package modulo7_ej_cuatro;

public class Animal {
    protected String nombre;
    protected String tipo;
    
    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    
    public void describirAnimal() {
        System.out.print("Soy un/a " + tipo + ", me llamo " + nombre);
    }
}