package edu.estatuas.domain.estacion;

import edu.estatuas.domain.bicicleta.Movil;

public class Estacion {

    private final int idEstacion;
    private final String direccion;
    private final Anclajes anclajes;

    public Estacion(int idEstacion, String direccion, int cantidadAnclajes){
        this.idEstacion = idEstacion;
        this.direccion = direccion;
        this.anclajes = new Anclajes(cantidadAnclajes);
    }
    public void consultarEstacion(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return 	"ID Esstación: " + getId() + '\n' +
                "Dirección: " + getDireccion() + '\n' +
                "Número de Anclajes: " + numAnclajes();
    }

    private int getId(){
        return this.idEstacion;
    }

    private String getDireccion(){
        return  this.direccion;
    }

    private int numAnclajes(){
        return  anclajes.numAnclajes();
    }



    public int anclajesLibres(){
        int numAnclajesLibre = 0;
        for (Anclaje anclaje: anclajes.anclajes()){
            if (!anclaje.estaOcupado()){
                ++ numAnclajesLibre;
            }
        }
        return numAnclajesLibre;
    }


    public void consultarAnclajes(){
        int numeroAnclaje = 1;
        for (Anclaje anclaje: anclajes.anclajes()){
            System.out.println("Anclaje" + numeroAnclaje + ": " + anclaje.estaOcupado());
            ++ numeroAnclaje;
        }
    }


    public void anclarBicicleta(Movil bicicleta){
        int posicion = 0;
        for (Anclaje anclaje: anclajes.anclajes()){
            if (!anclaje.estaOcupado()){
                anclajes.ocuparAnclajes(posicion, bicicleta);
                break;
            }
            ++ posicion;
        }
    }
}


