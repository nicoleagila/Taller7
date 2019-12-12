/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller7;
import modelo.*;
/**
 *
 * @author Luis Sanchez
 */
public class Taller7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Chevrolet Aveo
        VehiculoDirector dirAveo = new VehiculoDirector(new ChevroletAveoBuilder());
        dirAveo.construirVehiculo();
        Vehiculo Aveo = dirAveo.getVehiculo();
        
        //Chevrolet Sail
        VehiculoDirector dirSail = new VehiculoDirector(new ChevroletSailBuilder());
        dirSail.construirVehiculo();
        Vehiculo Sail = dirSail.getVehiculo();
        
        //Chevrolet Spark
        VehiculoDirector dirSpark = new VehiculoDirector(new ChevroletSparktBuilder());
        dirSpark.construirVehiculo();
        Vehiculo Spark = dirSpark.getVehiculo();
        
        //Mostrar las caracteristicas de los Autos
        System.out.println(Aveo.toString());
        System.out.println(Sail.toString());
        System.out.println(Spark.toString());
    }   
}