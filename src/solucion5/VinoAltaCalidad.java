package solucion5;

public class VinoAltaCalidad extends DecoradorHabitacion {
    public VinoAltaCalidad(Habitacion habitacionDecorada) {
        super(habitacionDecorada);
    }

    @Override
    public String getDescripcion() {
        return habitacionDecorada.getDescripcion() + ", Vino de alta calidad";
    }

    @Override
    public double getCosto() {
        return habitacionDecorada.getCosto() + 25.0;
    }
}
