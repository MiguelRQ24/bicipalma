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
        boolean esBicicletaExistente;
        if (bicicleta == null){
            esBicicletaExistente = false;
        }
        else{
            esBicicletaExistente = true;
        }
        this.idBicicleta = bicicleta;
        this.estarOcupado = esBicicletaExistente;
    }
    void liberarBici(){
        this.idBicicleta = null;
        this.estarOcupado = false;
    }
    Movil getIdBicicleta(){
        return this.idBicicleta;
    }
}
