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
public class Privado extends Vehiculo{

    private boolean deLujo;

    public Privado(boolean deLujo) {
        this.deLujo = deLujo;
    }
    
    public Privado(boolean deLujo, String marca, String modelo, int anioFacturacion, double costo) {
        super(marca, modelo, anioFacturacion, costo);
        this.deLujo = deLujo;
    }
    

    @Override
    public double calcularPrima() {
        double prima = 0; //Valor del calculo de Prima
        prima = costo * 0.5 - (2014*1.0 - anioFabricacion*1.0)/100 * costo;    
        return prima;
    }
    
}
