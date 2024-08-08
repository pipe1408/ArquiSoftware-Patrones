package solucion1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HeroePrototype arqueroFelipe = new Arquero("Felipe", "Azul");

        jugar(arqueroFelipe);

        HeroePrototype arqueroClon = arqueroFelipe.clonar();
        arqueroClon.setNombre("Santiago");
        arqueroClon.setColor("Rojo");
        arqueroClon.addHabilidad("Flecha magica");
        arqueroClon.removeHabilidad("Vendaje");

        printInfo(arqueroClon);

        jugar(arqueroClon);
    }

    private static void jugar(HeroePrototype heroe) {
        Random rand = new Random();
        for (int i = 0; i < 10 ; i++) {
            if (rand.nextInt(3) == 0) {
                heroe.atacar();
            } else if (rand.nextInt(3) == 1) {
                heroe.defender();
            } else {
                System.out.println("Fallo");
            }
        }
        printInfo(heroe);
    }

    private static void printInfo(HeroePrototype heroe) {
        System.out.println(
                "===============================\n" +
                "Nombre: " + heroe.getNombre() + "\n" +
                "Color: " + heroe.getColor() + "\n" +
                "Clase: " + heroe.getClase() + "\n" +
                "XP: " + heroe.getExperiencia() + "\n" +
                "Nivel: " + heroe.getNivel() + "\n" +
                "Puntos: " + heroe.getPuntos_habilidad() + "\n" +
                "Habilidades: " + heroe.getHabilidades() + "\n" +
                "==============================="
        );
    }
}
