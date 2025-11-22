package modulo7_ej_tres;

public class EmpleadoTemporal extends Empleado {
    private double horasTrabajadas;
    
    public EmpleadoTemporal(String nombre, double salarioBase, double horasTrabajadas) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }
    
    // Supongo que se contrata a este empleado de forma circunstancial y se le paga el proporcional
    // por hora a lo que cobran los demás de forma mensual en ese puesto (en un trabajo de 180 hs mensuales)
    
    @Override
    public double calcularSueldo() {
        return (salarioBase / 180) * horasTrabajadas; 
    }
}
