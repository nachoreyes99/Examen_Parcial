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
public class Avion extends Vehiculos_aereos {
    
    private String alerones, cola;

    public Avion(String alerones, String cola, String turbina, String porta_paquetes) {
        super(turbina, porta_paquetes);
        this.alerones = alerones;
        this.cola = cola;
    }

    public String getAlerones() {
        return alerones;
    }

    public void setAlerones(String alerones) {
        this.alerones = alerones;
    }

    public String getCola() {
        return cola;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }
    
    
}
