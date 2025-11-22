/*
Parte 1: Interfaces en un sistema de E-commerce
1. Crear una interfaz Pagable con el método calcularTotal().
2. Clase Producto: tiene nombre y precio, implementa Pagable.
3. Clase Pedido: tiene una lista de productos, implementa Pagable y calcula el total del pedido.
4. Ampliar con interfaces Pago y PagoConDescuento para distintos medios de pago (TarjetaCredito, 
PayPal), con métodos procesarPago(double) y aplicarDescuento(double).
5. Crear una interfaz Notificable para notificar cambios de estado. La clase Cliente implementa 
dicha interfaz y Pedido debe notificarlo al cambiar de estado.
 */
package modulo8_Ej_Uno;

public class Modulo8 {


    public static void main(String[] args) {
        
        // Para probar el codigo damos de alta 2 clientes y un pedido en cada caso
        Cliente clienteUno = new Cliente("Patricia");
        Pedido pedidoUno = new Pedido(clienteUno);       
        Cliente clienteDos = new Cliente("Guillermo");
        Pedido pedidoDos = new Pedido(clienteDos);
        
        // Cargamos items al pedido
        pedidoUno.agregarProducto(new Producto("Remera", 20000));
        pedidoUno.agregarProducto(new Producto("Pantalon",60000));   
        pedidoDos.agregarProducto(new Producto("Medias",5000));

        // Mostramos notificaciones y cambio de estado de los pedidos
        pedidoUno.cambiarEstado("Enviado");
        System.out.println("Total pedido: $" + pedidoUno.calcularTotal());
        pedidoDos.cambiarEstado("Enviado");
        System.out.println("Total pedido: $" + pedidoDos.calcularTotal());

        
    }
    
}
