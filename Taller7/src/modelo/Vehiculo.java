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
    private boolean CierreCentralizado;
    private String Color;
    private boolean DireccionAsistida;
    private String Marca;
    private String Modelo;
    private Carroceria TipoCarroceria;
    private Motor TipoMotor;
    private int almacenamiento;
    
    
    public Vehiculo(){
        
    }
    
    public Vehiculo(boolean CierreCentralizado, String Color, boolean DireccionAsistida, String Marca, String Modelo, Carroceria TipoCarroceria, Motor TipoMotor){
       this.CierreCentralizado = CierreCentralizado;
       this.Color = Color;
       this.DireccionAsistida = DireccionAsistida;
       this.Marca = Marca;
       this.Modelo = Modelo;
       this.TipoCarroceria= TipoCarroceria;
       this.TipoMotor = TipoMotor;
    }

    public boolean isCierreCentralizado() {
        return CierreCentralizado;
    }

    public void setCierreCentralizado(boolean CierreCentralizado) {
        this.CierreCentralizado = CierreCentralizado;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public boolean isDireccionAsistida() {
        return DireccionAsistida;
    }

    public void setDireccionAsistida(boolean DireccionAsistida) {
        this.DireccionAsistida = DireccionAsistida;
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

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }
    

    @Override
    public String toString() {
        return "Vehiculo{" + "CierreCentralizado=" + CierreCentralizado + ", Color=" + Color + ", DireccionAsistida=" + DireccionAsistida + ", Marca=" + Marca + ", Modelo=" + Modelo + ", TipoCarroceria=" + TipoCarroceria + ", TipoMotor=" + TipoMotor + '}';
    }

    
    
    
    
}
