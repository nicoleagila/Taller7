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
public class Vehiculo {
    private String Color;
    private String Marca;
    private String Modelo;
    private Carroceria TipoCarroceria;
    private Motor TipoMotor;
    
    
    public Vehiculo(){
        
    }
    
    public Vehiculo(boolean CierreCentralizado, String Color, boolean DireccionAsistida, String Marca, String Modelo, Carroceria TipoCarroceria, Motor TipoMotor){
       this.Color = Color;
       this.Marca = Marca;
       this.Modelo = Modelo;
       this.TipoCarroceria= TipoCarroceria;
       this.TipoMotor = TipoMotor;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public Carroceria getTipoCarroceria() {
        return TipoCarroceria;
    }

    public void setTipoCarroceria(Carroceria TipoCarroceria) {
        this.TipoCarroceria = TipoCarroceria;
    }

    public Motor getTipoMotor() {
        return TipoMotor;
    }

    public void setTipoMotor(Motor TipoMotor) {
        this.TipoMotor = TipoMotor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Color=" + Color + ", Marca=" + Marca + ", Modelo=" + Modelo + ", TipoCarroceria=" + TipoCarroceria + ", TipoMotor=" + TipoMotor + '}';
    }


    
    
    
}
