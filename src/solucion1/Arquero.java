package solucion1;

public abstract class Arquero implements Heroe {

    public Arquero(Arquero arquero) {
    }

    @Override
    public Heroe clonar() {
        return new Arquero(this) {
        };
    }
}
