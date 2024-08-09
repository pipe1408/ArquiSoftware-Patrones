package solucion3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "====MENU====\n" +
                    "1. Ordenar comida\n" +
                    "2. Ordenar bebida\n" +
                    "3. Ordenar postre\n" +
                    "0. SALIR\n"));

            switch (opcion) {
                case 1:
                    manejarPedido(new PedidoComida());
                    break;

                case 2:
                    manejarPedido(new PedidoBebida());
                    break;

                case 3:
                    manejarPedido(new PedidoPostre());
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Chao pescao...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void manejarPedido(Pedido pedido) {
        String item;
        double precio;
        int cantidad;

        while (true) {
            item = JOptionPane.showInputDialog(null, "Ingrese el nombre del ítem (o 'fin' para terminar):");
            if (item.equalsIgnoreCase("fin")) break;

            precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del ítem:"));
            pedido.agregarItem(item, precio);
        }

        pedido.procesarPedido();
    }
}