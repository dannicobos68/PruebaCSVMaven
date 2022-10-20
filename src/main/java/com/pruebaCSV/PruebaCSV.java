package com.pruebaCSV;

public class PruebaCSV {
    /*
      Ejemplo de acceso a archivo csv desde Java.
      No utiliza ningún gestor de dependencias.
       */
    /**
     * @author Daniel Cobos Estévez
     */
    public static void main(String[] args) {
        LectorCSV miLector = new LectorCSV();
        miLector.leeCSV("./datos/pokemon.csv");

    }
}