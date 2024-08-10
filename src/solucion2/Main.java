package solucion2;

public class Main {
    public static void main(String[] args) {
        Usuario felipe = new Usuario("Felipe");
        Usuario valentina = new Usuario("Valentina");
        Dispositivo iphone = new IPhone();
        Dispositivo android = new Android();
        Dispositivo desktop = new Desktop();

        felipe.addDispositivo(iphone);
        felipe.addDispositivo(android);
        felipe.addDispositivo(desktop);

        valentina.nuevoMensaje(felipe, "Hola");

        felipe.removeDispositivo(iphone);

        valentina.nuevoMensaje(felipe, "Adiós");

    }
}
