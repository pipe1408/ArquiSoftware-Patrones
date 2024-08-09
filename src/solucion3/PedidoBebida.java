package solucion3;

class PedidoBebida extends Pedido {
    @Override
    protected void prepararPedido() {
        System.out.println("Preparando la bebida...");
    }

    @Override
    protected void verificarDisponibilidad() {
        System.out.println("Verificando disponibilidad de la bebida...");
    }
}
