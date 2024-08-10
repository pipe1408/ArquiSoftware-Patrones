package solucion2;

public class Main {
    public static void main(String[] args) {
        Usuario felipe = new Usuario("Felipe");
        Usuario valentina = new Usuario("Valentina");
        Dispositivo iphone = new IPhone();
        Dispositivo android = new Android();
        Dispositivo desktop = new Desktop();

        felipe.iniciarSesion(iphone);
        felipe.iniciarSesion(android);
        felipe.iniciarSesion(desktop);

        valentina.nuevoMensaje(felipe, "Hola");

        felipe.cerrarSesion(iphone);

        valentina.nuevoMensaje(felipe, "Adiós");

    }
}
