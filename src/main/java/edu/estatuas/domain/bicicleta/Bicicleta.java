package edu.estatuas.domain.bicicleta;

public class Bicicleta implements Movil{

    private final int idBicicleta;

    public Bicicleta(int idBicicleta){
        this.idBicicleta = idBicicleta;
    }

    @Override
    public int getId(){
        return this.idBicicleta;
    }
    @Override
    public String toString(){
        return Integer.toString(getId());
    }
}
