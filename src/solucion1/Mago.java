package solucion1;

public class Mago extends HeroePrototype {

    public Mago(String nombre, String color) {
        super(nombre, color);
        habilidadesClase();
    }

    @Override
    public String getClase() {
        return "Mago";
    }

    @Override
    public HeroePrototype clonar() {
        return new Mago(this);
    }

    public Mago(Mago heroe) {
        super(heroe);
    }

    private void habilidadesClase() {
        this.addHabilidad("Varita de aprendiz");
        this.addHabilidad("Capa de invisibilidad");
        this.addHabilidad("Meditación");
    }
}
