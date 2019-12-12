/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kelly
 */
public abstract class VehiculoBuilder {
    
    protected Vehiculo vehiculo;
    
    public abstract void definirVehiculo();
    public abstract void construirHabitaculo();
    public abstract void construirMotor();

    public String getVehiculo() {
        return vehiculo;
    }
    
    
}
