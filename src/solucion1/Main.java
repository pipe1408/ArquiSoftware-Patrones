package solucion1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HeroePrototype guerreroMain = new Guerrero("Luis", "Azul");
        HeroePrototype arqueroMain = new Arquero("Felipe", "Rojo");
        HeroePrototype magoMain = new Mago("Santiago", "Amarillo");

        jugar(guerreroMain);
        HeroePrototype guerreroSecundario = guerreroMain.clonar();
        guerreroSecundario.addHabilidad("Espada legendaria");
        guerreroSecundario.removeHabilidad("Espada vieja");
        jugar(guerreroSecundario);

        jugar(arqueroMain);
        HeroePrototype arqueroSecundario = arqueroMain.clonar();
        arqueroSecundario.setNombre("Daniel");
        jugar(arqueroSecundario);

        jugar(magoMain);
        HeroePrototype magoSecundario = magoMain.clonar();
        magoSecundario.setColor("Morado");
        jugar(magoSecundario);
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
