package solucion1;

public abstract class Mago implements Heroe {

    public Mago(Mago mago) {
    }

    @Override
    public Heroe clonar() {
        return new Mago(this) {
        };
    }
}