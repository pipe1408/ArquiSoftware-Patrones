package solucion1;

public abstract class Guerrero implements Heroe {

    public Guerrero(Guerrero guerrero) {
    }

    @Override
    public Heroe clonar() {
        return new Guerrero(this) {
        };
    }
}
