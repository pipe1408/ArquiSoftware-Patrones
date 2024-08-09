package solucion5;

public abstract class DecoradorHabitacion implements Habitacion {
    protected Habitacion habitacionDecorada;

    public DecoradorHabitacion(Habitacion habitacionDecorada) {
        this.habitacionDecorada = habitacionDecorada;
    }

    @Override
    public String getDescripcion() {
        return habitacionDecorada.getDescripcion();
    }

    @Override
    public double getCosto() {
        return habitacionDecorada.getCosto();
    }
}
