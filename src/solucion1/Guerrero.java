package solucion1;

public class Guerrero extends HeroePrototype {

    public Guerrero(String nombre, String color) {
        super(nombre, color);
        habilidadesClase();
    }

    @Override
    public String getClase() {
        return "Guerrero";
    }

    @Override
    public HeroePrototype clonar() {
        return new Guerrero(this);
    }

    public Guerrero(Guerrero heroe) {
        super(heroe);
    }

    private void habilidadesClase() {
        this.addHabilidad("Espada vieja");
        this.addHabilidad("Escudo roto");
        this.addHabilidad("Vendaje");
    }
}
