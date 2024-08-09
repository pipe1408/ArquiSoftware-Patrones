package solucion5;

public class ChocolateGourmet extends DecoradorHabitacion {
    public ChocolateGourmet(Habitacion habitacionDecorada) {
        super(habitacionDecorada);
    }

    @Override
    public String getDescripcion() {
        return habitacionDecorada.getDescripcion() + ", Chocolate gourmet";
    }

    @Override
    public double getCosto() {
        return habitacionDecorada.getCosto() + 15.0;
    }
}
