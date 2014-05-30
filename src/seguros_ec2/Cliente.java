/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seguros_ec2;

import java.util.ArrayList;

/**
 *
 * @author Darien
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private double totalPrimas;
    
    ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getTotalPrimas() {
        return totalPrimas;
    }

    public void setTotalPrimas(double totalPrimas) {
        this.totalPrimas = totalPrimas;
    }
    
    public void agregarVehiculo(Vehiculo v){
        listaVehiculos.add(v);
    }
    
    public void calcularTotalPrimas(){
        for(Vehiculo vehiculo:listaVehiculos){          
            totalPrimas = totalPrimas + vehiculo.calcularPrima();
        }
    }
    
}
