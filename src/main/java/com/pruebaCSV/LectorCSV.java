package com.pruebaCSV;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
Esta clase se encarga de leer el archivo csv que le pase como parámetro.
No devuelve nada, muestra el contenido del CSV por el terminal.
 */
public class LectorCSV {
    public void leeCSV(String nombreArchivo){

        try{
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String[] fila;
            while((fila=csvReader.readNext()) != null){
                System.out.println(fila[0]+ " | ");
            }
            csvReader.close();
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
