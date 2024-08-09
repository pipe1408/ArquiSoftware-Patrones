package solucion2;

public class Desktop implements Dispositivo {
    @Override
    public void actualizar(String owner, String remitente, String mensaje) {
        System.out.println("[🖥️ Escritorio de " + owner + "] " + remitente + ": " + mensaje);
    }
}
