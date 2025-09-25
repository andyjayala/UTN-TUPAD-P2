/*
Caso Práctico - Sistema de Gestión de Empleados
Modelar una clase Empleado que represente a un trabajador en una empresa. Esta clase debe incluir constructores sobrecargados, 
métodos sobrecargados y el uso de atributos aplicando encapsulamiento y métodos estáticos para llevar control de los objetos creados.
CLASE EMPLEADO
Atributos:
● int id: Identificador único del empleado. / ● String nombre: Nombre completo. / ● String puesto: Cargo que desempeña.
● double salario: Salario actual. / ● static int totalEmpleados: Contador global de empleados creados.

REQUERIMIENTOS
1. Uso de this: Utilizar this en los constructores para distinguir parámetros de atributos.
2. Constructores sobrecargados: a) Uno que reciba todos los atributos como parámetros. b) Otro que reciba solo nombre y puesto, asignando 
un id automático y un salario por defecto. c) Ambos deben incrementar totalEmpleados.
3. Métodos sobrecargados actualizarSalario: a) Uno que reciba un porcentaje de aumento. b) Otro que reciba una cantidad fija a aumentar.
4. Método toString(): Mostrar id, nombre, puesto y salario de forma legible.
5. Método estático mostrarTotalEmpleados(): Retornar el total de empleados creados hasta el momento.
6. Encapsulamiento en los atributos: a) Restringir el acceso directo a los atributos de la clase. b) Crear los métodos Getters y Setters 
correspondientes.
 */

package modulo4;

public class Empleado {
    
    private int id; // Lo entiendo como un número de legajo
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados; // Contador global que por defecto empieza en 0
    private static double aumento = 100000; // Aumento fijo si es por importe
    private static double aumentoPorcentual = 0.15; // Aumento fijo si es por porcentaje fijo y quiero darle un 15%
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null){
            this.nombre = nombre;
        }
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (puesto != null){
            this.puesto = puesto;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public static void setTotalEmpleados(int totalEmpleados) {
        Empleado.totalEmpleados = totalEmpleados;
    }

    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados++; 
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado(String nombre, String puesto) {
        totalEmpleados++; 
        this.id = generarId(); // id que se carga de forma automática con el valor "000" por defecto
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 2000000;    // salario por defecto
        
    }

    public Empleado() {
    }
    
    // En vez de hacer este método se podría haber cargado el valor solo, pero lo pongo para mostrar que sé hacerlo
    private int generarId (){
        return 000;
    }

/*  
3. Métodos sobrecargados actualizarSalario: a) Uno que reciba un porcentaje de aumento. 
    b) Otro que reciba una cantidad fija a aumentar.
4. Método toString(): Mostrar id, nombre, puesto y salario de forma legible.
5. Método estático mostrarTotalEmpleados(): Retornar el total de empleados creados hasta el momento.
6. Encapsulamiento en los atributos: a) Restringir el acceso directo a los atributos de la clase. b) Crear los métodos Getters y Setters 
correspondientes.
*/
    
    public double actualizarSalario(double porcentaje) {
        return this.salario = salario * (1 + porcentaje);
    }

    // No entendí si "Otro que reciba una cantidad fija a aumentar" se refiere a un importe fijo o un porcentaje fijo
    // Opción porcentaje fijo:
    public double actualizarSalario() {
        return actualizarSalario(aumentoPorcentual);
    }
    
    
    // Lo pongo en modo comentado para que no se ejecute
    // Opcion importe fijo: 
    
    /*
    public double actualizarSalario() {
        return this.salario = this.salario + aumento;
    }
    */
    
    public static void mostrarTotalEmpleados(){
        System.out.println("Total de empleados cargados hasta ahora: " + totalEmpleados);
    }

    @Override
    public String toString() {
        return "Empleado{" + "id= " + id + ", nombre = " + nombre + ", puesto= " + puesto + ", salario= " + salario + '}';
    }
    
    
    
}

