package solucion2;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private final String nombre;
    private final List<Dispositivo> dispositivos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.dispositivos = new ArrayList<>();
    }

    public void addDispositivo(Dispositivo dispositivo) {
        this.dispositivos.add(dispositivo);
        System.out.println("[" + this.nombre + "] Nuevo inicio de sesión en: " + dispositivo.getClass().getSimpleName());
    }

    public void removeDispositivo(Dispositivo dispositivo) {
        System.out.println("[" + this.nombre + "] Sesión cerrada en: " + dispositivo.getClass().getSimpleName());
        this.dispositivos.remove(dispositivo);
    }

    public void nuevoMensaje(Usuario destinatario, String mensaje) {
        destinatario.notificarUsuario(this.nombre, mensaje);
    }

    private void notificarUsuario(String remitente, String mensaje) {
        for (Dispositivo dispositivo : this.dispositivos) {
            dispositivo.actualizar(this.nombre, remitente, mensaje);
        }
    }
}
