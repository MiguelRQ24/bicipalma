package edu.estatuas.domain.estacion;

import edu.estatuas.domain.bicicleta.Movil;
import edu.estatuas.domain.tarjetausuario.Autenticacion;

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

    public boolean leerTarjetaUsuario(Autenticacion tarjetaUsuario) {
        return tarjetaUsuario.isActivada();
    }

    public void retirarBicicleta(Autenticacion tarjetaUsuario){
        // genero un número de anclaje random = posicion en array
        // y retiro bici => poner a null

        if (leerTarjetaUsuario(tarjetaUsuario)) {

            boolean biciRetirada = false;

            while (!biciRetirada) {

                int posicion = anclajes.seleccionarAnclaje();
                int numeroAnclaje = posicion + 1;

                if (anclajes.isAnclajeOcupado(posicion)) { // leer anclaje
                    mostrarBicicleta(anclajes.getBiciAt(posicion), numeroAnclaje);
                    anclajes.liberarAnclaje(posicion); // set anclaje
                    biciRetirada = true;
                } else
                    ; // generamos nuevo número de anclaje;
            }

        } else {
            System.out.println("Tarjeta de usuario inactiva :(");
        }


    }
    private void mostrarBicicleta(Movil bicicleta, int numeroAnclaje){
        System.out.println("bicicleta retirada: " + bicicleta.getId()
                + " del anclaje: " + numeroAnclaje);
    }
}


