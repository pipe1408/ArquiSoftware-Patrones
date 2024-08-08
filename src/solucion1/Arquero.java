package solucion1;

public class Arquero extends HeroePrototype {

    public Arquero(String nombre, String color) {
        super(nombre, color);
        habilidadesClase();
    }

    @Override
    public String getClase() {
        return "Arquero";
    }

    @Override
    public HeroePrototype clonar() {
        return new Arquero(this);
    }

    public Arquero(Arquero heroe) {
        super(heroe);
    }

    private void habilidadesClase() {
        this.addHabilidad("Flecha Normal");
        this.addHabilidad("Vendaje");
        this.addHabilidad("Binoculares");
    }
}
