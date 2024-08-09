package solucion3;

public class Main {
    public static void main(String[] args) {
        Pedido pedidoComida = new PedidoComida();
        pedidoComida.procesarPedido();

        Pedido pedidoBebida = new PedidoBebida();
        pedidoBebida.procesarPedido();

        Pedido pedidoPostre = new PedidoPostre();
        pedidoPostre.procesarPedido();
    }
}
