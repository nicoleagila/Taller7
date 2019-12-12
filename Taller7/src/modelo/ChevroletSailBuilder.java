/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Luis Sanchez
 */
public class ChevroletSailBuilder extends VehiculoBuilder{
    
    public void definirVehiculo(){
	vehiculo = new Vehiculo();
	vehiculo.setMarca("Chevrolet");
	vehiculo.setModelo("Sail");
        vehiculo.setAlmacenamiento(1000);
        vehiculo.setColor("Rojo");
    }
	
    public void construirMotor(){
        vehiculo.setTipoMotor(new Motor("1.4"));
    }
    
    public void construirHabitaculo(){
        vehiculo.setTipoCarroceria(new Carroceria("1J23KO23"));
    }
}
