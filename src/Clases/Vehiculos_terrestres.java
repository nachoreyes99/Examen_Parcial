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
public class Vehiculos_terrestres extends Vehiculo {
    
    private String llantas,escape;

    public Vehiculos_terrestres(String llantas, String escape, String motor, String asientos, String ventanas) {
        super(motor, asientos, ventanas);
        this.llantas = llantas;
        this.escape = escape;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getEscape() {
        return escape;
    }

    public void setEscape(String escape) {
        this.escape = escape;
    }



   
    }
    
    
    