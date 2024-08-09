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
                    manejarPedido(new PedidoComida(), new String[]{"Tacos", "Burrito", "Nachos","Flautas","Esquites"},
                            new int[]{26500, 28700, 17700, 12500, 11300});
                    break;

                case 2:
                    manejarPedido(new PedidoBebida(), new String[]{"Cerveza", "Gaseosa", "Agua","Jugo","Limonada"},
                            new int[]{3700, 3500, 2000, 4000, 3200});
                    break;

                case 3:
                    manejarPedido(new PedidoPostre(), new String[]{"Pie de manzana", "Helado", "Brownie","Churros","Tres leches"},
                            new int[]{9700, 7800, 8900, 10200,12400});
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Chao pescao...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void manejarPedido(Pedido pedido, String[] items, int[] precios) {
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
            } else if (opcionProducto != 0) {
                JOptionPane.showMessageDialog(null, "Opción no disponible. Inténtelo de nuevo.");
            }
        } while (opcionProducto != 0);

        pedido.procesarPedido();
    }
}
