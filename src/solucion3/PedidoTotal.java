package solucion3;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PedidoTotal {
    private List<Pedido> pedidos;

    public PedidoTotal() {
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void calcularPrecioFinal() {
        double precioFinal = 0;
        for (Pedido pedido : pedidos) {
            precioFinal += pedido.getPrecioTotal();
        }
        if (precioFinal==0){
           JOptionPane.showMessageDialog(null, "Aun no ha ordenado nada, por favor ordene para finalizar el pedido");
        }
        else{
        JOptionPane.showMessageDialog(null, "El precio final de todos los pedidos es: $" + precioFinal);
    }
    }
}
