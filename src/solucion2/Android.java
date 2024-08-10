package solucion2;

public class Android implements Dispositivo {
    @Override
    public void actualizar(String owner, String remitente, String mensaje) {
        System.out.println("[👾 Android de " + owner + "] " + remitente + ": " + mensaje);
    }
}
