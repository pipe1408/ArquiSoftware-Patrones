package solucion3;

import java.util.List;
import java.util.ArrayList;

abstract class Pedido {
    protected String idPedido;
    protected List<String> items;

    public final void procesarPedido() {
        tomarPedido();
        prepararPedido();
        verificarDisponibilidad();
        calcularPrecio();
        completarPedido();
    }

    protected void tomarPedido() {
        System.out.println("Tomando el pedido...");
    }

    protected abstract void prepararPedido();
    protected abstract void verificarDisponibilidad();

    protected void calcularPrecio() {
        System.out.println("Calculando el precio total...");
    }

    protected void completarPedido() {
        System.out.println("Completando el pedido...");
    }
}
