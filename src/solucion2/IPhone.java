package solucion2;

public class IPhone implements Dispositivo {
    @Override
    public void actualizar(String owner, String remitente, String mensaje) {
        System.out.println("[🍎iPhone de " + owner + "] " + remitente + ": " + mensaje);
    }
}
