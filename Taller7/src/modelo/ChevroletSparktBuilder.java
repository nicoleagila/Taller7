/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.sun.prism.paint.Color;

/**
 *
 * @author Kelly
 */
public class ChevroletSparktBuilder extends VehiculoBuilder {

    @Override
    public void definirVehiculo() {
        vehiculo= new Vehiculo();
        vehiculo.setMarca("Chevrolet");
        vehiculo.setModelo("Sparkt");
        vehiculo.setAlmacenamiento(500);
        vehiculo.setColor("Negro");
        
    }

    @Override
    public void construirHabitaculo() {
        vehiculo.setTipoCarroceria(new Carroceria("JWE9EWF8"));
    }

    @Override
    public void construirMotor() {
        vehiculo.setTipoMotor(new Motor("1.2"));
    }
    
    
}
