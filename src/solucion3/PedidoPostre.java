package solucion3;

class PedidoPostre extends Pedido {
    @Override
    protected void prepararPedido() {
        System.out.println("Preparando el postre...");
    }

    @Override
    protected void verificarDisponibilidad() {
        System.out.println("Verificando disponibilidad del postre...");
    }
}
