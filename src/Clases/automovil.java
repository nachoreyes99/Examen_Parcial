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
public class automovil extends Vehiculos_terrestres {

private String bateria, guantera;

    public automovil(String bateria, String guantera, String llantas, String escape, String motor, String asientos, String ventanas) {
        super(llantas, escape, motor, asientos, ventanas);
        this.bateria = bateria;
        this.guantera = guantera;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getGuantera() {
        return guantera;
    }

    public void setGuantera(String guantera) {
        this.guantera = guantera;
    }


    
    
}
