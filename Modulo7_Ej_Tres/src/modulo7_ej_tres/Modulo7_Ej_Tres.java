/* MODULO 7:
3. Empleados y polimorfismo
● Clase abstracta: Empleado con método calcularSueldo()
● Subclases: EmpleadoPlanta, EmpleadoTemporal
● Tarea: Crear lista de empleados, invocar calcularSueldo() polimórficamente, usar instanceof para clasificar
 */
package modulo7_ej_tres;

public class Modulo7_Ej_Tres {

    public static void main(String[] args) {

        Empleado[] empleados = {
            new EmpleadoPlanta("Homero Simpson", 1550000),
            new EmpleadoTemporal("William Shakespeare", 2000000, 120),
            new EmpleadoPlanta("Indiana Jones", 1000000),
            new EmpleadoTemporal("James Bond", 7000000, 180)
        };
        
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " tiene un sueldo de: $" + empleado.calcularSueldo());
            
           // Clasificar según el tipo de empleado con instanceOf
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de Planta");
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado Temporal");
            }
        }
        
        
        
    }
    
}
