/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author nicoleagila
 */
public class VehiculoDirector {
    private VehiculoBuilder builder;
    
    public VehiculoDirector(VehiculoBuilder builder){
        this.builder=builder;
    }
    
    public void construirVehiculo(){
        builder.definirVehiculo();
        builder.construirMotor();
        builder.construirHabitaculo();
    }
    
    public Vehiculo getVehiculo(){
        return builder.getVehiculo();
    }
}
