/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prima;

import seguros_ec2.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;
import seguros_ec2.Privado;
import seguros_ec2.Publico;
 
/**
 *
 * @author Darien
 */
public class TestPrima {

    public TestPrima() {
    }

    @Test
    public void cuandoEsUnCarroPublico() {
        //Publico x = new Public
        Publico publico = new Publico("PL0001", 50, "Hyundai", "XV123", 1950, 80);
        assertEquals(51.73, publico.calcularPrima(),51.73);
    }

    @Test
    public void cuandoEsUnCarroPrivado() {
        //Publico x = new Public
        Privado privado = new Privado(true, "Mercedes Benz", "XT900", 1996, 120);
        assertEquals(0.0, privado.calcularPrima(),0.0);
    }

    @Test
    public void calcularPrimaTransportePublico() {        
        Publico publico = new Publico("PL0001", 50, "Hyundai", "XV123", 1950, 500);
        System.out.println(publico.calcularPrima());
    }
    
    @Test
    public void calcularPrimaTransportePrivado(){
        Privado privado = new Privado(true, "Mercedes Benz", "XT900", 1996, 900);    
        System.out.println(privado.calcularPrima());
    }
    
    @Test
    public void calcularTotalPagar(){
        Publico publico = new Publico("PL1234", 50, "Kia", "Rio2013", 1950, 800);
        Privado privado = new Privado(true, "Audi", "R8", 1996, 1200);
        Cliente cliente = new Cliente();
        cliente.agregarVehiculo(publico);
        cliente.agregarVehiculo(privado);
        cliente.calcularTotalPrimas();
        System.out.println(cliente.getTotalPrimas());
    }
    
}
