package solucion3;

class PedidoComida extends Pedido {
    @Override
    protected void prepararPedido() {
        System.out.println("Preparando la comida...");
    }

    @Override
    protected void verificarDisponibilidad() {
        System.out.println("Verificando disponibilidad de la comida...");
    }
}
