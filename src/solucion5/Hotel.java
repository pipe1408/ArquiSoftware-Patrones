package solucion5;

public class Hotel {
    public static void main(String[] args) {
        Habitacion habitacion = new HabitacionBasica();

        habitacion = new Flores(habitacion);
        habitacion = new ChocolateGourmet(habitacion);
        habitacion = new VinoAltaCalidad(habitacion);

        System.out.println("Descripción: " + habitacion.getDescripcion());
        System.out.println("Costo total: $" + habitacion.getCosto());
    }
}
