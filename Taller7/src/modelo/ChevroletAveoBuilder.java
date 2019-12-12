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
public class ChevroletAveoBuilder extends VehiculoBuilder{

    @Override
    public void definirVehiculo() {
        vehiculo = new Vehiculo();
        vehiculo.setMarca("Chevrolet");
        vehiculo.setModelo("Aveo");
        vehiculo.setColor("Azul");
        vehiculo.setAlmacenamiento(716);
    }

    @Override
    public void construirHabitaculo() {
        vehiculo.setTipoCarroceria(new Carroceria("Hatchback"));
    }

    @Override
    public void construirMotor() {
        vehiculo.setTipoMotor(new Motor("1.6"));
    }
    
}
