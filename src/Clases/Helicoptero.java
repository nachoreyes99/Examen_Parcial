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
public class Helicoptero extends Vehiculos_aereos {
    
    private String helices, asiento;

    public Helicoptero(String helices, String asiento, String turbina, String porta_paquetes) {
        super(turbina, porta_paquetes);
        this.helices = helices;
        this.asiento = asiento;
    }

    public String getHelices() {
        return helices;
    }

    public void setHelices(String helices) {
        this.helices = helices;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

  
    
    
}
