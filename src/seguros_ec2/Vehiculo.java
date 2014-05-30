/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seguros_ec2;

/**
 *
 * @author Darien
 */
public abstract class Vehiculo {
    
    protected String marca;
    protected String modelo;
    protected int anioFabricacion;
    protected double costo;

    public Vehiculo(){
        
    }
    
    public Vehiculo(String marca, String modelo, int anioFacturacion, double costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFacturacion;
        this.costo = costo;
    }

    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFacturacion) {
        this.anioFabricacion = anioFacturacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public abstract double calcularPrima ();
    
    
    
}
