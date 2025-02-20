package edu.estatuas.domain.estacion;

import edu.estatuas.domain.bicicleta.Movil;

public class Anclajes {
    private Anclaje[] anclajes;
    Anclajes(int cantidad_anclajes){
        this.anclajes = new Anclaje[cantidad_anclajes];
        crearAnclajes(cantidad_anclajes);
    }
    private void crearAnclajes(int cantidad_anclajes){
        for (int i = 0; i < cantidad_anclajes;i++){
            this.anclajes[i] = new Anclaje();
        }
    }

    int numAnclajes(){
        return this.anclajes.length;
    }

    Anclaje[] anclajes() {
        return this.anclajes;
    }

    void ocuparAnclajes(int posicion, Movil bicicleta){
        this.anclajes[posicion].anclarBicicleta(bicicleta);
    }
}
