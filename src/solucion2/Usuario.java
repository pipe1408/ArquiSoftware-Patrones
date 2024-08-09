package solucion2;

public class Usuario {
    public void enviarMensaje(Usuario usuario) {
        System.out.println("Mensaje enviado: " + usuario);
    }

    public void recibirMensaje(Usuario usuario) {
        System.out.println("Mensaje recibido: " + usuario);
    }
}
