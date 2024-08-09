package solucion5;

public class HabitacionBasica implements Habitacion {

    @Override
    public String getDescripcion() {
        return "Habitación básica";
    }

    @Override
    public double getCosto() {
        return 50.0;
    }
}
