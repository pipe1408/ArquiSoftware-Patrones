package solucion3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

abstract class Pedido {
    protected String idPedido;
    protected List<String> items;
    protected int precioTotal;

    public Pedido() {
        this.idPedido = UUID.randomUUID().toString();
        this.items = new ArrayList<>();
        this.precioTotal = 0;
    }

    public void agregarItem(String item, double precio) {
        items.add(item);
        precioTotal += precio;
    }

    public final void procesarPedido() {
        tomarPedido();
        verificarDisponibilidad();
        prepararPedido();
        calcularPrecio();
        completarPedido();
    }

    protected void tomarPedido() {
        System.out.println("Tomando el pedido: " + idPedido);
        System.out.println("Ítems del pedido: " + items);
    }

    protected abstract void prepararPedido();
    protected abstract void verificarDisponibilidad();

    protected void calcularPrecio() {
        System.out.println("Calculando el precio total: $" + precioTotal);
    }

    protected void completarPedido() {
        System.out.println("Pedido " + idPedido + " completado.");
    }

    public int getPrecioTotal() {
        return precioTotal;
    }
}