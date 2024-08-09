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
                    manejarPedido(new PedidoComida(), new String[]{"Pizza", "Ensalada", "Hamburguesa"},
                            new double[]{12.99, 5.49, 8.99});
                    break;

                case 2:
                    manejarPedido(new PedidoBebida(), new String[]{"Cerveza", "Refresco", "Agua"},
                            new double[]{3.99, 1.49, 0.99});
                    break;

                case 3:
                    manejarPedido(new PedidoPostre(), new String[]{"Tarta de manzana", "Helado", "Brownie"},
                            new double[]{4.99, 3.49, 2.99});
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Chao pescao...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void manejarPedido(Pedido pedido, String[] items, double[] precios) {
        String menuProductos = "Seleccione un producto:\n";
        for (int i = 0; i < items.length; i++) {
            menuProductos += (i + 1) + ". " + items[i] + " - $" + precios[i] + "\n";
        }
        menuProductos += "0. Finalizar pedido";

        int opcionProducto;
        do {
            opcionProducto = Integer.parseInt(JOptionPane.showInputDialog(null, menuProductos));
            if (opcionProducto > 0 && opcionProducto <= items.length) {
                String itemSeleccionado = items[opcionProducto - 1];
                double precioSeleccionado = precios[opcionProducto - 1];
                pedido.agregarItem(itemSeleccionado, precioSeleccionado);
            }
        } while (opcionProducto != 0);

        pedido.procesarPedido();
    }
}