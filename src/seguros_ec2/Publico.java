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
public class Publico extends Vehiculo{
    
    private String placa;
    private int cantidadPasajeros;

    public Publico() {
    }

    public Publico(String placa, int cantidadPasajeros) {
        this.placa = placa;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    

    public Publico(String placa, int cantidadPasajeros, String marca, String modelo, int anioFacturacion, double costo) {
        super(marca, modelo, anioFacturacion, costo);
        this.placa = placa;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    
      
    @Override
    public double calcularPrima() {
        
        double prima = 0; //Valor del calculo de Prima
        prima = costo * 1.15/2.25 - (2014*1.0 - anioFabricacion*1.0)/100 * costo;    
        return prima;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    
    
    
}
