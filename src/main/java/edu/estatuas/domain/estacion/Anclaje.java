package edu.estatuas.domain.estacion;

import edu.estatuas.domain.bicicleta.Movil;

public class Anclaje {
    private boolean estarOcupado = false;
    private Movil idBicicleta = null;
    Anclaje(){}

    boolean estaOcupado(){
        return this.estarOcupado;
    }

    void anclarBicicleta(Movil bicicleta){
        this.idBicicleta = bicicleta;
        this.estarOcupado = true;
    }
}
