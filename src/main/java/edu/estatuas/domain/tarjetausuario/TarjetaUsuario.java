package edu.estatuas.domain.tarjetausuario;

public class TarjetaUsuario implements Autenticacion{
    private String idTarjeta;
    private boolean activada = false;

    public TarjetaUsuario(String idTarjeta, boolean activada){
        this.idTarjeta = idTarjeta;
        this.activada = activada;
    }

    @Override
    public boolean isActivada(){
        return this.activada;
    }
}
