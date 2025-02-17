package edu.estatuas.domain.estacion;

public class Estacion {
    private final int id_estacion;
    private final String nombre_estacion;
    private final Anclajes anclajes;
    public Estacion(int id_estacion, String nombre_estacion, int cantidad_anclajes){
        this.id_estacion = id_estacion;
        this.nombre_estacion = nombre_estacion;
        this.anclajes = new Anclajes(cantidad_anclajes);
    }
}
