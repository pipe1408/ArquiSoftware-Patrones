package solucion1;

import java.util.ArrayList;
import java.util.List;

public abstract class HeroePrototype {

    private String nombre;
    private String color;
    private int experiencia;
    private int nivel;
    private int puntos_habilidad;
    private final List<String> habilidades;

    public HeroePrototype(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.experiencia = 0;
        calcular();
        this.habilidades = new ArrayList<>();
    }

    public HeroePrototype(HeroePrototype heroe) {
        this.nombre = heroe.getNombre();
        this.color = heroe.getColor();
        this.experiencia = heroe.getExperiencia();
        this.nivel = heroe.getNivel();
        this.puntos_habilidad = heroe.getPuntos_habilidad();
        this.habilidades = heroe.getHabilidades();
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntos_habilidad() {
        return puntos_habilidad;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void addHabilidad(String habilidad) {
        this.habilidades.add(habilidad);
    }

    public void removeHabilidad(String habilidad) {
        this.habilidades.remove(habilidad);
    }

    private void calcular() {
        this.nivel = ExperienciaCalculator.calcularNivel(this.experiencia);
        this.puntos_habilidad = ExperienciaCalculator.calcularPuntos(this.experiencia);
    }

    public void atacar() {
        System.out.println("Atacando +5 XP");
        this.experiencia = experiencia + 5;
        this.calcular();
    }

    public void defender() {
        System.out.println("Defendiendo +3 XP");
        this.experiencia = experiencia + 3;
        this.calcular();
    }

    public abstract String getClase();
    public abstract HeroePrototype clonar();
}
