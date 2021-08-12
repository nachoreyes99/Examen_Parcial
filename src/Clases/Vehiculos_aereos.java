/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author nacho
 */
public class Vehiculos_aereos extends Vehiculo{
    private String turbina,porta_paquetes;

    public Vehiculos_aereos(String turbina, String porta_paquetes) {
        this.turbina = turbina;
        this.porta_paquetes = porta_paquetes;
    }

    public String getTurbina() {
        return turbina;
    }

    public void setTurbina(String turbina) {
        this.turbina = turbina;
    }

    public String getPorta_paquetes() {
        return porta_paquetes;
    }

    public void setPorta_paquetes(String porta_paquetes) {
        this.porta_paquetes = porta_paquetes;
    }
    
    
}
