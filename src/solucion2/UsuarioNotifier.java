package solucion2;

import java.util.ArrayList;
import java.util.List;

public class UsuarioNotifier {
    private final List<Dispositivo> dispositivos;

    public UsuarioNotifier() {
        this.dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(Dispositivo dispositivo) {
        this.dispositivos.add(dispositivo);
    }

    public void eliminarDispositivo(Dispositivo dispositivo) {
        this.dispositivos.remove(dispositivo);
    }

    public void notificarDispositivos() {
        // TODO Recorrer lista de dispositivos
    }
}
