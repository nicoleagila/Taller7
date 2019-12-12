/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author CltControl
 */
public class ChevroletSailBuilder extends VehiculoBuilder{
    
    public void definirVehiculo(){
	vehiculo = new Vehiculo();
	vehiculo.setMarca("Chevrolet");
	vehiculo.setModelo("Sail");
    }
	
    public void construirMotor(){
        Motor m = new Motor("1.4");
        vehiculo.setMotor(m);
    }
    
    public void construirHabitaculo(){
        
    }

	/*@Override
	public void ConstruirAlmacenamiento() {
		v.setAlmacenamiento(1000);
		
	}

	@Override
	public void ConstruirCarroceria() {
            v.TipoCarroceria = new Carroceria();
            v.TipoCarroceria.setCarroceria(m);
    
    v.setMotor("1.4");
		v.setAlmacenamiento("1000 lb");
                v.setCarroceria("1J23KO23");
		v.setCarroceria(m);
}
    
    
    
    
    
    
    */

}
