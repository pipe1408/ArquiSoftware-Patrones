package solucion5;

public class Flores extends DecoradorHabitacion {
    public Flores(Habitacion habitacionDecorada) {
        super(habitacionDecorada);
    }

    @Override
    public String getDescripcion() {
        return habitacionDecorada.getDescripcion() + ", Flores frescas";
    }

    @Override
    public double getCosto() {
        return habitacionDecorada.getCosto() + 10.0;
    }
}
