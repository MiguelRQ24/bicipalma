package edu.estatuas.appalma;

import edu.estatuas.domain.estacion.Estacion;


public class BiciPalma
{
    public static void main( String[] args ) {
        Estacion estacion = new Estacion(1, "Manacor", 6);

        estacion.consultarEstacion();

        /*
         * caso TEST visualizar anclajes libres
         */

        System.out.println("\n **** caso TEST visualizar anclajes libres **** \n");

        System.out.println("Anclajes libres: " + estacion.anclajesLibres() + "\n");

        estacion.consultarAnclajes();
    }
}
