package edu.estatuas.appalma;

import edu.estatuas.domain.bicicleta.Bicicleta;
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

        /*
         * caso TEST anclar bicicleta(s)
         */

        System.out.println("\n **** caso TEST anclar bicicleta(s) **** \n");

        int[] bicicletas = { 291, 292, 293, 294 };

        Bicicleta bicicleta = null;
        for (int id : bicicletas) {
            bicicleta = new Bicicleta(id);
            estacion.anclarBicicleta(bicicleta);
        }

        System.out.println("anclajes libres tras generar " + bicicletas.length
                + " bicis: " + estacion.anclajesLibres());

        /*
         * caso TEST visualizar anclajes libres
         */

        System.out.println("\n **** caso TEST visualizar anclajes libres **** \n");

        System.out.println("Anclajes libres: " + estacion.anclajesLibres() + "\n");

        estacion.consultarAnclajes();
    }
}
