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
public class Moto extends Vehiculos_terrestres {
    
    private String luces, intermitentes;

    public Moto(String luces, String intermitentes, String llantas, String escape, String motor, String asientos, String ventanas) {
        super(llantas, escape, motor, asientos, ventanas);
        this.luces = luces;
        this.intermitentes = intermitentes;
    }

    public String getLuces() {
        return luces;
    }

    public void setLuces(String luces) {
        this.luces = luces;
    }

    public String getIntermitentes() {
        return intermitentes;
    }

    public void setIntermitentes(String intermitentes) {
        this.intermitentes = intermitentes;
    }
    
    
}
