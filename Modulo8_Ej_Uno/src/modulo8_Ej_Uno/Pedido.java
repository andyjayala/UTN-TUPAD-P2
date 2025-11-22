package modulo8_Ej_Uno;

import java.util.*;

public class Pedido implements Pagable {
    
    private List<Producto> productos = new ArrayList<>();
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) total += p.calcularTotal();
        return total;
    }

    public void cambiarEstado(String estado) {
        cliente.notificar("El pedido cambio a: " + estado);
    }
}