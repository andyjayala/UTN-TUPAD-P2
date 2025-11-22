package modulo7_ej_tres;

public class EmpleadoPlanta extends Empleado {
    private double plusPresentismo;
    
    // Para hacerlo más real al salario mensual se le agrega un plus por presentismo del 8% respecto al sueldo base
    public EmpleadoPlanta(String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.plusPresentismo = (salarioBase * 0.08);
    }
    
    @Override
    public double calcularSueldo() {
        return salarioBase + plusPresentismo;
    }   
}
